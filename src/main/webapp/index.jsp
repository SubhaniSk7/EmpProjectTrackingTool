<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<%-- <style><%@ include file="css/bootstrap.css" %></style> --%>
<!-- 	<meta name="viewport" http-equiv="Content-Type" content="width=device-width, initial-scale=1" charset=UTF-8"> -->
<title>EmpProjectTrackingTool</title>

<meta name="google-signin-client_id"
	content="785033293568-794t5nnjqgp7lutnalpulifrhc0ciftd.apps.googleusercontent.com">

</head>

<body>
	<nav class="navbar navbar-inverse "></nav>
	<nav class="navbar navbar-default  navbar-fixed-top" role="banner">
		<div class="navbar-header">
			<a class="navbar-brand" href="http://www.alacriti.com">Alacriti</a>
		</div>
		<div class="navbar-header">
			<a class="navbar-brand" href="http://www.alacriti.com">EmpProjectTrakingTool</a>
		</div>
		<div class="container-fluid">
			<ul class="nav navbar-nav">

				<li class="active"><a href="home.jsp">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Contact</a></li>
			</ul>

			<!-- 			<form class="form-inline navbar-form navbar-right" method="post" -->
			<!-- 				action="http://192.168.35.190:8080/EmpProjectTrackingTool/login"> -->
			<!-- 				<div class="form-group"> -->
			<!-- 					<input type="text" class="form-control input-sm" id="username" -->
			<!-- 						name="username" value="184" placeholder="Emp Id"> -->
			<!-- 				</div> -->
			<!-- 				<div class="form-group"> -->
			<!-- 					<input type="password" class="form-control input-sm" id="password" -->
			<!-- 						value="subhani" name="password" placeholder="Password"> -->
			<!-- 				</div> -->
			<!-- 				<button type="submit" class="btn btn-success btn-sm">LogIn</button> -->
			<!-- 				<a -->
			<!-- 					href="http://192.168.35.190:8080/EmpProjectTrackingTool/register.jsp" -->
			<!-- 					class="btn btn-primary btn-sm">Register</a> -->
			<!-- 			</form> -->

			<!-- 			<div class="g-signin2" data-onsuccess="onSignIn"> -->
			<!-- 			<a href="#" onclick="signOut();">Sign out</a> -->
			<!-- 			</div> -->


			<ul class="nav navbar-nav navbar-right">
				<button class="g-signin2" data-onsuccess="onSignIn">SignIn</button>
				<button class="btn btn-sm btn-primary" onclick="signOut()">Signout</button>
			</ul>
		</div>
	</nav>
	<script src="https://apis.google.com/js/platform.js" async defer></script>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Log In</div>
					<div
						style="float: right; font-size: 80%; position: relative; top: -10px">
						<a href="#">Forgot password?</a>
					</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<form id="loginform" class="form-horizontal" role="form">

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="login-username"
								type="text" class="form-control" name="username" value=""
								placeholder="Emp Id">
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="login-password"
								type="password" class="form-control" name="password"
								placeholder="password">
						</div>



						<div class="input-group">
							<div class="checkbox">
								<label> <input id="login-remember" type="checkbox"
									name="remember" value="1"> Remember me
								</label>
							</div>
						</div>


						<div style="margin-top: 10px" class="form-group">
							<!-- Button -->

							<div class="col-sm-12 controls">
								<a id="btn-login" href="#" class="btn btn-success">Login </a> <a
									id="btn-fblogin" href="#" class="btn btn-primary">Login
									with Google</a>

							</div>
						</div>


						<div class="form-group">
							<div class="col-md-12 control">
								<div
									style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
									Don't have an account! <a href="#"
										onClick="$('#loginbox').hide(); $('#signupbox').show()">
										Sign Up Here </a>
								</div>
							</div>
						</div>
					</form>



				</div>
			</div>
		</div>
		<div id="signupbox" style="display: none; margin-top: 50px"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign Up</div>
					<div
						style="float: right; font-size: 85%; position: relative; top: -10px">
						<a id="signinlink" href="#"
							onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign
							In</a>
					</div>
				</div>
				<div class="panel-body">
					<form id="signupform" class="form-horizontal" role="form">

						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>



						<div class="form-group">
							<label for="email" class="col-md-3 control-label">Email</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="email"
									placeholder="Email Address">
							</div>
						</div>

						<div class="form-group">
							<label for="firstname" class="col-md-3 control-label">First
								Name</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="firstname"
									placeholder="First Name">
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-md-3 control-label">Last
								Name</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="lastname"
									placeholder="Last Name">
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="col-md-3 control-label">Password</label>
							<div class="col-md-9">
								<input type="password" class="form-control" name="passwd"
									placeholder="Password">
							</div>
						</div>

						<div class="form-group">
							<label for="icode" class="col-md-3 control-label">Invitation
								Code</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="icode"
									placeholder="">
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="button" class="btn btn-info">
									<i class="icon-hand-right"></i> &nbsp Sign Up
								</button>
								<span style="margin-left: 8px;">or</span>
							</div>
						</div>

						<div style="border-top: 1px solid #999; padding-top: 20px"
							class="form-group">

							<div class="col-md-offset-3 col-md-9">
								<button id="btn-fbsignup" type="button" class="btn btn-primary">
									<i class="icon-facebook"></i>Sign Up with Facebook
								</button>
							</div>

						</div>



					</form>
				</div>
			</div>
		</div>
	</div>



	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<!-- 	<script> -->
	<!-- 	function onSignIn(googleUser) { -->
	<!-- 		var profile = googleUser.getBasicProfile(); -->

	<!-- 		console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead. -->
	<!-- 		console.log('Name: ' + profile.getName()); -->
	<!-- 		console.log('Image URL: ' + profile.getImageUrl()); -->
	<!-- 		console.log('Email: ' + profile.getEmail()); -->
	<!-- 	} -->
	<!-- 	</script> -->
</body>
</html>