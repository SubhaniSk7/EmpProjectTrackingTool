$(document).ready(function() {
	var user=sessionStorage.getItem("userName")+":"+sessionStorage.getItem("userFirstName");
	 
	$("#sessionId").text(user);
	console.log(user);
					var buttonId;
					$('body').on('click','button',function() {
										
							buttonId = this.id;	
							console.log(buttonId);
							
							if(buttonId=="sessionLogout"){
								sessionStorage.removeItem("userName");
								window.location="index.jsp";
							}
							else{
								localStorage.setItem("employeeButtonId",buttonId);
								console.log(localStorage.getItem("employeeButtonId"));
								
								var string=buttonId.indexOf('A');
								console.log(string);
								
								if(string==0){
									window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/profile.jsp";
								}
								else{
									window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/projecthistory.jsp";
								}
							}
					});

});
