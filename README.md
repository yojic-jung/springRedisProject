# springRedisProject
springRedisProject

프로젝트는 스프링 시큐리티를 통해 로그인 인증 권한 관리가 되고 있습니다. 

페이지는 /login /userOnly 두 페이지만 존재하며 

/login은 모두 /userOnly는 로그인한 사용자만 접속할 수 있습니다. 

/login을 할 경우 /userOnly 페이지로 이동되며 

/userOnly 페이지에서 로그인이 풀릴 경우 /login 페이지로 이동되도록 설정이 되어있습니다.


#DB 설정
db버전 5.5.62 윈도우64비트

db 이름           : springdb
db 계정 id        : testuser
db 계정 비밀번호  : 1111
table  이름       : members
table  구조       : email, password, authority, enabeled

db와 테이블 구조는 위와 같으며 

밑에 명령어를 순서대로 실행하면 위와 같은 구조로 생성이 될 것입니다. 


#루트계정으로 접속

create database springdb default character set utf8;
grant select, insert, update, delete, create, drop on springdb.* to 'testuser'@'localhost' identified by '1111';
grant select, insert, update, delete, create, drop on springdb.* to 'testuser'@'%' identified by '1111';

testuser로 접속
mysql -u testuser -p springdb
비밀번호 : 1111
create table members (email varchar(100) not null, authority varchar(100) not null, password varchar(500) not null, enabled tinyint(1) not null);
insert into members (email, authority, password, enabled) values ('test@naver.com', 'user', '1111', 1) ;


