<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
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