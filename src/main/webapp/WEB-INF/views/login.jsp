<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>
	로그인
</h1>
<p><a href="/board">Home</a></p>
<form action="" method="post">
	<p>
		<label for="userid">아이디</label>
		<input type="text" id="userid" name="userid" required="required"/>

	</P>
	<p>
		<label for="password">비밀번호</label>
		<input class="input-pwd" type="password" id="pwd1" name="password" required="required"/>
	</P>
	
	<button type="submit" id="submit">로그인하기</button>
	<p><a href="/board/signup">회원가입하러가기</a></p>
</form>

<P>  현재시각은 ${serverTime}. </P>
</body>
</html>
