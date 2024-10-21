drop table if exists mybatisdb;
create database mybatisdb;
use mybatisdb;

create TABLE user (
    id int primary key auto_increment,
    username varchar(50),
    password varchar(50),
    gender varchar(10)
)ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

insert into user(username,password,gender) values('张军','123456','男'),('赵红','123456','女');