package com.lhcis.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

}