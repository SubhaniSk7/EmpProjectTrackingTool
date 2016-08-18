<jsp:include page="projectslist.jsp"/>
<script>
$(document).ready(function(){
	
// 	$("#sessionId").text(sessionStorage.getItem("userName"));
var user=sessionStorage.getItem("userName")+":"+sessionStorage.getItem("userFirstName");
	 
	$("#sessionId").text(user);

	$("#sessionLogout").on('click',function(){
		sessionStorage.removeItem("userName");
		window.location="index.jsp";
	});
});
</script>