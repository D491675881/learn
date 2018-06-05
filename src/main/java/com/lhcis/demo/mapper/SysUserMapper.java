package com.lhcis.demo.mapper;

import com.lhcis.demo.entity.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectUserAll();
}
