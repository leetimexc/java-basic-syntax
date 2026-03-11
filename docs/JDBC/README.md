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
    