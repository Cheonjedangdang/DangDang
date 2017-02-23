<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<div class="form-inline" style="margin-bottom: 10px;">
				<label for="title-form">제목</label>  <input type="text" id="title-form" name="title" class="form-control" style="width: 90%;"/>
			</div>
			<div id="summernote"></div>
			첨부파일 <input type="text" name="file"/>
			<input type ="hidden" name="categoryId" value="${categoryId}"/>
			<input type = "button" class="btnc" value="작성완료" />
		</form>
	
	<script type="text/javascript">	
		
		$(document).ready(function() {
		  	$('#summernote').summernote({
		  		 height: 300,
		  		 minHeight: null,
		  		 maxHeight: null,
		  		 focus: true,
		  		 callbacks : {
					onImageUpload : function(files) {
						var tempForm = new FormData();
						tempForm.append('image', files[0]);
						$.ajax({
							url : '<c:url value="/uploadImage"/>',
							type : 'post',
							data : tempForm,
							contentType : false,
							processData: false,
							success : function(response){
								console.log(response.save_url);
								var url = '<c:url value="/viewImage"/>'+'/'+response.save_url;
								$('#summernote').summernote('insertImage', url, function($image){
									$image.css('width', '100%');
									$image.css('height','auto');
								});
							}
						});
					}
				}
		  	});
		  	$('.btnc').click(function(){
		  		console.log($('#summernote').summernote('code'));
		  		//$('#form').append('<input type="hidden" name="content" value="'+ $('#summernote').summernote('code')+'"/>').submit();
		  		var form_data = {
		  			title : $('input[name="title"]').val(),
		  			content : $('#summernote').summernote('code'),
		  			categoryId : ${categoryId}
		  		}
		  		
		  		$.ajax({
		  			url : '/writec',
		  			data : form_data,
		  			type : 'get',
		  			success : function(res) {
		  				location.href = '/boardList?categoryId=${categoryId}';
		  			}
		  		})
	  		});
		});

		
	</script>
	
</body>
</html>