
		$(document).ready(function(){
			$.ajax({
				url : '/dangdang/comicCategory',
				type : 'post',
				data:{},
				success : function(response){
					$.each(response.list,function(index,data){
						$('.menu2').append('<li><a href=/dangdang/boardList?categoryId='+data.boardcategoryId+'>'+data.name+'</a></li>');
		
					});
				}
			});
		});
		$(document).ready(function(){
			$.ajax({
				url : '/dangdang/gameCategory',
				type : 'post',
				data:{},
				success : function(response){
					$.each(response.list,function(index,data){
						$('.menu3').append('<li><a href=/dangdang/boardList?categoryId='+data.boardcategoryId+'>'+data.name+'</a></li>');
					
					});
				}
			});
		});
