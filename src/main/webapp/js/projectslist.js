//$(document).ready(function() {
//	var res = "<tr>" + "<th>Project ID</th>"
//				+ "<th>Project Name</th>" + "<th>Start Date</th>"
//				+ "<th>End Date</th>" + "<th>Project Manager</th>"
//				+ "<th>Description</th>"
//				+ "<th>Progress</th>"
//				+ "<th>Required Skills</th>"
//				+ "<th>Client Name</th>" + "<th>Client Details</th>" +
//						"<th>Status</th>"
//				+ "</tr>";
//					
//				$.ajax({
//						type : "GET",
//						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects",
//						success : function(data) {
//							$.each(data, function(i, item) {
//								res = res + "<tr>";
//								$.each(item, function(j, result) {
//									if(j=="projectId"){
////										res=res+"<td id="+result+"><a href=http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects/"+result+' target="_blank">'+result+"</a></td><td>";
//										
//										res=res+"<td><button class='btn btn-success btn-sm' id="+result+">"+result+"</button></td><td>";
//									}
//									else{
//										res = res + result + "</td><td>";
//									}
//								});
//								res = res + "</tr>";
//							});
//							$("#projectsListTable").append(res);
//						}
//				});
//});


$(document).ready(function() {
	
			var buttonId;
			$('body').on('click','button',function() {
					
					buttonId = this.id;
					if(buttonId=="addProject"){
						console.log(buttonId);
						window.open("http://192.168.35.190:8080/EmpProjectTrackingTool/addproject.jsp");
						return false;
					}
					
					console.log(buttonId);
					if(isNaN(buttonId)){
						localStorage.setItem("projectAssignButtonId",buttonId);
						console.log(localStorage.getItem("projectAssignButtonId"));
						alert();
						window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/employeeassignment.jsp";
					}
					else{
						localStorage.setItem("projectButtonId",buttonId);
						console.log(localStorage.getItem("projectButtonId"));
						alert();
						window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/projectdetails.jsp";
					}
					
			});

});

