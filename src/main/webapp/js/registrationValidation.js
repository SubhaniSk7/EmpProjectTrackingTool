var fflag, lflag, eflag, pflag, cflag, uflag;
function validateForm() {
	var firstname = document.getElementById("firstname").value;
	var lastname = document.getElementById("lastname").value;
	var email = document.getElementById("email").value;
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var confirmpassword = document.getElementById("confirmpassword").value;
	if (firstname == "" || firstname == null) {
		fflag = 1;
		document.getElementById("div1").innerHTML = "Please enter Firstname";
	} else {
		fflag = 0;
		document.getElementById("div1").innerHTML = "";
	}
	if (lastname == "" || lastname == null) {
		lflag = 1;
		document.getElementById("div2").innerHTML = "Please enter lastname";
	} else {
		lflag = 0;
		document.getElementById("div2").innerHTML = "";
	}
	if (username == "" || username == null) {
		uflag = 1;
		document.getElementById("div4").innerHTML = "Please enter UserID";
	} else {
		uflag = 0;
		document.getElementById("div4").innerHTML = "";
	}
	if (password == "" || password == null) {
		pflag = 1;
		document.getElementById("div5").innerHTML = "Please enter Password";
	} else {
		pflag = 0;
		document.getElementById("div5").innerHTML = "";
	}
	if (confirmpassword == "" || confirmpassword == null) {
		cflag = 1;
		document.getElementById("div6").innerHTML = "Please enter Password";
	} else {
		cflag = 0;
		document.getElementById("div6").innerHTML = "";
	}
	if (password != confirmpassword) {
		document.getElementById("div6").innerHTML = "Incorrect password";
		confirmpassword.focus();
	}
	if (email == "") {
		document.getElementById("div3").innerHTML = "Please enter Email";
		email.focus();
	} else {
		document.getElementById("div3").innerHTML = "";
	}
	if (email.indexOf("@", 0) < 0) {
		document.getElementById("div3").innerHTML = "Please enter valid Email";
		email.focus();
	}
	if (email.indexOf(".", 0) < 0) {
		document.getElementById("div3").innerHTML = "Please enter valid Email";
		email.focus();
	}
}
function validate() {
	if (fflag == 0 && lflag == 0 && uflag == 0 && pflag == 0 && cflag == 0)
		document.getElementById("main").innerHTML = "Successfully Registered.";
}