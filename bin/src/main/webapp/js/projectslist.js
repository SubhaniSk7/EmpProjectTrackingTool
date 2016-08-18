$(document).ready(function() {
	var user=sessionStorage.getItem("userName")+":"+sessionStorage.getItem("userFirstName");
	 
	$("#sessionId").text(user);
	console.log(user);
			
			var buttonId;
			$('body').on('click','button',function() {
					
					buttonId = this.id;

					console.log(buttonId);
					
					if(buttonId=="addProject"){
						console.log(buttonId);
						window.open("http://192.168.35.190:8080/EmpProjectTrackingTool/addproject.jsp");
						return false;
					}
					else if(buttonId=="sessionLogout"){
						sessionStorage.removeItem("userName");
						window.location = "index.jsp";
					}
					else if(isNaN(buttonId)){
						localStorage.setItem("projectAssignButtonId",buttonId);
						console.log(localStorage.getItem("projectAssignButtonId"));
						window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/employeeassignment.jsp";
					}
					else{
						localStorage.setItem("projectButtonId",buttonId);
						console.log(localStorage.getItem("projectButtonId"));
						window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/projectdetails.jsp";
					}
					
			});

});

