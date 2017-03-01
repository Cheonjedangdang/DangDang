<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<!--<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/main.js" />"></script>  -->
	 <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css"/>">
	<script type="text/javascript" src="<c:url value="/resources/js/login.js"/>"></script>
</head>
<body>
		<div class="pull-left" style="width: 73%; margin-right:10px;">
				<!-- 캐러셀 -->
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="height: 100px; margin-bottom: 10px;">
					  <!-- Indicators -->
					  <ol class="carousel-indicators">
					    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
					  </ol>
					
					  <!-- Wrapper for slides -->
					  <div class="carousel-inner" role="listbox">
					    <div class="item active">
					      <img src="<c:url value="/resources/image/banner1.jpg"/>" alt="...">
					    </div>
					    <div class="item">
					      <img src="<c:url value="/resources/image/banner2.jpg"/>" alt="...">
					    </div>
					  </div>
					
					  <!-- Controls -->
					  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
					    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					    <span class="sr-only">Previous</span>
					  </a>
					  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
					    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					    <span class="sr-only">Next</span>
					  </a>
					</div>
				<!-- 캐러셀 끝 -->
				<div class="pull-left" style="width:68%; height:250px; padding:10px; margin-bottom:10px; border-radius: 5px; background-color: #e9ecef">
					<strong>당당정보뉴스 <span style="color: #ff0000">NEW</span></strong>
					<table class="table table-striped">
							<tr><td>준비중입니다</td></tr>
						</table>
					</div>
				<div class="pull-right" style="width:30%; height:250px; padding:10px; margin-bottom:10px; border-radius: 5px; background-color: #e9ecef">
					<strong>2017년 신작랭킹</strong>
					<table class="table table-striped">
						<tr><td>준비중입니다</td></tr>
					</table>
				</div>
				<div class="pull-left" style="width:50%; height:350px; padding:10px; margin-bottom:10px; border-radius: 5px; background-color: #e9ecef">
					<h5><strong>인기게시물<span style="color: #ff0000"> HOT</span></strong> </h5>
					<table class="table table-striped table-condensed">
						<c:forEach items="${hot}" var="item" begin="0" end="8" step="1">
							<tr>
								<td>
									<span style="color: gray;">[${item.name}]</span>
								</td>
								<td><a style="text-decoration: none;" href="titleClick?boardId=${item.boardId}">${item.title} &nbsp;&nbsp;<span style="color:#0000ff">[${item.comment_cnt}]</span></a></td>
								<td>${item.nickname}</td>
							</tr>
						</c:forEach>
					</table>	
				</div>
				<div class="pull-right" style="width:49%; height:350px;padding:10px; margin-bottom:10px; border-radius:5px; background-color: #e9ecef"">
					<strong>베스트게시물 <span style="color: #0000ff">BEST</span></strong>
					<table class="table table-striped">
						<tr><td>준비중입니다</td></tr>
					</table>
				</div>
		</div>
		<div class="pull-right" style="width:25%;">
			<c:if test="${empty sessionScope.user}">
				<div style="">			
					<form class="loginForm">
						<table>
							<tr>
								<td style="padding-right: 5px;"><input type="text" placeholder="아이디" name="userId" class="userId form-control"/></td>
								<td><input type="button" value="로그인" class="loginbtn form-control" height="100%;"/></td>
							</tr>
							<tr style="padding-bottom: 5px;">
								<td style="padding-right: 5px;"><input type="password" placeholder="비밀번호" name="userPw" class="userPw form-control"/></td>
								<td><input type="checkbox"/>로그인유지</td>
							</tr>
							<tr>
								<td>
									<a href="<c:url value="/regist"/>" onclick="window.open(this.href, '회원가입','top = 50,left=100,width=600,height=650,location=yes');return false;">회원가입</a>
								</td>
								<td>
									<a href="<c:url value="/regist"/>" onclick="window.open(this.href, '회원가입','top = 50,left=100,width=600,height=650,location=yes');return false;">ID/PW찾기</a>
								</td>
							</tr>
						</table>
					</form>
				</div>
			</c:if>
			<c:if test="${not empty sessionScope.user}">
				${sessionScope.user.nickname}
				<a href="logout">로그아웃</a><br/>
			</c:if>
			<div style="height:180px; margin-top: 22px; border-radius: 5px; padding: 10px; background-color: #e9ecef">
				<strong>공지사항 / 이벤트</strong>
				<table class="table table-striped">
					<tr>
						<td><span style="color: gray">[공지]</span></td>
						<td>게시판 기능 개선 안내</td>
					</tr>
					<tr>
						<td><span style="color: gray">[공지]</span></td>
						<td>당당 기능 개선 안내</td>
					</tr>
					<tr>
						<td><span style="color: gray">[공지]</span></td>
						<td>게시글이 너무 없습니다</td>
					</tr>
				</table>
			</div>		
			<div style="height:250px; margin-bottom:5px; margin-top: 5px;">
				<img src="<c:url value="/resources/image/banner3.jpg"/>" style="width: 100%;">
			</div>

		</div>
		
		<script type="text/javascript">
			
		</script>
		
</body>
</html>
