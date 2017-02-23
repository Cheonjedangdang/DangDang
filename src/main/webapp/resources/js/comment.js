	$(document).ready(function(){
		$('.btnc').click(function(){
			$.ajax({
				url : '/commentc',
				type : 'post',
				data:{boardId : $('.boardId').val(), userId : $('.userId').val(), content : $('.content').val()},
				success : function(response){
					swal('','떠라','success');
						$('.comment-list').append('<li>'+response.list.nickname+'내용:'+response.list.content+'</li>');
				}
			});
		});
		$.ajax({
			url : '/commentView',
			type : 'post',
			data:{boardId : $('.boardId').val()},
			success : function(response){
				$.each(response.list,function(index,data){
					$('.comment-list').append('<li>'+data.nickname+'내용:'+data.content+'</li>');
	
				});
			}
		});
	});