package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 应用程序在运行时，会自动的为该接口生成一个实现类对象（代理对象），并且会自动将该实现类对象存入IOC容器中 - 成为bean对象
public interface UserMapper {
    /**
     * 查询全部
     */
    // @Select 查询
    // @Insert 新增
    // @Update 修改
    // @Delete 删除
    @Select("select * from user")
    public List<User> findAll();

    /**
     * 根据 id 删除用户信息
     */
    @Delete("delete from user where id = #{id}")
    public Integer deleteById(int id);

    /**
     * 新增用户
     */
    @Insert("insert into user(username, password, name, age) values(#{username}, #{password}, #{name}, #{age})")
    public Integer insert(User user);

    /**
     * 修改用户信息
     */
    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id}")
    public void update(User user);

    /**
     * 根据 username 和 password 查询用户信息
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    // public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    public User findByUsernameAndPassword(String username, String password); // 基于官方骨架创建的springboot项目, @Param注解可以省略

}