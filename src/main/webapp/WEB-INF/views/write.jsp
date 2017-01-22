<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- include summernote css/js-->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.js"></script>
<title>Insert title here</title>
</head>
<body>
	

		<form action="writec" id="form">
			제목  <input type="text" name="title"/>
			<div id="summernote"></div>
			첨부파일 <input type="text" name="file"/>
			<input type ="hidden" name="categoryId" value="${categoryId}"/>
			<input type = "button" class="btnc" value="작성완료" />
		</form>
	
	<script type="text/javascript">	
		
		$(document).ready(function() {
		  	$('#summernote').summernote({
		  		 height: 300,                 // set editor height
		  		 minHeight: null,             // set minimum height of editor
		  		 maxHeight: null,             // set maximum height of editor
		  		 focus: true                  // set focus to editable area after initializing summernote
		  	});
		  	$('.btnc').click(function(){
		  		$('#form').append('<input type="hidden" name="content" value="'+ $('#summernote').summernote('code')+'"/>').submit();
	  		});
		});

		
	</script>
	
</body>
</html>