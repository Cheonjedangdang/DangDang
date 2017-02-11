<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<!--<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/main.js" />"></script>  -->
	 <link rel="stylesheet" type="text/css" href="/dangdang/resources/css/main.css">
	<script type="text/javascript" src="/dangdang/resources/js/login.js"></script>
</head>
<body>
		<div class="pull-left" style="width: 73%; margin-right:10px;">
				<div style="height:100px; border:1px solid black; margin-bottom:2px;">광고배너</div>
				<div class="pull-left" style="width:68%; height:250px; padding:10px; margin-bottom:10px; background-color:green" >당당정보뉴스new</div>
				<div class="pull-right" style="width:30%; height:250px; padding:10px; margin-bottom:10px; background-color:green">2017년 신작랭킹</div>
				<div class="pull-left" style="width:50%; height:250px; padding:10px; margin-bottom:10px; border:1px solid black">
					인기게시물 HOT
				</div>
				<div class="pull-right" style="width:49%; height:250px;padding:10px; margin-bottom:10px; background-color:green">
					베스트게시물 BEST
				</div>
		</div>
		<div class="pull-right" style="width:25%;">
			<c:if test="${empty sessionScope.user}">
				<div style="height:100px; background-color:blue;">			
					<form class="loginForm">
						<input type="text" placeholder="아이디" name="userId" class="userId"/>
						<input type="button" value="로그인" class="loginbtn"/>
						<input type="password" placeholder="비밀번호" name="userPw" class="userPw"/>
						<input type="checkbox"/>로그인유지			
					</form>
					<a href="<c:url value="/regist"/>" onclick="window.open(this.href, '회원가입','top = 50,left=100,width=600,height=650,location=yes');return false;">회원가입</a>
					<a href="<c:url value="/regist"/>" onclick="window.open(this.href, '회원가입','top = 50,left=100,width=600,height=650,location=yes');return false;">ID/PW찾기</a>
				</div>
			</c:if>
				<c:if test="${not empty sessionScope.user}">
				${sessionScope.user.nickname}
				<a href="logout">로그아웃</a><br/>
			</c:if>
			<div style="height:180px; background-color:gray;">
				<h2>공지사항/이벤트</h2>
			</div>		
			<div style="height:250px; border:1px solid black; margin-bottom:2px;">
				광고배너
			</div>
			<div class="ab">
				css 실험용
			</div>
		</div>
		
		<script type="text/javascript">
			
		</script>
		
</body>
</html>
