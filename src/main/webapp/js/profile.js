$(document).ready(function() {

					var buttonId = localStorage.getItem("employeeButtonId");
					console.log(buttonId);
					
					var departments=new Array("default");
					var deptIndex=1;
					
					var designations=new Array("NA");
					var desgIndex=101;
					
					var employeedetails = new Array("profileEmpId","profileEmployerName",
							"profileDepartment",
							"profileDesignation","profileDOB",
							"profileGender","profileMobileNo",
							"profileAddress","profileBloodGroup",
							"profileEmailId","profilePanNo",
							"profileAadharNo","profilePfNo",
							"profileSkills","profileMaritalStatus",
							"profileHireDate");
					
					$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/departments/",
						success : function(data) {
							
							console.log(data);
							$.each(data, function(i, item) {
								$.each(item, function(j, result) {
									
									if(j=="departmentId")
										return;
									departments[deptIndex]=result;
									
									console.log(deptIndex+" "+departments[deptIndex]);
									
									deptIndex++;
									
								});
							});
						}
				});
					
					$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/designations/",
						success : function(data) {
							
							console.log(data);
							$.each(data, function(i, item) {
								$.each(item, function(j, result) {
									
									if(j=="designationId")
										return;
									designations[desgIndex]=result;
									
									console.log(desgIndex+" "+designations[desgIndex]);
									
									desgIndex++;
									
								});
							});
						}
				});
				
					console.log(departments);
					console.log(designations);
					
					$.ajax({
							type : "GET",
							url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/"+buttonId,
							success : function(data) {
								
								console.log(data);
								var i = 0;
								$.each(data, function(i, item) {
									$.each(item, function(j, result) {
										
										if(j=="serialNo" || j=="role" || j=="lastName" || j=="password")
											return;
										
//										console.log(employeedetails[i]+i);
										

										if(j=="department")
											result=departments[result];
										if(j=="designation")
											result=designations[result];
										
										if(result==null)
											result="NA";
										
										
										$("#" + employeedetails[i]).html(result);
										
										i++;
									});
								});
							}
					});
					
					
					var buttonId;
					$('body').on('click','button',function() {
										
							buttonId = this.id;
							console.log(buttonId);

							localStorage.setItem("updateProfilePage",buttonId);
							console.log(localStorage.getItem("employeeButtonId"));
							window.location = "http://192.168.35.190:8080/EmpProjectTrackingTool/updateprofile.jsp";
							
					});
					
});
