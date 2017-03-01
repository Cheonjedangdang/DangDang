<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<c:url value="/resources/js/login.js"/>"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 캐러셀 -->
	<div style="width: 73%;" class="pull-left">
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
	</div>
	<div class="pull-right">
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
	</div>
	<div class="clearfix"></div>
	<h1>${category.name} <small>게시판</small></h1>
	
	<table class="table table-striped">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
			<th>추천</th>
		</tr>
		<c:forEach items="${pageList}" var="item">
			<tr>
				<td>${item.boardId}</td>
				<td><a href="titleClick?boardId=${item.boardId}">${item.title}</a></td>
				<td>${item.nickname}</td>
				<td>
					${item.hit}
					<c:if test="">
						<input type="button" class="btn btn-danger" value="삭제"/>
						<input type="button" class="btn btn-primary" value="수정"/>
					</c:if>
				</td>
				<c:forEach items="${updownList}" var="ud">
					<c:if test ="${item.boardId==ud.boardId}"><c:set var = "sum" value = "${sum + ud.up}"/></c:if>
				</c:forEach>
				<td>${sum}</td>
				<c:set var = "sum" value = "0" />
			</tr>
		</c:forEach>
	</table>
	<div class="pull-right" style="width:10%">
		<form action="write">
			<input type="hidden" name="categoryId" value="${category.boardcategoryId}"/>
			<input type="submit" value="글쓰기" class="form-control"/>
		</form>
	</div>	
	<div align="center">
		<nav>
		  <ul class="pagination">
		    <li>
		      <a href="boardList?category.categoryId=${category.boardcategoryId}&pageNo=${page.endPageNo-5}" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    <c:forEach var="i" begin="${page.startPageNo}" end="${page.endPageNo}" step="1">
		    	   <li><a href="boardList?category.categoryId=${category.boardcategoryId}&pageNo=${i}">${i}</a></li>
		    </c:forEach>
		 
		    <li>
		      <a href="boardList?category.categoryId=${category.boardcategoryId}&pageNo=${page.endPageNo+1}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		</nav>
	</div>
	
	
	<div class="pull-right">
		<form action="search" class="form-inline">
			<input type="hidden" name="categoryId" value="${category.boardcategoryId}"/>
			<div class="form-group">
				<input type="text" name="searchc" value=""/>
			</div>
			<div class="form-group">
				<input type="submit" value="검색" class="form-control"/>
			</div>		
		</form>
	</div>
</body>
</html>