$(document).ready(function() {
	
	$("#updateProfileDepartmentSelect").html("");
	$.ajax({
			type : "GET",
			url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/departments/",
			success : function(data) {
				$.each(data, function(i, item) {
					var deptId;
					$.each(item, function(j, result) {
						
						if(j=='departmentId'){
							deptId=result;
						}
						if(j=='departmentName')
						{
							$("#updateProfileDepartmentSelect").append("<option value='"+deptId+"' id='"+result+"'>"+result+"</option>");
							return false;
						}
					});
				});
			}
	});
	
	$("#updateProfileDesignationSelect").html("");
	$.ajax({
			type : "GET",
			url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/designations/",
			success : function(data) {
				$.each(data, function(i, item) {
					var desgId;
					$.each(item, function(j, result) {
						if(j=='designationId'){
							desgId=result;
						}
						if(j=='designationName')
						{
							$("#updateProfileDesignationSelect").append("<option value='"+desgId+"' id='"+result+"'>"+result+"</option>");
							return false;
						}
					});
				});
			}
	});
	
	$("#editEmpIdInput").on('change',function(){
		
		var editEmp=new Array("updateProfileFirstName","updateProfileLastName","updateProfileDepartmentSelect",
				"updateProfileDesignationSelect","updateProfileDOB","gender","updateProfileMobileNo","EmployeeAddress",
				"updateProfileBloodGroupInput","updateProfileEmailId","updateProfilePANNo","updateProfileAadharNo","updateProfilePFNo",
				"EmployeeSkills","updateProfileMaritalStatus");
		
		var empid=$("#editEmpIdInput").val();
		var i=0;
		$.ajax({
			type : "GET",
			url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/"+empid,
			success : function(data) {
				$.each(data, function(i, item) {
					$.each(item, function(j, result) {
						if(j=="serialNo" || j=="employerId" || j=="role" || j=="password" || j=="prjStatus")
							return;
						console.log(result);
//						if(j=="gender"){
//
//							$("#"+editEmp[i]+" option[value='"+result+"']").attr('selected', true);
//							return;
//						}
						$("#"+editEmp[i]).val(result);
						
						i++;
					});
				});
			}
	});
		
	});
	
	$("#editComplete").click(function(e) {
					e.preventDefault();
										var empId = $("#editEmpIdInput").val();
										var firstName = $("#updateProfileFirstName").val();
										var lastName = $("#updateProfileLastName").val();
										var department = $("#updateProfileDepartmentSelect").val();
										var designation = $("#updateProfileDesignationSelect").val();
										var maritalstatus = $("#updateProfileMaritalStatus").val();
										var hiredate = $("#editHireDateInput").val();
										var dob = $("#updateProfileDOB").val();
										var pfno = $("#updateProfilePFNo").val();
										var panno = $("#updateProfilePANNo").val();
										var aadhar = $("#updateProfileAadharNo").val();
										var gender = $("#editGenderInput").val();
										var address=$("#EmployeeAddress").val();
										var emailId=$("#updateProfileEmailId").val();
										var mobile = $("#updateProfileMobileNo").val();
										var bloodGp = $("#updateProfileBloodGroupInput").val();
										var skills = $("#EmployeeSkills").val();

										var project = {
											"employerId" : empId,
											"firstName" : firstName,
											"lastName" : lastName,
											"dateOfBirth" : dob,
											"mobileNo" : mobile,
											"address" : address,
											"bloodGroup" : bloodGp,
											"emailId" : emailId,
											"panNo" : panno,
											"aadharNo" : aadhar,
											"pfNo" : pfno,
											"skills" : skills,
											"maritalStatus" : maritalstatus
										};
										$.ajax({
												type : "PUT",
												data : JSON.stringify(project),
												dataType : "json",
												url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/"+empId+"/update",
												contentType : "application/json",
												success : function(response,textStatus,jqXHR) {
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
