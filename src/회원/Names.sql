
create table Names(
	회원번호 int not null auto_increment,
	성명 varchar(10) not null,
	ID varchar(10) not null,
	PW varchar(10) not null,
	PW2 varchar(10) not null,
	연락처 varchar(20),
	주소 varchar(20),
	성별 varchar(5),
	출석횟수 varchar(5),
	등록기간 varchar(5),
	등급 varchar (5),

	primary key(회원번호)

);

drop table names;
insert Names (회원번호,성명, ID, PW,PW2) values(0,'박나래','nana1','1234','1234');
insert Names (회원번호,성명, ID, PW,PW2) values(0,'김씨','asd1','1234','1234');
insert Names (회원번호,성명, ID, PW,PW2) values(0,'이씨','mmm1','1234','1234');
insert Names (회원번호,성명, ID, PW,PW2) values(0,'보라','ddd1','1234','1234');



select * from Names;