$(document).ready(function() {

	var buttonId=localStorage.getItem("projectButtonId");
	console.log(buttonId);
	
	var projectdetails=new Array("projectDetailsProjectId","projectDetailsProjectName","projectDetailsStartDate","projectDetailsEndDate",
	                    "projectDetailsProjectManager","projectDetailsProjectDescription","projectDetailsProgress",
	                    "projectDetailsProjectSkills","projectDetailsClientName",
	                    "projectDetailsClientDetails","projectDetailsStatus");
	
	$.ajax({
		type : "GET",
		url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects/"+buttonId,
		success : function(data) {
			console.log(data);
			var i=0;
			$.each(data, function(i, item) {
				$.each(item, function(j, result) {						
						$("#"+projectdetails[i]).val(result);
						i++;
				});
			});
		}
	});
	
	$('#ProjectDetailsEditProject').on('click',function() {
			window.open("http://192.168.35.190:8080/EmpProjectTrackingTool/editproject.jsp");
//		alert();
});
	
});