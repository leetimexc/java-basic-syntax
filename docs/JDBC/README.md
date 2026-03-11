## 基于Java程序操作数据库
JDBC是使用JAVA语言操作关系型数据库的一套API。

---

其他高级框架：
1. MyBatis 
2. MyBatis-Plus
3. Hibernate
4. Spring Data JPA

这些框架底层都是基于JDBC进行封装的。

--- 

#### 关系型数据库有哪些？
1. MySQL
2. Oracle
3. SQL Server

#### JDBC-入门程序
- 需求：基于JDBC程序，执行update语句 （update user set age = 18 where id = 1）
- 步骤：
  - 准备工作：创建一个maven项目，引入依赖；并准备数据库表user
  ```xml
    <dependency>
      <groupId>com.mysql</groupId>
      <artifactId>mysql-connector-j</artifactId>
      <version>8.0.33</version>
    </dependency>
    ```
  - 代码实现：编写JDBC程序，操作数据库
    ```java
    // 1. 注册驱动
    Class.forName("com.mysql.cj.jdbc.Driver");
    // 2. 获取连接
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = "root";
    Connection connection = DriverManager.getConnection(url, user, password);
    // 3. 获取执行sql语句对象
    Statement statement = connection.createStatement();
    // 4. 执行sql语句
    int i = statement.executeUpdate("update user set age = 18 where id = 1");
    // 5. 释放资源
    statement.close();
    connection.close();
    ```
  - 创建一个数据库 web，并在该数据库中创建user表
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
    