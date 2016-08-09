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
	<nav class="navbar navbar-default "> </nav>
	<nav class="navbar navbar-default  navbar-fixed-top" role="navigation">
	<div class="navbar-header">
		<a class="navbar-brand" href="http://www.alacriti.com">Alacriti</a>
	</div>
	<div class="container-fluid">
		<ul class="nav navbar-nav">

			<li class="active"><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/adminlogin.jsp">Home</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeelist.jsp">Employers
					List</a></li>
			<li><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/projectslist.jsp">Projects</a></li>
			<li><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/editproject.jsp">Edit Project</a></li>
			<li><a
				href="http://192.168.35.190:8080/EmpProjectTrackingTool/editemp.jsp">Edit
					Employee</a></li>
			<li><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeeassignment.jsp">Assign Project</a></li>
			<li><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/addproject.jsp">Add Project</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Contact</a></li>
			<div class="btn-group">
				<button type="button"
					class="dropdown-toggle btn btn-success navbar-btn btn-sm"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					Explore <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">

					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/projectslist.jsp">Projects
							List</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeelist.jsp">Employers
							List</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/projectdetails.jsp">Project
							Details</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/projectassignment.jsp">Assign
							Projects</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/projecthistory.jsp">Project
							History</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/profile.jsp">Profile</a></li>
					<li role="separator" class="divider"></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/editproject.jsp">Edit
							Project Details</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/editemp.jsp">Edit
							Employee Details</a></li>
					<li><a
						href="http://192.168.35.190:8080/EmpProjectTrackingTool/updateprofile.jsp">Update
							Profile</a></li>
				</ul>
			</div>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<button type="button" class="btn btn-success navbar-btn btn-sm">
				<span class="glyphicon glyphicon-ok"></span>
				<%
					out.print((String) session.getAttribute("EmpSessId"));
				%>
			</button>
			<a href="http://192.168.35.190:8080/EmployeePortal/logout"
				class="btn btn-primary btn-sm">LogOut</a>
		</ul>
	</div>

	</nav>
	<%-- <jsp:include page="loggedinheader.jsp"/> --%>
<%-- 	<jsp:include page="employeelist.jsp"/> --%>
	
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>