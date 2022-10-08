package com.breze.serviceimpl.portal;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.breze.entity.pojo.portal.Navbar;
import com.breze.mapper.portal.NavbarMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.breze.service.portal.NavbarService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 导航连接表 服务实现类
 * </p>
 *
 * @author leochan
 * @since 2022-10-08
 */
@DS("portal")
@Service
public class NavbarServiceImpl extends ServiceImpl<NavbarMapper, Navbar> implements NavbarService {

}
