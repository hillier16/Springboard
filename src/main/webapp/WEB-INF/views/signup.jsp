<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<title>Signup</title>
</head>
<body>
<h1>
	회원가입	
</h1>

<p><a href="/board">Home</a></p>
<form action="" method="post">
	<p>
		<label for="userid">아이디</label>
		<input type="text" id="userid" name="userid" required="required" placeholder="7~14자 이내"/>
		<button type="button" id="idCheck">아이디확인</button>
		<div class="alert alert-danger" id="no-id-alert-danger" style="color: red">아이디를 7~14자 이내로 입력하세요.</div>
		<div class="alert alert-success" id="id-alert-success" style="color: blue" >해당 아이디 사용가능.</div>
		<div class="alert alert-danger" id="id-alert-danger" style="color: red">중복된 아이디 존재.</div>
	</P>
	<p>
		<label for="userName">이름</label>
		<input type="text" id="userName" name="username" required="required"/>
	</P>
	<p>
		<label for="password">비밀번호</label>
		<input class="input-pwd" type="password" id="pwd1" name="password" required="required" />
	</P>
	<p>
		<div>
			<label for="password2">비밀번호 확인</label>
			<input class="input-pwd" type="password" id="pwd2" name="password2" required="required"/>
		</div>	
			<div class="alert alert-success" id="pw-alert-success" style="color: blue" >비밀번호가 일치합니다.</div>
			<div class="alert alert-danger" id="pw-alert-danger" style="color: red">비밀번호가 일치하지 않습니다.</div>
	</P>
	<button type="submit" id="submit">회원가입하기</button>
	<p><a href="/board/login">로그인하러가기</a></p>
</form>
<P>  현재시각은 ${serverTime}. </P>

<script type="text/javascript">
	$(function() {
	    $("#no-id-alert-danger").hide();
	    $("#id-alert-success").hide();
		$("#id-alert-danger").hide();
	    $("#idCheck").click(function(){
		    $.ajax({
		        type: 'GET',
		        data: {
		            "userid": $("#userid").val()},
		        url : "getUserById.do",
		        success : function(data) {
			        console.log(data);
			        var userid = $("#userid").val();
		            if(!userid || userid.length<7 || userid.length>14 ){
		            	$("#no-id-alert-danger").show();
		            	$("#id-alert-success").hide();
		            	$("#id-alert-danger").hide();
		            }else if(data=='0') {
			            $("#no-id-alert-danger").hide();
		            	$("#id-alert-success").show();
						$("#id-alert-danger").hide();
		            } else if (data=="1") {
		            	$("#no-id-alert-danger").hide();
		            	$("#id-alert-success").hide();
						$("#id-alert-danger").show();
		            } 
		        }
		    })
		})
	});
</script>			
<script>
	$(function(){
		$("#pw-alert-success").hide();
		$("#pw-alert-danger").hide();
		$(".input-pwd").keyup(function(){
			var pwd1=$("#pwd1").val();
			var pwd2=$("#pwd2").val();
			if(pwd1 != "" || pwd2 != ""){
				if(pwd1 == pwd2){ 
					$("#pw-alert-success").show();
					$("#pw-alert-danger").hide();
					$("#submit").removeAttr("disabled");
				}else{ 
					$("#pw-alert-success").hide();
					$("#pw-alert-danger").show();
					$("#submit").attr("disabled", "disabled"); 
					}
				} 
			}); 
		});
	</script>
</body>
</html>
