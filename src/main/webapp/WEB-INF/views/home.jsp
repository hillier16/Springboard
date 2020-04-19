<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	게시판
</h1>
<input type="button" name="Sign_up" value="회원가입" onclick="location.href='signup'" >
<input type="button" name="Login" value="로그인"  onclick="location.href='login'"> 
<P>  현재시각은 ${serverTime}. </P>
</body>
</html>
