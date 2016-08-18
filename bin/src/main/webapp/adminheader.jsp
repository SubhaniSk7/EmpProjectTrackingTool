<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EmpProjectTrackingTool</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript"
	src="https://cdn.datatables.net/v/dt/dt-1.10.12/datatables.min.js"></script>
</head>
<body>
	<!-- 	<nav class="navbar navbar-default"> </nav> -->
	<nav class="navbar navbar-default navbar-static-top" role="navigation">
	<div class="navbar-header">
		<a class="navbar-brand" href="http://www.alacriti.com">EmpProjectTrackingTool</a>
	</div>
	<div class="container-fluid">
		<ul class="nav navbar-nav">

			<li class="active"><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/adminlogin.jsp">Home</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeelist.jsp">Employers
					List</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/projectslist.jsp">Projects</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/editproject.jsp">Edit
					Project</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/editemp.jsp">Edit
					Employee</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeeassignment.jsp">Assign
					Project</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/addproject.jsp">Add
					Project</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<button type="button" class="btn btn-success navbar-btn btn-sm"
				id="sessionId">
				<span class="glyphicon glyphicon-ok"></span>
			</button>
			<button type="button" class="btn btn-primary navbar-btn btn-sm"
				id="sessionLogout">
				<span class="glyphicon glyphicon-ok"></span>
				Logout
			</button>
		</ul>
	</div>

	</nav>
	
	
	<script src="js/indexLogin.js"></script>
	<script>
$(document).ready(function(){
	var user=sessionStorage.getItem("userName")+":"+sessionStorage.getItem("userFirstName");
	 
	$("#sessionId").text(user);

	$("#sessionLogout").on('click',function(){
		sessionStorage.removeItem("userName");
		window.location="index.jsp";
	});
});
</script>