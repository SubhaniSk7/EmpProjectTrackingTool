<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<%-- <style><%@ include file="css/bootstrap.css" %></style> --%>
<!-- 	<meta name="viewport" http-equiv="Content-Type" content="width=device-width, initial-scale=1" charset=UTF-8"> -->
	<title>RestEasy</title>
	
</head>

<body>
<nav class="navbar navbar-default ">
</nav>
<nav class="navbar navbar-default  navbar-fixed-top" role="banner">
	<div class="navbar-header">
      <a class="navbar-brand" href="http://www.alacriti.com">Alacriti</a>
    </div>
    <div class="container-fluid">
	    <ul class="nav navbar-nav">
	    
	      <li class="active"><a href="home.jsp">Home</a></li>
	      <li><a href="#">About</a></li>
	      <li><a href="#">Contact</a></li>
	    </ul>
	    
		<form class="form-inline navbar-form navbar-right" method="post" action="http://192.168.35.190:8080/RestEasy/login">
			<div class="form-group">
	    		<input type="text" class="form-control input-sm" id="username" name="username" value="184" placeholder="Emp Id">
	  		</div>
	  		<div class="form-group">
	    		<input type="password" class="form-control input-sm" id="password" value="subhani" name="password" placeholder="Password">
	  		</div>
	  		<button type="submit" class="btn btn-success btn-sm">LogIn</button>
	  		<a href="http://192.168.35.190:8080/EmpProjectTrackingTool/register.jsp" class="btn btn-primary btn-sm">Register</a>
		</form>
	</div>
</nav>

	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>