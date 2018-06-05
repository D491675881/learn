package com.lhcis.demo.controller;

import com.lhcis.demo.entity.SysUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWord {

    @GetMapping("hello")
    public SysUser hello(){
        SysUser user = new SysUser();
        user.setId(1);
        user.setBirthday(new Date());
        return user;
    }

    @PostMapping("save")
    public boolean save(SysUser user){
        System.err.println(user.toString());

        return true;
    }
//
//    @PostMapping("save")
//    public boolean save(@RequestBody SysUser user){
//        System.err.println(user.toString());
//
//        return true;
//    }
}
