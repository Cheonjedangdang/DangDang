<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/sweetalert2/6.2.1/sweetalert2.min.css">
	<script src="https://cdn.jsdelivr.net/sweetalert2/6.2.1/sweetalert2.min.js"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/regist.js"/>"></script>
<title>회원가입</title>
</head>
<body>
	<div class="container"> 
	가입시유의사항<a href="">[클릭]</a><br/>
	<form action="sign" method="post">
		<table class="table table-striped">
			<tr>		
				<td rowspan="2" align="right">아이디</td>
				<td>
					<input type="text" class="userId" name="userId"/>
					<input type="button" value="Check ID" class="checkId"/>
				</td>
			</tr>
			<tr>
				<td>(영문,숫자로만 아이디를 작성하세요)<td>
			</tr>
			<tr>
				<td align="right">암호</td>
				<td>
					<input type="password" name="userPw" class="userPw"/> 
					확인  <input type="password" name="checkPw" class="checkPw"/>	
				</td>
			</tr>
			<tr>
				<td align="right">닉네임 </td>
				<td>
					<input type="text" name="nickname" class="nickname"/>
					<input type="button" value="Check Nickname" class="checkNickname"/>
				</td>
			</tr>
			<tr>
				<td rowspan="4" align="right">E-mail</td>
				<td>
					<input type ="text" name="email" class="email"/>
					<input type="button" value="인증코드발송"/>
					<input type="checkbox"/>공개
				</td>
			</tr>
			<tr>	
				<td>대량가입방지를 위해 네이버메일만 인증이 가능합니다.</td>
			</tr>
			<tr>	
				<td>(이메일이 도착하지 않을 경우 스팸함을 확인해 보세요)</td>
			</tr>
			<tr>	
				<td>(만약 스팸함에도 없는 경우 크롬/파이어폭스등을 사용해보세요)</td>								
			</tr>
			<tr>
				<td align="right">인증코드</td>
				<td><input type="text"/>(메일로 전송된 코드를 입력하세요.)</td>
			</tr>
			<tr>		
				<td align="right">홈페이지</td>
				<td>
					<input type ="text" name="email" class="email"/>
					<input type="checkbox"/>공개
				</td>
			</tr>
			<tr>	
				<td colspan="2" align="right">
					<input type="button" value="회원가입" class="join"/>
					<input type="button" value="닫기" class="close"/>
				</td>
			</tr>	
		</table>	
	</form>
	</div>
	
</body>
</html>