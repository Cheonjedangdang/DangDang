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
				var list = $('.comment-list');

				$.each(response.list,function(index,data){
					list.append('<tr><td style="width:90px;" align="center"><div class="pull-left"><img src="/resources/image/profile_sample.jpg"><br><strong>'+data.nickname+'</strong></div><div class="pull-right" style="width:5px; height:142px; background-color:#dee2e6">.</div></td><td style="padding-left:10px;"><div><div class="pull-left">'+data.content+'</div></div></td><td style="width:20%;"  align="center">'+moment.utc(data.time).format('YYYY-MM-DD HH:mm:ss')+'</td></tr>')
					list.append('<tr><td><span style="color:white;">.</span></td><td> </td><td> </td><td> </td></tr>')
				});
			}
		});
	});