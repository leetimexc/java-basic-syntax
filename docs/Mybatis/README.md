### 什么是Mybatis?
MyBatis 是一款优秀的 **持久层** 框架，用于 **简化JDBC** 的开发。
- 持久层：指的是就是数据访问层(dao)，是用来操作数据库的。
- 框架：是一个半成品软件，是一套可重用的、通用的、软件基础代码模型。在框架的基础上进行软件开发更加高效、规范、通用、可拓展。
--- 
#### 什么是持久层？
web程序分为三层架构：

![img.png](img.png)

- controller：数据访问层，负责接收请求，响应数据
- service：业务逻辑层，负责处理业务逻辑
- dao：数据访问层，负责操作数据库，处理数据的增删改查

#### 如何简化JDBC？
通过Mybatis就可以大大简化原生的JDBC程序的代码编写，比如 通过 select * from user 查询所有的用户数据，通过JDBC程序操作呢，需要大量的代码实现，而如果通过Mybatis实现相同的功能，只需要简单的三四行就可以搞定。

![img_1.png](img_1.png)

---
### 快速入门
需求：使用Mybatis查询所有用户数据。
#### 使用Mybatis查询所有用户数据
- 准备工作：
  - 1.创建SpringBoot工程，引入Mybatis相关依赖
  - 2.准备数据库表user、实体类User
  - 3.配置Mybatis(在application.properties中配置数据库连接信息)
- 编写Mybatis程序：编写Mybatis的持久层接口，定义SQL（注解/XML）

#### 例子
1. 创建springboot工程，并导入 mybatis的起步依赖、mysql的驱动包、lombok。
![img_2.png](img_2.png)
![img_3.png](img_3.png)
   项目工程创建完成后，自动在pom.xml文件中，导入Mybatis依赖和MySQL驱动依赖。
![img_4.png](img_4.png)
   
2. 数据准备：创建用户表user，并创建对应的实体类User。
   - 用户表 user
     ```sql
      create table user(
      id int unsigned primary key auto_increment comment 'ID,主键',
      username varchar(20) comment '用户名',
      password varchar(32) comment '密码',
      name varchar(10) comment '姓名',
      age tinyint unsigned comment '年龄'
      ) comment '用户表';
    
      insert into user(id, username, password, name, age) values (1, 'daqiao', '123456', '大乔', 22),
                                                                 (2, 'xiaoqiao', '123456', '小乔', 18),
                                                                 (3, 'diaochan', '123456', '貂蝉', 24),
                                                                 (4, 'lvbu', '123456', '吕布', 28),
                                                                 (5, 'zhaoyun', '12345678', '赵云', 27);
     ```
    - 实体类：实体类的属性名与表中的字段名一一对应。 实体类放在 com.example.pojo 包下 user。
     ![img_5.png](img_5.png)
     ```java
     @Data
     @NoArgsConstructor
     @AllArgsConstructor
     public class User {
       private Integer id; //ID
       private String username; //用户名
       private String password; //密码
       private String name; //姓名
       private Integer age; //年龄
     }
     ```
3. 配置Mybatis

   在 application.properties 中配置数据库的连接信息。
   ```properties
    #数据库访问的url地址
    spring.datasource.url=jdbc:mysql://localhost:3306/web
    #数据库驱动类类名
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    #访问数据库-用户名
    spring.datasource.username=root
    #访问数据库-密码
    spring.datasource.password=root@1234
    ```