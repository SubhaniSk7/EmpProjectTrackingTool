$(document).ready(function() {
	var res = "<option value='";
				$("#employeeAssignmentIdDatalist").html("");
				$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/assignment",
						success : function(data) {
							$.each(data, function(i, item) {
								$.each(item, function(j, result) {
									if(j=='employerId')
									{
										console.log(result);
										$("#employeeAssignmentIdDatalist").append("<option value='"+result+"' id='"+result+"'>"+result+"</option>");
										return false;
									}
								});
							});
						}
				});
				
				$("#employeeAssignmentProjectIdDatalist").html("");
				$.ajax({
					type : "GET",
					url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects/assignmentlist",
					success : function(data) {
						$.each(data, function(i, item) {
							$.each(item, function(j, result) {
								if(j=='projectId')
								{
									console.log(result);
									$("#employeeAssignmentProjectIdDatalist").append("<option value='"+result+"' id='"+result+"'>"+result+"</option>");
									return false;
								}
							});
						});
					}
			});
				
				$("#employeeAssignmentComplete").click(function(e) {
					e.preventDefault();
										var projectId = $("#employeeAssignmentProjectId").val();
										var projectName = $("#employeeAssignmentProjectName").val();
										var projectStatus = $("#employeeAssignmentProjectStatus").val();
										var empId = $("#employeeAssignmentEmpId").val();
										var projectRole=$("#employeeAssignmentRole").val();
										var effortPercentage=$("#employeeAssignmentEffort").val();
										var startDate = $("#employeeAssignmentStartDate").val();
										var endDate = $("#employeeAssignmentEndDate").val();

										var project = {
											"projectId" : projectId,
											"employerId" : empId,
											"startDate" : startDate,
											"endDate" : endDate,
											"effortPercentage" : effortPercentage,
											"currentStatus" : projectStatus,
											"projectRole": projectRole
											
										};
										$.ajax({
												type : "POST",
												data : JSON.stringify(project),
												dataType : "json",
												url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projectassignment/assign",
												contentType : "application/json",
												success : function(response,textStatus,jqXHR) {
													console.log(response);
													console.log(textStatus);
													if(response.projectId>0){
														alert("Successfully added.");
														window.location.reload();
													}
													else{
														alert("Not added..");
													}
												},
												error :function(xhr){
													alert("Not good");
												}
										});
					});
});
