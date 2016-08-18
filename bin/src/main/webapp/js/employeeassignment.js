$(document).ready(function() {
	var user=sessionStorage.getItem("userName")+":"+sessionStorage.getItem("userFirstName");
	 
	$("#sessionId").text(user);
	
	var res = "<option value='";
				$("#employeeAssignmentIdDatalist").html("");
				$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/assignment",
						success : function(data) {
							$.each(data, function(i, item) {
								var emp='';
								var empid='';
								$.each(item, function(j, result) {
									if(j=='employerId')
									{
										empid=result;
										emp=emp+empid;
										console.log(empid);
									}
									if(j=='firstName')
									{
										emp=emp+" "+result;
										console.log(emp);
//										$("#employeeAssignmentIdDatalist").append("<option value='"+result+"' id='"+result+"'>"+result+"</option>");
										$("#employeeAssignmentIdDatalist").append("<option value='"+emp+"' id='"+empid+"'>"+emp+"</option>");
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
							var prj='';
							var prjid='';
							$.each(item, function(j, result) {
								if(j=='projectId')
								{
									prjid=result;
									prj=prj+prjid;
									console.log(prj);
								}
								if(j=='projectName')
								{
									prj=prj+"-"+result;
									console.log(j+" "+result);
//									$("#employeeAssignmentProjectIdDatalist").append("<option value='"+result+"' id='"+result+"'>"+result+"</option>");
									$("#employeeAssignmentProjectIdDatalist").append("<option value='"+prj+"' id='"+prjid+"'>"+prj+"</option>");
//									return false;
								}
							});
						});
					}
			});
				
				$("#employeeAssignmentComplete").click(function(e) {
					e.preventDefault();
										if($("#employeeAssignmentProjectId").val()==null || $("#employeeAssignmentProjectId").val()=='' ||
												$("#employeeAssignmentProjectStatus").val()==null || $("#employeeAssignmentProjectStatus").val()==''
												|| $("#employeeAssignmentRole").val()==null || $("#employeeAssignmentRole").val()==''
												|| $("#employeeAssignmentEffort").val()==null || $("#employeeAssignmentEffort").val()==''
												|| $("#employeeAssignmentStartDate").val()==null || $("#employeeAssignmentStartDate").val()==''
												|| $("#employeeAssignmentEndDate").val()==null || $("#employeeAssignmentEndDate").val()==''
										)
										{
											alert("please fill all the fields");
										}
										else{
											
											var projectId = $("#employeeAssignmentProjectId").val().substring(0,4);
											console.log(projectId);
	//										var projectName = $("#employeeAssignmentProjectName").val();
											var projectStatus = $("#employeeAssignmentProjectStatus").val();
											var empId = $("#employeeAssignmentEmpId").val().substring(0,6);
											console.log(empId);
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
										}
					});
				
				$("#sessionLogout").on('click',function(){
					sessionStorage.removeItem("userName");
					window.location="index.jsp";
				});
});
