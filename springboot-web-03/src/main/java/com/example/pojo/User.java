package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/*
* 用户信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Integer id;
  private String username;
  private String password;
  private String name;
  private Integer age;
  private LocalDateTime updateTime;

  // public User(Integer id, String username, String password, String name,
  // Integer age, LocalDateTime updateTime) {
  // this.id = id;
  // this.username = username;
  // this.password = password;
  // this.name = name;
  // this.age = age;
  // this.updateTime = updateTime;
  // }
}
