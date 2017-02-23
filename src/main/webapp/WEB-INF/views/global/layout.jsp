<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
   		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      	<meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;"/>
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/sweetalert2/6.2.1/sweetalert2.min.css">
		<script src="https://cdn.jsdelivr.net/sweetalert2/6.2.1/sweetalert2.min.js"></script>
		<script type="text/javascript" src="<c:url value="/resources/js/main.js"/>"></script>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/header.css"/>">
		<script type="text/javascript" src="<c:url value="/resources/js/comment.js"/>"></script>
		<decorator:head/>
      <title><decorator:title default="당당 ~ DangDang~"/></title>
   </head>
   <body style="">
      <!-- Header -->
      <page:applyDecorator name="header"/>

      <!-- Body -->
      <div class="container">         
         <div class="clearfix">
            <decorator:body/>
         </div>
      </div>
      
      <!-- Footer -->
      <page:applyDecorator name="footer"/>      
   </body>
</html>