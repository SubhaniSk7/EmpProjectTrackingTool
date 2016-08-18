//$("#loginComplete").click(function(e) {
////	e.preventDefault();
//	
//	if ($("#login-password").val() == null
//			|| $("#login-password").val() == '' || $("#login-username").val()==null || $("#login-username").val()=='') {
//				alert("Please fill all the fields");
//	}
//	else {
//		var loginUsername = $("#login-username").val();
//		var loginPassword = $("#login-password").val();
//
//		var loginDetails = {
//			"userName" : loginUsername,
//			"password" : loginPassword
//		};
//		console.log(loginDetails);
//		$.ajax({
//					type : "POST",
//					data : JSON.stringify(loginDetails),
//					dataType : "json",
//					url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/login",
//					contentType : "application/json",
//					success : function(response) {
//						console.log(response);
//						alert();
////						if (response.userName === loginUsername) {
////							console.log(response.role);
////							alert(response.userName);
////							window.location.href="http://192.168.35.190:8080/EmpProjectTrackingTool/adminlogin.jsp";
////						}
////						else if(response.role == "employee"){
////							console.log(response.role);
////							alert(response.role);
////							window.location.href="http://192.168.35.190:8080/EmpProjectTrackingTool/emplogin.jsp";
////						}
////						else {
////							alert("Invalid Credentials..");
////							window.location.reload();
////						}
//					}
////					error : function(xhr) {
////						console.log(xhr);
////						alert("Something went Wrong..");
////					}
//		});
//	}
//});




$("#login-form").submit(function(event) {
						event.preventDefault();
						if($("#login-username").val()==null || $("#login-username").val()=='' || $("#login-password").val()==null
								|| $("#login-password").val()==''){
							alert("please fill fields..");
						}
						else{
										var username = $("#login-username").val();
										var password = $("#login-password").val();
										var loginData = {
												"userName": username,
											    "password":password
											    
										};
										
										$.ajax({
												type : "POST",
												data : JSON.stringify(loginData),
												dataType : "json",
												url : "http://192.168.35.190:8080/EmpProjectTrackingTool/app/login",
												contentType : "application/json",
												success : function(data,textStatus, jqXHR) {
													console.log(data);
													if(data.userName!=null){
//														window.location="adminlogin.jsp";
														
//														 sessionStorage.setItem("userId",data.userId);
														 sessionStorage.setItem("userName",data.userName);
														 sessionStorage.setItem("userRole",data.role);
														 sessionStorage.setItem("userFirstName",data.name);
														 
														 console.log(sessionStorage.getItem("userRole"));
														 console.log(sessionStorage.getItem("userName"));
														 console.log(sessionStorage.getItem("userFirstName"));
														 
														 var user=sessionStorage.getItem("userName")+":"+sessionStorage.getItem("userFirstName");
														 
														 console.log(user);
														 $("#sessionId").text(user);
														 
														 if(sessionStorage.getItem("userRole")==='admin')
															 window.location="adminlogin.jsp";
														 else if(sessionStorage.getItem("userRole")==='employee')
															 window.location="emplogin.jsp";
													}
													else{
														alert("Incorrect username or password");
													}
												}
										});
						}
					});