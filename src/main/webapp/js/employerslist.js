$(document).ready(function(){
	
//	$("#viewList").click(function(e){
		var res="<tr>" +
					"<th>SNo</th>" +
					"<th>Emp Id</th>" +
					"<th>First Name</th>" +
					"<th>Last Name</th>" +
					"<th>Department</th>" +
					"<th>Role</th>" +
					"<th>Designation</th>" +
					"<th>Date Of Birth</th>" +
					"<th>Gender</th>" +
					"<th>Mobile</th>" +
					"<th>Address</th>" +
					"<th>Blodd Group</th>" +
					"<th>Email Id</th>" +
					"<th>PAN</th>" +
					"<th>Aadhar</th>" +
					"<th>PF</th>" +
					"<th>Skills</th>" +
//					"<th>Password</th>" +
					"</tr>";
		$.ajax({
				type:"GET",
			  url: "http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers",
			  success: function(data){
//				  $.each(data, function(i, item) {
//					 $.each(item,function(j,result){
				  $.each(data,function(i,item){
					  res=res+"<tr><td>";
					  $.each(item,function(j,result){

							 if(j=="password")
								 return;
						 res=res+result+"</td><td>";
//						 res=res+"<tr><td>";
//						 var sno = item["serialNo"];
//						 var employerid= item["employerId"];
//						 var firstname= item["firstName"];
//						 var lastname= item["lastName"];
//						 var department=item["department"];
//						 var role=item["role"];
//						 var designation=item["designation"];
//						 var dob=item["dateOfBirth"];
//						 var gender=item["gender"];
//						 var mobileno=item["mobileNo"];
//						 var address=item["address"];
//						 var bloodgroup=item["bloodGroup"];
//						 var emailid=item["emailId"];
//						 var panno=item["panNo"];
//						 var aadharno=item["aadharNo"];
//						 var pfno=item["pfNo"];
//						 var skills=item["skills"];
//						 var password=item["password"];
//						 
//						 res=res+"<tr><td>"+sno+"</td><td>"+
//						 		employerid+"</td><td>"+
//						 		firstname+"</td><td>"+
//						 		lastname+"</td><td>"+
//						 		department+"</td><td>"+
//						 		role+"</td><td>"+
//						 		designation+"</td><td>"+
//						 		dob+"</td><td>"+gender+"</td><td>"+
//						 		mobileno+"</td><td>"+address+"</td><td>"+
//						 		lastname+"</td><td>"+lastname+"</td><td>"+
//						 		bloodgroup+"</td><td>"+emailid+"</td><td>"+panno+
//						 		"</td><td>"+aadharno+"</td><td>"+pfno+"</td><td>"+skills+"</td><td>"+password+"</td></tr>";
					 });
					  res=res+"</tr>";
					});
				  $("#employersListTable").append(res);
			  }
			});
//		});
	
	$("#viewStudent").click(function(e){
		$("#table1").empty();
		$("#table1").html("");
		var str="<tr><th>Id</th><th>Name</th><th>Branch</th><th>City</th></tr>";
		var id=$("#studentId").val();
		
		$.ajax({
				type:"GET",
				url: "http://localhost:8080/StudentApp/webresources/students/"+id,
			  success: function(data){
						 str=str+"<tr><td>";
						 var branch = data["branch"];
						 var city= data["city"];
						 var id= data["id"];
						 var name=data["name"];
						 str=str+id+"</td><td>"+name+"</td><td>"+branch+"</td><td>"+city+"</td></tr>";
						 $("#table1").show();
				  $("#table1").append(str);
			  }
			});
		}
	);
	
	
	$("#add").click(function(){
		$("#main").show();
	});
	$("#addStudent").click(function(){

		var id=$("#id").val();
		var name=$("#name").val();
		var branch=$("#branch").val();
		var company=$("#company").val();
		var age=$("#age").val();
		var city=$("#city").val();
		
		var student={"id":id,
				"name":name,
				"Branch":branch,
				"company":company,
				"age":age,
				"city":city
				};
		var st;
		$.ajax({
			type:"POST",
			data:JSON.stringify(student),
			dataType:"json",
			url: "http://localhost:8080/StudentApp/webresources/students/",
			contentType:"application/json",
			success:function(data){
				console.log(data);
				 $("#main").text("successfully Added");
			}
		  }
		);
	});
});

