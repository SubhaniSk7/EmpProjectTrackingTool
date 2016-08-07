<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css">
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.12/datatables.min.js"></script>


<title>EmpProjectTrakingTool</title>
</head>

<body>
	<nav class="navbar navbar-default "></nav>
	<nav class="navbar navbar-default  navbar-fixed-top" role="banner">
		<div class="navbar-header">
			<a class="navbar-brand" href="http://www.alacriti.com">Alacriti</a>
		</div>
		<div class="container-fluid">
			<ul class="nav navbar-nav">

				<li class="active"><a href="home.jsp">Home</a></li>
				<li><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeelist.jsp">Employers List</a></li>
				<li><a href="#">Projects</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Contact</a></li>
			</ul>

			<form class="form-inline navbar-form navbar-right" method="post"
				action="http://192.168.35.190:8080/RestEasy/login">
<!-- 				<div class="form-group"> -->
<!-- 					<input type="text" class="form-control input-sm" id="username" -->
<!-- 						name="username" value="184" placeholder="Emp Id"> -->
<!-- 				</div> -->
<!-- 				<div class="form-group"> -->
<!-- 					<input type="password" class="form-control input-sm" id="password" -->
<!-- 						value="subhani" name="password" placeholder="Password"> -->
<!-- 				</div> -->
				
				
<!-- 				<a href="http://192.168.35.190:8080/EmpProjectTrackingTool/logout.jsp" -->
<!-- 					class="btn btn-primary btn-sm">LogOut</a> -->

			<button type="submit" class="btn btn-primary btn-sm">LogOut</button>
			</form>
		</div>
	</nav>