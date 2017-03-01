	
	$(document).ready(function(){
		$('.loginbtn').click(function(){
			var request_url = location.href;
			$.ajax({
				url : '/login',
				type : 'post',
				data:{userId : $('.userId').val(), userPw : $('.userPw').val()},
				success : function(response){
					if(response.result == false){
						swal('제목','로그인실패','error').then(function(){
							location.href=request_url;	
						});
					}
					else{
							location.href=request_url;	
					}
				}
			});
		});
	});

	