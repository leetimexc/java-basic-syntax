package com.nineshadow;

import com.nineshadow.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcTest {

    /**
     * JDBC入门程序
     */
    @Test
    public void testUpdate() throws Exception {
        // 1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. 获取数据库连接
        String url = "jdbc:mysql://localhost:3306/web01";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        // 3. 获取SQL语句执行对象
        Statement statement = connection.createStatement();

        // 4. 执行SQL
        int i = statement.executeUpdate("update user set age = 20 where id = 1"); // DML语句
        System.out.println("SQL执行完毕影响的记录数为：" + i);

        // 5. 释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void testSelect(){
        String URL = "jdbc:mysql://localhost:3306/web01";
        String USER = "root";
        String PASSWORD = "123456";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // 封装查询返回的结果

        try {
            // 1. 注册 JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 打开链接
            System.out.println("连接数据库...");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 3. 执行查询
            String sql = "select id,username,password,name,age from user where username = ? AND password = ?"; // 预编译 SQL
            statement = connection.prepareStatement(sql);
            statement.setString(1, "daqiao");
            statement.setString(2, "123456");

            resultSet = statement.executeQuery();

            // 4. 处理结果集
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        resultSet.getInt("age")
                );
                System.out.println(user); // 使用 Lombok 的 @Data 自动生成的 toString() 方法
            }
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // 5. 关闭资源
            try {
                if (resultSet != null) resultSet.close();
                if(statement != null) statement.close();
                if(connection != null) connection.close();
            } catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
