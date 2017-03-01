$(document).ready(function(){
	$.ajax({
		url : '/comicCategory',
		type : 'post',
		data:{},
		success : function(response){
			$.each(response.list,function(index,data){
				$('.menu2').append('<li><a href=/boardList?categoryId='+data.boardcategoryId+'>'+data.name+'</a></li>');

			});
		}
	});
	
	$.ajax({
		url : '/gameCategory',
		type : 'post',
		data:{},
		success : function(response){
			$.each(response.list,function(index,data){
				$('.menu3').append('<li><a href=/boardList?categoryId='+data.boardcategoryId+'>'+data.name+'</a></li>');
			
			});
		}
	});
	
	$.ajax({
		url : '/webtoonCategory',
		type : 'post',
		data:{},
		success : function(response){
			$.each(response.list,function(index,data){
				$('.menu4').append('<li><a href=/boardList?categoryId='+data.boardcategoryId+'>'+data.name+'</a></li>');
			
			});
		}
	});
});

