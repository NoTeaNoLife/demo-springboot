package com.baldyoung.demospringboot.controller;


import com.baldyoung.demospringboot.common.jo.dto.ResponseResult;
import com.baldyoung.demospringboot.service.Z_TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.baldyoung.demospringboot.common.jo.dto.ResponseResult.*;

@RestController
@RequestMapping("/")
public class Z_TestController {
    @Autowired
    private Z_TestServiceImpl z_testService;

    @GetMapping
    public ResponseResult index() {
        return success(z_testService.getCreateDBSQL());
    }

}
