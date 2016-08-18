<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
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


<title>EmpProjectTrakingTool</title>
</head>

<body>
	<nav class="navbar navbar-default  navbar-static-top" role="banner">
		<div class="navbar-header">
			<a class="navbar-brand" href="http://www.alacriti.com">EmpProjectTrakingTool</a>
		</div>
		<div class="container-fluid">
			<ul class="nav navbar-nav">

				<li class="active"><a
					href="http://192.168.35.190:8080/EmpProjectTrackingTool/emplogin.jsp">Home</a></li>
				<li><a
					href="http://192.168.35.190:8080/EmpProjectTrackingTool/empemployeelist.jsp">Employers
						List</a></li>
				<li><a
					href="http://192.168.35.190:8080/EmpProjectTrackingTool/empprofile.jsp">Profile</a></li>
				<li><a
					href="http://192.168.35.190:8080/EmpProjectTrackingTool/projecthistory.jsp">Project
						History</a></li>

<!-- 				<li><a -->
<!-- 					href="http://192.168.35.190:8080/EmpProjectTrackingTool/projectslist.jsp">Projects</a></li> -->
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
					<span class="glyphicon glyphicon-ok"></span> Logout
				</button>
			</ul>
		</div>
	</nav>

	<script src="js/indexLogin.js"></script>
	<script>
		$(document).ready(function() {
			$("#sessionId").text(sessionStorage.getItem("userName"));

			$("#sessionLogout").on('click', function() {
				sessionStorage.removeItem("userName");
				window.location = "index.jsp";
			});
		});
	</script>