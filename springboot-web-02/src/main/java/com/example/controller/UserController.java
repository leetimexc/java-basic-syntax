package com.example.controller;

import cn.hutool.core.io.IoUtil;
import cn.hutool.json.JSONConfig;
import cn.hutool.json.JSONUtil;
import com.example.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* 用户信息Controller
 */
@RestController
public class UserController {

  @RequestMapping("/list")
  public List<User> list() {
    // 1. 加载并读取user.txt文件，获取用户数据
    // InputStream in = new FileInputStream(new File("绝对路径/user.txt")); 不推荐
    InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
    ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

    // 2. 解析用户信息，封装为User对象 -> list 集合
    List<User> userList = lines.stream().map(line -> {
      String[] parts = line.split(",");
      Integer id = Integer.parseInt(parts[0]);
      String username = parts[1];
      String password = parts[2];
      String name = parts[3];
      Integer age = Integer.parseInt(parts[4]);
      LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

      return new User(id, username, password, name, age, updateTime);

    }).collect(Collectors.toList());
    // 3. 返回数据
    return userList;
  }
}
