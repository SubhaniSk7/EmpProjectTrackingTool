$(document).ready(function() {

					var buttonId = localStorage.getItem("employeeButtonId");
					console.log(buttonId);
					
					var departments=new Array("default");
					var deptIndex=1;
					
					var designations=new Array("NA");
					var desgIndex=101;
					
					var updateProfileEmployeeDetails = new Array("updateProfileEmpId","updateProfileFirstName","updateProfileLastName",
							"updateProfileDepartment",
							"updateProfileDesignation","updateProfileDOB",
							"updateProfileGender","updateProfileMobileNo",
							"updateProfileEmployeeAddress","updateProfileBloodGroup",
							"updateProfileEmailId","updateProfilePANNo",
							"updateProfileAadharNo","updateProfilePFNo",
							"updateProfileEmployeeSkills","updateProfileMaritalStatus",
							"updateProfileHiredDate"
							);
					
					$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/departments/",
						success : function(data) {
							$.each(data, function(i, item) {
								$.each(item, function(j, result) {
									
									if(j=="departmentId")
										return;
									departments[deptIndex]=result;
									
									deptIndex++;
									
								});
							});
						}
				});
					
					$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/designations/",
						success : function(data) {
							$.each(data, function(i, item) {
								$.each(item, function(j, result) {
									
									if(j=="designationId")
										return;
									designations[desgIndex]=result;
									
									desgIndex++;
									
								});
							});
						}
				});
					
					$.ajax({
							type : "GET",
							url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/"+buttonId,
							success : function(data) {
								var i = 0;
								$.each(data, function(i, item) {
									$.each(item, function(j, result) {
										
										if(j=="serialNo" || j=="role" || j=="password" || j=="prjStatus")
											return;

										if(j=="department")
											result=departments[result];
										if(j=="designation")
											result=designations[result];
										
										if(result==null)
											result="NA";
										
										if(result=="maritalStatus")
										{
											$('select').find('option[value='+result+']').attr("selected",true);
											i++;
											return;
										}
										$("#" + updateProfileEmployeeDetails[i]).val(result);
										
										i++;
									});
								});
							}
					});
					
					
					$("#updateProfileComplete").click(function(e) {
						e.preventDefault();
											var empId = $("#updateProfileEmpId").val();
											var firstName = $("#updateProfileFirstName").val();
											var lastName = $("#updateProfileLastName").val();
											
											var department = departments.indexOf($("#updateProfileDepartment").val());
											var designation = designations.indexOf($("#updateProfileDesignation").val());
											
											var maritalStatus=$("#updateProfileMaritalStatus").val();
											var dob = $("#updateProfileDOB").val();
											var pfNo = $("#updateProfilePFNo").val();
											var panNo = $("#updateProfilePANNo").val();
											var aadhar = $("#updateProfileAadharNo").val();
											var address = $("#updateProfileEmployeeAddress").val();
											var emailId = $("#updateProfileEmailId").val();
											var mobile = $("#updateProfileMobileNo").val();
											var bloodGroup = $("#updateProfileBloodGroup").val();
											var skills = $("#updateProfileEmployeeSkills").val();

											var employer = {
													
												"employerId" : empId,
												"firstName" : firstName,
												"lastName" : lastName,
												"dateOfBirth" : dob,
												"mobileNo" : mobile,
												"address" : address,
												"bloodGroup" : bloodGroup,
												"emailId" : emailId,
												"panNo" : panNo,
												"aadharNo" : aadhar,
												"pfNo" : pfNo,
												"skills" : skills,
												"maritalStatus" : maritalStatus
											};
											$.ajax({
//													type : "POST",
													type: "PUT",
													data : JSON.stringify(employer),
													dataType : "json",
													url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/"+empId+"/update",
													contentType : "application/json",
													success : function(response,textStatus,jqXHR) {
														console.log()
														if(response.employerId===empId){
															alert("Successfully Updated.");
															window.location.reload();
														}
														else{
															alert("Not Updated..");
														}
													},
													error :function(xhr){
														alert("Something went Wrong..");
													}
											});
						});
					
});
