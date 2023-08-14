package com.breze;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * @Author Breze Team
 * @Description 清枫Breze权限一体化平台
 * @Copyright(c) 2022 , 青枫网络工作室
 */
@Log4j2
@EnableAsync // 开启基于注解的异步任务支持
@EnableCaching // 开启基于注解的缓存支持
@EnableScheduling // 开启定时任务功能
@EnableWebSocket // 开启 WebSocket 功能
@SpringBootApplication
@MapperScan("com.breze.mapper")
public class BrezeApplication {

    public static void main(String[] args) {
        // 关闭控制台中 PageHelper 的 banner
        System.setProperty("pagehelper.banner", "false");
        SpringApplication.run(BrezeApplication.class, args);
        log.info("(♥◠‿◠)ﾉﾞ  清枫Breze启动成功   ლ(´ڡ`ლ)ﾞ  \n" + "\n" +
                " .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "| |   ______     | || |  _______     | || |  _________   | || |  _________   | || |   ________   | || |  _________   | |\n" +
                "| |  |_   _ \\    | || | |_   __ \\    | || | |_   ___  |  | || | |_   ___  |  | || |  |  __   _|  | || | |_   ___  |  | |\n" +
                "| |    | |_) |   | || |   | |__) |   | || |   | |_  \\_|  | || |   | |_  \\_|  | || |  |_/  / /    | || |   | |_  \\_|  | |\n" +
                "| |    |  __'.   | || |   |  __ /    | || |   |  _|  _   | || |   |  _|  _   | || |     .'.' _   | || |   |  _|  _   | |\n" +
                "| |   _| |__) |  | || |  _| |  \\ \\_  | || |  _| |___/ |  | || |  _| |___/ |  | || |   _/ /__/ |  | || |  _| |___/ |  | |\n" +
                "| |  |_______/   | || | |____| |___| | || | |_________|  | || | |_________|  | || |  |________|  | || | |_________|  | |\n" +
                "| |              | || |              | || |              | || |              | || |              | || |              | |\n" +
                "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' \n");
    }

}
