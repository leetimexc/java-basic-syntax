package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // SpringBoot单元测试的注解 - 当前测试类中的测试方法运行时，会启动SpringBoot应用 - 启动IOC容器
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll() {
        List<User> userList = userMapper.findAll();
        userList.forEach(System.out::println);
    }

    /**
     * 测试删除用户
     */
    @Test
    public void testDeleteById() {
        // userMapper.deleteById(6);
        Integer i = userMapper.deleteById(8);
        System.out.println("执行完毕，影响的记录数：" + i);
    }

    /**
     * 测试添加用户
     */
    @Test
    public void testInsert() {
        User user = new User(null, "zhenji", "123456", "甄姬", 18);
        Integer i = userMapper.insert(user);
        System.out.println("执行完毕，影响的记录数：" + i);
    }

    /**
     * 测试修改用户
     */
    @Test
    public void testUpdate() {
        User user = new User(7, "zhenji", "1234", "甄姬", 16);
        userMapper.update(user);
    }

}
