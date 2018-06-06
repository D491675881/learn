package com.lhcis.demo.entity;

import lombok.Data;

@Data
public class JsonResult {

    private String status;

    private Object result;

    private String code;

}