package com.lhcis.demo.service.impl;

import com.lhcis.demo.entity.SysUser;
import com.lhcis.demo.mapper.SysUserMapper;
import com.lhcis.demo.service.SysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

@Resource
private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectUserAll() {
        return sysUserMapper.selectUserAll();
    }
}
