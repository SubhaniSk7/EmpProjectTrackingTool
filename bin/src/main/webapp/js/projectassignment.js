$(document).ready(function() {
	var res = "<tr>" + "<th>Project ID</th>"
				+ "<th>Project Name</th>" + "<th>Start Date</th>"
				+ "<th>End Date</th>" + "<th>Project Manager</th>"
				+ "<th>Description</th>" + "<th>Progress</th>"
				+ "<th>Assign Employers</th>"+"<th>Remove Employers</th>"
				+ "</tr>";
					
				$.ajax({
						type : "GET",
						url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects",
						success : function(data) {
							$.each(data, function(i, item) {
								res = res + "<tr><td>";
								$.each(item, function(j, result) {
									console.log(item["projectId"]);
									if(j=="clientName" || j=="clientDetails")
									{
										res=res+"<a href='http://192.168.35.190:8080/EmpProjectTrackingTool/employeeassignment.jsp' class='btn btn-info btn-sm' id="+item["projectId"]+">Assign</a></td><td>";
									}
									else if(j=="skills")
									{
										return;
									}
									else
										res = res + result + "</td><td>";
								});
								res = res + "</tr>";
							});
							$("#projectAssignment").append(res);
						}
				});

//				$("#viewStudent").click(function(e) {
//				
//					var str = "<tr><th>Id</th><th>Name</th><th>Branch</th><th>City</th></tr>";
//					var id = $("#studentId").val();
//
//					$.ajax({
//							type : "GET",
//							url : "http://localhost:8080/StudentApp/webresources/students/"
//									+ id,
//							success : function(data) {
//							str = str + "<tr><td>";
//							var branch = data["branch"];
//							var city = data["city"];
//							var id = data["id"];
//							var name = data["name"];
//							str = str + id
//									+ "</td><td>"
//									+ name
//									 "</td><td>"
//															+ branch
//															+ "</td><td>"
//															+ city
//															+ "</td></tr>";
//													$("#table1").show();
//													$("#table1")
//															.append(str);
//												}
//											});
//									});
//
//					$("#add").click(function() {
//						$("#main").show();
//					});
//					$("#addStudent").click(function() {
//
//										var id = $("#id").val();
//										var name = $("#name").val();
//										var branch = $("#branch").val();
//										var company = $("#company").val();
//										var age = $("#age").val();
//										var city = $("#city").val();
//
//										var student = {
//											"id" : id,
//											"name" : name,
//											"Branch" : branch,
//											"company" : company,
//											"age" : age,
//											"city" : city
//										};
//										var st;
//										
//										$.ajax({
//												type : "POST",
//												data : JSON
//														.stringify(student),
//												dataType : "json",
//												url : "http://localhost:8080/StudentApp/webresources/students/",
//												contentType : "application/json",
//												success : function(data) {
//													console.log(data);
//													$("#main")
//															.text(
//																	"successfully Added");
//												}
//										});
//					});
});
