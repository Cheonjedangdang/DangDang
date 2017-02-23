	
	$(document).ready(function(){
		$('.loginbtn').click(function(){
			$.ajax({
				url : '/login',
				type : 'post',
				data:{userId : $('.userId').val(), userPw : $('.userPw').val()},
				success : function(response){
					if(response.result == false){
						swal('제목','로그인실패','error').then(function(){
							location.href="/home";	
						});
					}
					else{
							location.href="/home";	
					}
				}
			});
		});
	});

	