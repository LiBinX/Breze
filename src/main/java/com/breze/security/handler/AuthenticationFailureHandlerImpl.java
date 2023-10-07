package com.breze.security.handler;

import cn.hutool.json.JSONUtil;
import com.breze.common.consts.CharsetConstant;
import com.breze.common.enums.ErrorEnum;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import com.breze.common.result.Result;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Author tylt6688
 * @Date 2022/2/10 23:33
 * @Description 登录认证失败处理器
 * @Copyright(c) 2022 , 青枫网络工作室
 */

@Log4j2
@Component
public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException authenticationException) throws IOException {

        response.setContentType(CharsetConstant.JSON_TYPE);

        response.setCharacterEncoding(CharsetConstant.UTF_8);

        @Cleanup ServletOutputStream outputStream = response.getOutputStream();

        // 进行登录授权认证异常自定义结果返回
        String msg = authenticationException.getMessage();

        Result<String> result;

        if (ErrorEnum.VerifyCodeError.getErrorName().equals(msg)) {
            result = Result.createFailMessage(ErrorEnum.VerifyCodeError, msg);
        } else if (ErrorEnum.LockUser.getErrorName().equals(msg)) {
            result = Result.createFailMessage(ErrorEnum.LockUser, ErrorEnum.LockUser.getErrorName());
        } else if (ErrorEnum.ErrorUsernamePassword.getErrorName().equals(msg)) {
            result = Result.createFailMessage(ErrorEnum.ErrorUsernamePassword, ErrorEnum.ErrorUsernamePassword.getErrorName());
        } else {
            result = Result.createFailMessage(ErrorEnum.IllegalOperation, ErrorEnum.IllegalOperation.getErrorName());
        }

        outputStream.write(JSONUtil.toJsonStr(result).getBytes(StandardCharsets.UTF_8));

    }
}
