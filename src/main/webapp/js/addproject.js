$(document).ready(function() {
	
	$("#addProjectComplete").click(function(e) {
		e.preventDefault();
							var prjName = $("#addProjectName").val();
							var prjStartDate = $("#addProjectStartDate").val();
							var prjEndDate = $("#addProjectEndDate").val();
							var prjDescription=$("#addProjectDescription").val();
							var prjProgress=$("#addProjectProgress").val();
							var prjSkills = $("#addProjectSkills").val();
							var clientName = $("#addProjectClientName").val();
							var clientDetails = $("#addProjectClientDetails").val();
							var projectStatus=$("#addProjectStatus").val();

							var project = {
								"projectName" : prjName,
								"startDate" : prjStartDate,
								"endDate" : prjEndDate,
								"projectDescription" : prjDescription,
								"progress" : prjProgress,
								"skills" : prjSkills,
								"clientName" : clientName,
								"clientDetails" : clientDetails,
								"status" : projectStatus
							};
							$.ajax({
									type : "POST",
									data : JSON.stringify(project),
									dataType : "json",
									url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects/add",
									contentType : "application/json",
									success : function(response,textStatus,jqXHR) {
										if(response.projectName===prjName){
											alert("Successfully Added.");
											window.location.reload();
										}
										else{
											alert("Not Added..");
										}
									},
									error :function(xhr){
										alert("Something went Wrong..");
									}
							});
		});
	
});