<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<html>
<head>
	<title>Main</title>
</head>
<body>
<h1>
	게시판
</h1>

<P>  안녕하세요 ${login.userid}님 </P>

<input type="button" name="Logout" value="로그아웃"  onclick="location.href='logout'">
</body>
</html>
