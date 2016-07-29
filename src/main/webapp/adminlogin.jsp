<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>RestEasy</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<script type="text/javascript" src="/js/jquery.js"></script>
</head>
<body>
<nav class="navbar navbar-default ">
</nav>
<nav class="navbar navbar-default  navbar-fixed-top" role="navigation">
	<div class="navbar-header">
      <a class="navbar-brand" href="http://www.alacriti.com">Alacriti</a>
    </div>
	<div class="container-fluid">
	    <ul class="nav navbar-nav">
	    
	      <li class="active"><a href="home.jsp">Home</a></li>
	      <li><a href="http://192.168.35.190:8080/EmpProjectTrackingTool/employeelist.jsp">Employers List</a></li>
	      <li><a href="#">Projects</a></li>
	      <li><a href="#">Edit Project</a></li>
	      <li><a href="#">Edit Employee</a></li>
	      <li><a href="#">Assign Project</a></li>
	      <li><a href="#">About</a></li>
	      <li><a href="#">Contact</a></li>
	    </ul>
	    
	     <ul class="nav navbar-nav navbar-right">
	     	<button type="button" class="btn btn-success navbar-btn btn-sm"><span class="glyphicon glyphicon-ok"></span><%out.print((String)session.getAttribute("EmpSessId")); %></button>
			<a href="http://192.168.35.190:8080/EmployeePortal/logout" class="btn btn-primary btn-sm">LogOut</a>
        </ul>
  	</div>
  	
</nav>
<%-- <jsp:include page="loggedinheader.jsp"/> --%>
<h1><%out.print((String)session.getAttribute("EmpSessId")); %></h1>
	<script type="text/javascript" src="/js/bootstrap.js"></script>
</body>
</html>