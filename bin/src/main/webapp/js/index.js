function onSignIn(googleUser) {
//	alert("onsingin");
	var profile = googleUser.getBasicProfile();

	console.log('ID: ' + profile.getId()); // Do not send to your backend! Use
											// an ID token instead.
	console.log('Name: ' + profile.getName());
	console.log('Image URL: ' + profile.getImageUrl());
	console.log('Email: ' + profile.getEmail());
	console.log(googleUser.getAuthResponse().id_token);
	var id_token = googleUser.getAuthResponse().id_token;

	// var empTokenId = profile.getId();
	// var firstName = profile.getName();
	// var emailId = profile.getEmail();
	// var projectStatus="unassigned";

	var id_token = googleUser.getAuthResponse().id_token;

	$.ajax({
		type : "POST",
		data : JSON.stringify(),
		dataType : "json",
		url : "http://localhost:8080/EmpProjectTrackingTool/app/googlelogin/"
				+ id_token,
		contentType : "application/json",
		success : function(data) {
//			alert("Registered Successfully....\n UserName:"+data.firstName);
			localStorage.setItem("userName",data.emailId);
//			alert(localStorage.getItem("userName"));
			window.location="http://localhost:8080/EmpProjectTrackingTool/editemp.jsp";
		}
	});
}

function signOut() {
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function () {
      console.log('User signed out.');
    });
 }

