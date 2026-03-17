package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}