<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Signup</title>
</head>
<body>
<h1>
	회원가입
</h1>
<form action="" method="post">
	<p>
		<label for="userId">아이디</label>
		<input type="text" id="userId" name="userId"/>
	</P>
	<p>
		<label for="userName">이름</label>
		<input type="text" id="userName" name="userName"/>
	</P>
	<p>
		<label for="password">비밀번호</label>
		<input type="password" id="password" name="password"/>
	</P>
	<p>
		<label for="password2">비밀번호 확인</label>
		<input type="password" id="password2" name="password2"/>
	</P>
	<button type="submit">회원가입하기</button>
	<p><a href="/board/login">로그인하러가기</a></p>
</form>
<P>  현재시각은 ${serverTime}. </P>
</body>
</html>
