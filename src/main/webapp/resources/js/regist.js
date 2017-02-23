		var checkId = false;
		var checkNickname = false;
		
		$(document).ready(function(){
			$('.checkId').click(function(){
				console.log('클릭');
				$.ajax({
					url : '/ajaxCheckId',
					type : 'post',
					data : { userId : $('.userId').val()},
					success : function(response){
						if(response.result==true){
							swal('','ID사용가능','success');
							checkId = true;
						}
						else{
							swal('','이미사용중인ID입니다.','error');
						}
					} 
				});
			});
			$('.checkNickname').click(function(){
				$.ajax({
					url : '/ajaxCheckNickname',
					type : 'post',
					data : { nickname : $('.nickname').val()},
					success : function(response){
						if(response.result==true){
							swal('','닉네임사용가능','success');
							checkNickname = true;
						}
						else{
							swal('','이미사용중인닉네임입니다.','error');
						}
					} 
				});
			});
			$('.join').click(function(){
				if(checkId==true&&checkNickname==true&&$('.userPw').val()==$('.checkPw').val()){
					$.ajax({
						url : '/ajaxJoin',
						type : 'post',
						data:{	userId : $('.userId').val(), 
								userPw : $('.userPw').val(),
								nickname : $('.nickname').val(),
								email : $('.email').val()},
						success : function(response){
							if(response.result == true){
								swal('','회원가입되셨습니다.','success').then(function(){
									window.close();
								});
							}							
						}
					});
				}
				else{
					swal('','ID,닉네임체크 및 비밀번호를 확인해주세요','error').then(function(){	
					});
				}
			});
				
			$('.close').click(function(){
				window.close();
			});
			
		});