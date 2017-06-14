


create table body(

회원번호 int auto_increment not null,
이름 varchar(10) not null,
키 varchar(10),
체중 varchar(10),
골격근량 varchar(10),
근육량 varchar(10),
체지방량 varchar(10),
남 varchar(10),
여 varchar(10),
BMI varchar(10),
체지방률 varchar(10),

primary key(회원번호)

);


select * from body;

update 회원번호 set join Names.회원번호 = body.회원번호