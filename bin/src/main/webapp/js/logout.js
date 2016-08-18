
function signOut() {
    console.log(localStorage.getItem("userName"));
    localStorage.clear();

    console.log(localStorage.getItem("userName"));
    console.log("cleared");
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function () {
      console.log('User signed out.');
      
    });
    console.log(localStorage.getItem("userName"));
    window.location="http://localhost:8080/EmpProjectTrackingTool";
}