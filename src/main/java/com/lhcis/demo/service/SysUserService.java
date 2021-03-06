package com.lhcis.demo.service;

import com.lhcis.demo.entity.SysUser;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
public interface SysUserService extends IService<SysUser> {

    List<SysUser> selectUserAll();

}
