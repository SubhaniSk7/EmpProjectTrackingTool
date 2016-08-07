<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>RestEasy</title>
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
				<li><a href="#">About</a></li>
				<li><a href="#">Contact</a></li>
			</ul>

			<form class="form-inline navbar-form navbar-right" method="post"
				action="http://192.168.35.190:8080/RestEasy/login">
				<div class="form-group">
					<input type="text" class="form-control input-sm" id="username"
						name="username" value="184" placeholder="Emp Id">
				</div>
				<div class="form-group">
					<input type="password" class="form-control input-sm" id="password"
						value="subhani" name="password" placeholder="Password">
				</div>
				<button type="submit" class="btn btn-success btn-sm">LogIn</button>
				<a href="http://192.168.35.190:8080/RestEasy/register.jsp"
					class="btn btn-primary btn-sm">Register</a>
			</form>
		</div>
	</nav>

	<div class="container"  style="width: 100%;">
		<div class="row">
			<div class="col-md-5  toppad  pull-right col-md-offset-3 ">
				<a href="updateprofile.jsp">Update Profile</a>
			</div>
			<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
				<div class="panel panel-info dashboard-cell">
					<div class="panel-heading text-center">
						<h3 class="panel-title" id="profileEmployerName" val="">Name</h3>
					</div>
					<div class="panel-body">
<!-- 						<div class="row"> -->
							<!--<div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png" class="img-circle img-responsive"> </div> -->
							<div class="table-responsive col-xs-20 col-xs-20">
								<table class="table table table-striped table table-hover">
									<tbody>
										<tr>
											<th>Emp Id:</th>
											<td id="profileEmpId">AL184</td>
										</tr>
										
										<tr>
											<th>Email</th>
											<td id="profileEmailId">subhani.shaik@alacriti.com</td>
										</tr>
										<tr>
											<th>Mobile No.</th>
											<td id="profileMobileNo">9948199100</td>
										</tr>
										
										<tr>
											<th>Department:</th>
											<td id="profileDepartment">Developement</td>
										</tr>
										<tr>
											<th>Designation:</th>
											<td id="profileDesignation">Sr.Developer</td>
										</tr>
										
										<tr>
											<th>Date of Birth</th>
											<td id="profileDOB">something</td>
										</tr>
										<tr>
											<th>Gender</th>
											<td id="profileGender">Male</td>
										</tr>
										<tr>
											<th>Blood Group</th>
											<td id="profileBloodGroup">A</td>
										</tr>
										
										<tr>
											<th>Skills</th>
											<td id="profileSkills">skills</td>
										</tr>
										
										<tr>
											<th>Hired date:</th>
											<td id="profileHireDate">17/5/2016</td>
										</tr>
										
										<tr>
											<th>Marital Status</th>
											<td id="profileMaritalStatus">No</td>
										</tr>
										<tr>
											<th>PF UAN No:</th>
											<td id="profilePfNo">xxxxxxxxxx</td>
										</tr>
										<tr>
											<th>PAN No:</th>
											<td id="profilePanNo">xxxxxxxxxx</td>
										</tr>
										<tr>
											<th>Aadhar No:</th>
											<td id="profileAadharNo">xxxxxxxxxx</td>
										</tr>
										<tr>
											<th>Home Address</th>
											<td id="profileAddress">Something</td>
										</tr>
									</tbody>
								</table>
							</div>
<!-- 						</div> -->
					</div>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/profile.js"></script>
</body>
</html>