$(document).ready(function() {

	var buttonId=localStorage.getItem("projectButtonId");
	console.log(buttonId);
	
	var projectdetails=new Array("EditProjectDetailsProjectId","EditProjectDetailsProjectName","EditProjectDetailsStartDate",
						"EditProjectDetailsEndDate",
	                    "EditProjectDetailsProjectDescription","EditProjectDetailsProjectProgress",
	                    "EditProjectDetailsProjectSkills","EditProjectDetailsClientName",
	                    "EditProjectDetailsClientDetails","EditProjectDetailsProjectStatus");
	
	$.ajax({
		type : "GET",
		url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects/"+buttonId,
		success : function(data) {
			console.log(data);
			var i=0;
			$.each(data, function(i, item) {
				$.each(item, function(j, result) {
					if(j=="projectManager")
						return;
					$("#"+projectdetails[i]).val(result);
					i++;
				});
			});
		}
	});
	
	$("#editProjectComplete").click(function(e) {
		e.preventDefault();
							var prjId = $("#EditProjectDetailsProjectId").val();
							var prjName = $("#EditProjectDetailsProjectName").val();
							var prjStartDate = $("#EditProjectDetailsStartDate").val();
							var prjEndDate = $("#EditProjectDetailsEndDate").val();
							var prjDescription=$("#EditProjectDetailsProjectDescription").val();
							var prjProgress=$("#EditProjectDetailsProjectProgress").val();
							var prjSkills = $("#EditProjectDetailsProjectSkills").val();
							var clientName = $("#EditProjectDetailsClientName").val();
							var clientDetails = $("#EditProjectDetailsClientDetails").val();
							var projectStatus=$("#EditProjectDetailsProjectStatus").val();

							var project = {
								"projectId" : prjId,
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
									type : "PUT",
									data : JSON.stringify(project),
									dataType : "json",
									url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects/"+prjId+"/update",
									contentType : "application/json",
									success : function(response,textStatus,jqXHR) {
										if(response.projectId>0){
											alert("Successfully updated.");
											window.location.reload();
										}
										else{
											alert("Not updated..");
										}
									},
									error :function(xhr){
										alert("Something went Wrong..");
									}
							});
		});
	
});