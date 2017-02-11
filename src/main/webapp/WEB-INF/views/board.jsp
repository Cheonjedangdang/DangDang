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
	게시판일세
	<table class="table table-striped">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
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
			</tr>
		</c:forEach>
	</table>
	
	<nav>
	  <ul class="pagination">
	    <li>
	      <a href="boardList?categoryId=${categoryId}&pageNo=${page.endPageNo-5}" aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    <c:forEach var="i" begin="${page.startPageNo}" end="${page.endPageNo}" step="1">
	    	   <li><a href="boardList?categoryId=${categoryId}&pageNo=${i}">${i}</a></li>
	    	   <li>${page.startPageNo},${page.endPageNo}</li>
	    </c:forEach>
	 
	    <li>
	      <a href="boardList?categoryId=${categoryId}&pageNo=${page.endPageNo+1}" aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	  </ul>
	</nav>
	
	<div class="pull-right" style="width:10%">
		<form action="write">
			<input type="hidden" name="categoryId" value="${categoryId}"/>
			<input type="submit" value="글쓰기"/>
		</form>
	</div>	
</body>
</html>