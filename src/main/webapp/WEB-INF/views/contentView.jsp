<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>

<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="clearfix">
				<div class="pull-left">
					${list.title} <br/>
					${list.nickname}
				</div>
				<div class="pull-right">
					${list.time}
				</div>
			</div>
		</div>
		<div class="panel-body">
			${list.content}
		</div>
		
	</div>
	<div>
		댓글목록
		<ul class="comment-list">
		</ul>
	</div>
	<div>
		의견을 남겨주세요~<br/>
		<form>
			<textarea class="form-control content" rows="5" name="content"></textarea>
			<input type="hidden" name="boardId" class="boardId" value="${list.boardId}"/>
			<input type="hidden" name="userId" class="userId" value="${user.userId}"/>
			<div class="pull-right"><input type = "button" value="등록" class="btnc"/></div>
		</form><br/><br/>
	</div>
	
	<div align="center">
		<button type="button" class="btn btn-success">
		  <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span> 추천
		</button>
		
		<button type="button" class="btn btn-danger">
		  <span class="glyphicon glyphicon-thumbs-down" aria-hidden="true"></span> 비추
		</button>
	</div>
	
	
	<table class="table table-striped">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th></th>
		</tr>
		<c:forEach items="${boardList}" var="item">
				<tr>
					<td>${item.boardId}</td>
					<td><a href="titleClick?boardId=${item.boardId}">${item.title}</a></td>
					<td>${item.nickname}</td>
					<td><c:if test="">
						<input type="button" class="btn btn-danger" value="삭제"/>
						<input type="button" class="btn btn-primary" value="수정"/>
					</c:if></td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>