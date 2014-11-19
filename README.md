SueprRocket
Description

인테리어 시뮬레이션 프로젝트

Tech

Application Server

Java 1.8
http://www.oracle.com/technetwork/java/javase/downloads/index.html 에서 Java Platform (JDK) 8u25 다운
Spring 4.1.1
Mybatis 3.0
Database

Mysql 5.6
Joq Queue

Backup

Dev Enviroment

Java 1.8
http://www.oracle.com/technetwork/java/javase/downloads/index.html 에서 Java Platform (JDK) 8u25 다운후 설치

Tomcat 8
http://tomcat.apache.org/download-80.cgi 에서 8.0.15 버전 32-bit Windows zip (pgp, md5) 다운.

Mysql 5.6
http://dev.mysql.com/downloads/ 에서 MySQL Community Server (GPL) 5.6.21 다운후 설치
설치시 default 로 설치한다. port : 3306
현재 포트 3308로 되어 있으나 수정해서 올릴 예정임.

Spring tool suite(STS)
http://spring.io/tools/sts 에서 3.6.2 release 다운후 적당한 곳에 압축푼다.
ex) D:\dev\sts-3.6.2.RELEASE

STS 실행후 프로젝트 IMPORT 한다.
git > projuct from git > clone URI
URI 에 SuperRocket git 주소 입력. 아이디 패스워드 입력후 진행. 

소스 받은후 maven에서 라이브러리 다운받아지는 시간동안 대기.

프로젝트 우클릭후 톰캣 서버 추가.
server.xml 열어서 최하단 path="/" 로 수정.

/SuperRocket/src/main/webapp/WEB-INF/spring/root-context.xml
파일 열어서 mysql 로컬 계정 등록. 아니면 우리 AWS에 설치한 그거 연동함.

STS에서 서버 실행후 브라우저에서 http://localhost:8080 접속.
index 페이지 뜨면 끝.


Source Checkout

git clone git@github.com:SuperRockets/SuperRocket.git 
