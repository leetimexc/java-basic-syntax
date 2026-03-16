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
        Integer i = userMapper.deleteById(6);
        System.out.println("执行完毕，影响的记录数：" + i);
    }
}
