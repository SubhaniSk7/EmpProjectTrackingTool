$(document).ready(function() {
					
					// button click
					var buttonId;
					$('body').on('click','button',function() {
										
							buttonId = this.id;
							console.log(buttonId);
	
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
							
					});

});
