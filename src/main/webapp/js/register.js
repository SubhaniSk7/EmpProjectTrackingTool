$(document).ready(function() {
	
	$("#registerDepartmentSelect").html("");
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
							$("#registerDepartmentSelect").append("<option value='"+deptId+"' id='"+result+"'>"+result+"</option>");
							return false;
						}
					});
				});
			}
	});
	
	$("#registerDesignationSelect").html("");
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
							$("#registerDesignationSelect").append("<option value='"+desgId+"' id='"+result+"'>"+result+"</option>");
							return false;
						}
					});
				});
			}
	});
	
	$("#registerComplete").click(function(e) {
					e.preventDefault();
										var empId = $("#registerEmpId").val();
										var firstName = $("#registerFirstName").val();
										var lastName = $("#registerLastName").val();
										var gender = $("#registerGender").val();
										var eamilId=$("#registerEmail").val();
										var mobileNo=$("#registerMobile").val();
										var departmentId = $("#registerDepartmentSelect").val();
										var designationId = $("#registerDesignationSelect").val();
										var password = $("#registerPassword").val();
										var projectStatus="unassigned";

										var project = {
											"employerId" : empId,
											"firstName" : firstName,
											"lastName" : lastName,
											"gender" : gender,
											"emailId" : eamilId,
											"mobileNo" : mobileNo,
											"department" : departmentId,
											"designation" : designationId,
											"password" : password,
											"projectStatus" : projectStatus
										};
										$.ajax({
												type : "POST",
												data : JSON.stringify(project),
												dataType : "json",
												url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/register",
												contentType : "application/json",
												success : function(response,textStatus,jqXHR) {
													if(response.projectStatus==="unassigned"){
														alert("Successfully Registered.");
														window.location.reload();
													}
													else{
														alert("Not Registered..");
													}
												},
												error :function(xhr){
													alert("Something went Wrong..");
												}
										});
					});
});
