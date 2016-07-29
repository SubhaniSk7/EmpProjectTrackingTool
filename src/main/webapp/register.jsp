<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>RestEasy</title>
<!-- 	<link rel="stylesheet" type="text/css" href="css/bootstrap.css"> -->
	<style><%@ include file="css/bootstrap.css" %></style>
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
	      <li><a href="#">About</a></li>
	      <li><a href="#">Contact</a></li>
	      <li><a href="/profile">Profile</a></li>
	    </ul>
	    
	    <form class="form-inline navbar-form navbar-right" method="post" action="http://192.168.35.190:8080/RestEasy/login">
			<div class="form-group">
	    		<input type="text" class="form-control input-sm" id="username" name="username" value="184" placeholder="Emp Id">
	  		</div>
	  		<div class="form-group">
	    		<input type="password" class="form-control input-sm" id="password" value="subhani" name="password" placeholder="Password">
	  		</div>
	  		<button type="submit" class="btn btn-success btn-sm">LogIn</button>
		</form>
	    
  	</div>
</nav>

<div role="form">
	<form class="form-horizontal" method="post" action="http://192.168.35.190:8080/EmpProjectTrackingTool/register.jsp">
		<fieldset>	
			<legend style="text-align:center">Registration</legend>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="empId">Emp Id</label>
				<div class="col-md-4">
					<input id="empId" name="empId" type="text" placeholder="First name" class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="firstName">First Name</label>  
				<div class="col-md-4">
					<input id="firstName" name="firstName" type="text" placeholder="First name" class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="lastName">Last Name</label>  
				<div class="col-md-4">
					<input id="lastName" name="lastName" type="text" placeholder="Enter your Last name" class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="contact">Mobile no.</label>  
			  <div class="col-md-4">
			  	<input id="mobile" name="contact" type="text" placeholder="Enter your contact no." class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="email">Email</label>  
			  <div class="col-md-4">
			  <input id="email" name="email" type="text" placeholder="Enter your email id" class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="designation">Designation</label>  
				<div class="col-md-4">
					<input id="designation" name="designation" type="text" placeholder="Enter your Designation" class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="gender">Gender</label>
			  <div class="col-md-4">
			    <select id="gender" name="gender" class="form-control">
			      <option value="-1">Select</option>
			      <option value="1">Male</option>
			      <option value="2">Female</option>
			    </select>
			  </div>
			 </div>
			  
			<div class="form-group">
				<label class="col-md-4 control-label" for="empType">Employee Type</label>  
				<div class="col-md-4">
					<input id="empType" name="empType" type="text" placeholder="Enter Employee Type" class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="password">Password</label>
			  <div class="col-md-4">
			    <input id="password" name="password" type="password" placeholder="Enter a password" class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="confirmPassword">Confirm Password</label>
			  <div class="col-md-4">
			    <input id="confirmPassword" name="password" type="password" placeholder="confirm password" class="form-control input-md" required="">
			  </div>
			</div>
			
	<!-- 		<div class="form-group"> -->
	<!-- 		  <label class="col-md-4 control-label" for="blood_group">Blood Group</label> -->
	<!-- 		  <div class="col-md-4"> -->
	<!-- 		    <select id="blood_group" name="blood_group" class="form-control"> -->
	<!-- 		      <option value="-1">Select</option> -->
	<!-- 		      <option value="1">A+</option> -->
	<!-- 		      <option value="2">B+</option> -->
	<!-- 		      <option value="3">AB+</option> -->
	<!-- 		      <option value="4">O+</option> -->
	<!-- 		      <option value="5">A-</option> -->
	<!-- 		      <option value="6">B-</option> -->
	<!-- 		      <option value="7">AB-</option> -->
	<!-- 		      <option value="8">O-</option> -->
	<!-- 		    </select> -->
	<!-- 		  </div> -->
	<!-- 		</div> -->
			
	<!-- 		<div class="form-group"> -->
	<!-- 		  <label class="col-md-4 control-label" for="street">Street</label>   -->
	<!-- 		  <div class="col-md-4"> -->
	<!-- 		  <input id="street" name="street" type="text" placeholder="Enter your street" class="form-control input-md" required=""> -->
			    
	<!-- 		  </div> -->
	<!-- 		</div> -->
			
	<!-- 		<div class="form-group"> -->
	<!-- 		  <label class="col-md-4 control-label" for="area">Area</label>   -->
	<!-- 		  <div class="col-md-4"> -->
	<!-- 		  <input id="area" name="area" type="text" placeholder="Enter your area" class="form-control input-md" required=""> -->
			    
	<!-- 		  </div> -->
	<!-- 		</div> -->
			
	<!-- 		<div class="form-group"> -->
	<!-- 		  <label class="col-md-4 control-label" for="city">City</label>   -->
	<!-- 		  <div class="col-md-4"> -->
	<!-- 		  <input id="city" name="city" type="text" placeholder="Enter your city" class="form-control input-md" required=""> -->
			    
	<!-- 		  </div> -->
	<!-- 		</div> -->
			
	<!-- 		<div class="form-group"> -->
	<!-- 		  <label class="col-md-4 control-label" for="dist">District</label>   -->
	<!-- 		  <div class="col-md-4"> -->
	<!-- 		  <input id="dist" name="dist" type="text" placeholder="Enter your district" class="form-control input-md" required=""> -->
			    
	<!-- 		  </div> -->
	<!-- 		</div> -->
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="signup"></label>
			  <div class="col-md-4 span4 offset4 text-center">
			  
			    <a href="http://192.168.35.190:8080/RestEasy/index.jsp" class="btn btn-default btn-sm">Cancel</a>
	
			    <button id="signup" type="submit" name="signup" class="btn btn-success" onclick="validate()">Register</button>
			  </div>
			</div>
			
		</fieldset>
	</form>
</div>
	<script type="text/javascript"></script>
	<script type="text/javascript" src="/js/bootstrap.js"></script>
</body>
</html>