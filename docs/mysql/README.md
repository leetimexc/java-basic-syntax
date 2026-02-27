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
### 表操作-字段类型
数据类型主要分为三类：数值类型、字符串类型、日期时间类型。
- 数值类型
<img width="875" height="346" alt="数值类型" src="https://github.com/user-attachments/assets/89553e06-a54f-4374-ae73-0ad9769cc319" />

- 字符串类型
<img width="428" height="227" alt="字符串类型" src="https://github.com/user-attachments/assets/42ff9b6e-ea58-4708-af25-e5e08c8129f8" />

- 字符串类型怎么选
<img width="491" height="168" alt="字符串使用情况" src="https://github.com/user-attachments/assets/7f3166ba-e03c-4f68-b2e4-88508e020ae5" />

- 日期时间类型
<img width="872" height="342" alt="日期时间类型" src="https://github.com/user-attachments/assets/cd48f05f-e612-4e89-9248-5ece14f8f006" />

**小结**
1. 数值类型在定义的时候，后面加了unsigned关键字是什么意思？
   - unsigned表示无符号类型，表示只能取0及正数
   - 不加默认是signed，表示可以取负数
2. char与varchar的区别是什么？什么时候用char，什么时候用varchar?
   - char是定长字符串，varchar是变长字符串
   - 如果一个字段的长度是固定的，建议使用char；如：身份证号、手机号
   - 如果一个字符的长度不是固定的，建议使用varchar；如：用户名、姓名

### 表操作-设计表案例
| 字段名称     | 必填/选填               | 类型      | 长度限制      | 输入限制      | 是否唯一 |
|----------|--------------------|-------------|-------------|-------------|-------------|
| 用户名 | 必填 | 输入框    | 2-20    | 字母    | 是    |
| 姓名 | 必填 | 输入框    | 2-10    | 汉字    | 否    |
| 性别 | 必填 | 下拉框    | -    | 选择 男/女    | 否    |
| 手机号 | 必填 | 输入框    | 11    | 数字，长度固定11位    | 是    |
| 职位 | 选填 | 下拉框    | -    | 选择 办主任/讲师/学工主管/教研主管/咨询师    | 否    |
| 薪资 | 选填 | 输入框    | -    | 数字    | 否    |
| 头像 | 选填 | 图片上传    | -    | 图片大小不能超过2M    | 否    |
| 入职日期 | 选填 | 日期选择组件    | -    | 输入格式 年-月-日    | 否    |

```
-- 案例：设计员工表 emp
-- 基础字段：id 主键；create_time 创建时间；update_time 修改时间；
create table emp(
    id int unsigned primary key auto_increment comment 'ID,主键',
    username varchar(20) not null unique comment '用户名',
    password varchar(32) default '123456' comment '密码',
    name varchar(10) not null comment '姓名',
    gender tinyint unsigned not null comment '性别,1 男; 2 女',
    phone char(11) not null unique comment '手机号',
    job tinyint unsigned comment '职位, 1 班主任; 2 讲师; 3 学工主管; 5 咨询师',
    salary int unsigned comment '薪资',
    entry_date date comment '入职日期',
    image varchar(255) comment '图像',
    create_time datetime comment '创建时间',
    update_time datetime comment '修改时间'
) comment '员工表';
```
**步骤**
1. 阅读并分析页面原型及需求
2. 分析表中包含哪些字段，以及字段的类型、约束
3. 创建表结构 *（添加基础字段id、create_time、update_time）*

### DDL表操作-查询-修改-删除
```
show tables; -- 查询当前数据库的所有表
desc 表名;   -- 查询表结构
show create table 表名;  -- 查询建表语句

alter table 表名 add 字段名。类型(长度) [comment 注释] [约束];  -- 添加字段
alter table 表名 modify 字段名 新数据类型(长度);  -- 修改字端类型
alter table 表名 change 旧字段名 新字段名 类型(长度) [comment 注释] [约束]; -- 修改字段名与字段类型
alter table 表名 drop column 字段名; -- 删除字段
alter table 表名 rename to 新表名; -- 修改表名

drop table [if exists] 表名； -- 删除表
```
### DML 对数据库中表的数据记录进行增、删、改操作

- 添加数据（INSERT）
  ```
  -- 指定字段添加数据
  insert into 表名(字段名1，字段名2) values (值1，值2);

  -- 全部字段添加数据
  insert into 表名 values (值1,值2, ...);
  
  -- 批量添加数据（指定字段）
  insert into 表名 (字段名1，字段名2) values (值1,值2),(值1,值2);

  -- 批量添加数据（全部字段）
  insert into 表名 values (值1,值2,...),(值1,值2,...);
  ```
- 修改数据（UPDATE）
  ```
  -- 修改数据
  update 表名 set 字段名1 = 值1,字段名2 = 值2, ... [where 条件];
  ```
- 删除数据（DELETE）
  ```
  -- 删除数据
  delete from 表名 [where 删除条件];
  ```
### DQL 对数据库中表的数据记录进行查操作
  ```
  - 完整的DQL语句语法：
  
  1.基本查询部分
  select 字段列表 
  from 表名列表
  
  2.条件查询
  where 条件列表
  
  3.分组查询
  group by 分组字段列表
  having 分组后条件列表
  
  4.排序查询
  order by 排序字段列表
  
  5.分页查询
  limit 分页参数
  ```
- 基本查询
  ```
  -- 查询多个字段
  select 字段1，字段2，字段3 from 表名;
  
  -- 查询所有字段（通配符）
  select * from 表名;
  
  -- 为查询字段设置别名，as关键字可以省略
  select 字段1 [as 别名1]，字段2 [as 别名2] from 表名;
  
  -- 去除重复记录
  select distinct 字段列表 from 表名;
  ```
 条件查询
  ```
  -- 条件查询
  select 字段列表 from 表名 where 条件列表;
  ```
  | 比较运算符              | 功能                   |
  |--------------------|----------------------|
  | \>                 | 大于                   |
  | \>=                | 大于等于                 |
  | \<                 | 小于                   |
  | \<=                | 小于等于                 |
  | \=                 | 等于                   |
  | \<> 或 !=           | 不等于                  |
  | between ... and ... | 在某个范围之内（含最小、最大值）     |
  | in(...)            | 在in之后的列表中的值，多选一      |
  | like 占位符           | 模糊匹配（_匹配单个字符，%匹配任意个字符） |
  | is null            | 匹配NULL值               |

| 逻辑运算符     | 功能          |
  |-----------|-------------|
| and 或 &&  | 并且（多个条件同时成立） |
| or 或 ｜｜             | 或者（多个条件任意一个成立） |
| not 或 !   | 非，不是        |

- 分组查询
  
  | 分组查询              | 功能                   |
  |--------------------|----------------------|
  | 分组                 | 描述介绍                   |
  
- 排序查询&分页查询
  
  | 排序查询&分页查询查询              | 功能                   |
  |--------------------|----------------------|
  | 分组1                 | 描述介绍                   |
## JDBC描述
