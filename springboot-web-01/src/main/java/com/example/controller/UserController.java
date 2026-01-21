package com.example.controller;

import cn.hutool.core.io.IoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*
* 用户信息Controller
 */
@RestController
public class UserController {

    @RequestMapping("/list")
    public String list() throws FileNotFoundException {
        // 1. 加载并读取user.txt文件，获取用户数据
        // InputStream in = new FileInputStream(new File("绝对路径/user.txt")); 不推荐
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

        // 2. 解析用户信息，封装为User对象 -> list 集合
        // 3. 返回数据
    }
}
