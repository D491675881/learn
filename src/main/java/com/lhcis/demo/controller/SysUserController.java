package com.lhcis.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.lhcis.demo.entity.SysUser;
import com.lhcis.demo.service.SysUserService;
import io.netty.handler.codec.json.JsonObjectDecoder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author duany
 * @since 2018-06-03
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 分页page
     */
    @GetMapping("test")
    public Page<SysUser> test() {
        Page<SysUser> sysUserPage = sysUserService.selectPage(new Page<>(2, 3));
        return sysUserPage;
    }

    @PostMapping("add")
    public Object add() {
        SysUser sysUser = new SysUser() {
            {
                setBirthday(new Date());
                setCreatetime(new Date());
                setEmail("491675881@qq.com");
                setName("duany");
                setPassword("1233456");

            }
        };

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result",sysUserService.insert(sysUser));
        return jsonObject;

    }

    @GetMapping("selectAll")
    public List<SysUser> selectUserAll() {
        return sysUserService.selectUserAll();
    }

}

