### 连接本地数据库
`mysql -uroot -p****`

### 连接远程数据库
`mysql -h192.168.1.1 -P8080 -uroot -p****`

### 创建表
```
    create table tableUser(
        id int comment 'ID,唯一标识',
        username varchar(50) comment '用户名',
        name varchar(10) comment '姓名',
        age int comment '年龄',
        gender char(1) comment '性别'
    ) comment '用户信息表';
```

当前可以创建多个id相同的数据，所以需要约束

### 约束
| 约束     | 描述               | 关键字      |
|----------|--------------------|-------------|
| 非空约束 | 限制该字段值不能为null | not null    |
| 唯一约束 | 保证字段的所有数据都是唯一、不重复的    | unique      |
| 主键约束 | 主键是一行数据的唯一标识，要求非空且唯一 | primary key |
| 默认约束 | 保存数据时，如果未指定该字段值，则采用默认值    | default     |
| 外键约束 | 让两张表的数据建立连接，保证数据的一致性和完整性 | foreign key |

### 带要约束的表创建
```
create table tb_user (
    id int primary key comment 'ID,唯一标识', 
    username varchar(20) not null unique comment '用户名',
    name varchar(10) not null comment '姓名',
    age int comment '年龄',
    gender char(1) default '男' comment '性别'
) comment '用户表';
```
当前ID相对麻烦，需要每次添加的时候手动维护。

### 自增
`auto_increment`
```
create table tb_user (
    id int primary key auto_increment comment 'ID,唯一标识，在primary key后面输入auto_increment', 
    username varchar(20) not null unique comment '用户名',
    name varchar(10) not null comment '姓名',
    age int comment '年龄',
    gender char(1) default '男' comment '性别'
) comment '用户表';
```
### 数据库字段类型
数据类型主要分为三类：数值类型、字符串类型、日期时间类型。

<img width="875" height="346" alt="数值类型" src="https://github.com/user-attachments/assets/89553e06-a54f-4374-ae73-0ad9769cc319" />


  
