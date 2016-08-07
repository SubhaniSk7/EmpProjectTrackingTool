<jsp:include page="header.jsp" />
<div class="container" style="width: 100%;">
	<div class="row">
		<div
			class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
			<div class="panel panel-info">
				<div class="panel-heading text-center">
					<h3 class="panel-title ">Edit Profile</h3>
				</div>
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table table-striped table table-hover">
							<tbody>
								<tr>
									<td>Emp Id:</td>
									<td><input class="form-control" id="updateProfileEmpId"
										type="text" placeholder="AL184" disabled></td>
								</tr>
								<tr>
									<td>First Name:</td>
									<td><input id="updateProfileFirstName" name="firstName"
										type="text" placeholder="First Name"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Last Name:</td>
									<td><input id="updateProfileLastName" name="lastName"
										type="text" placeholder="Last Name"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Department:</td>
									<td id="updateProfileDepartment">Developer</td>
								</tr>
								<tr>
									<td>Designation:</td>
									<td id="updateProfileDesignation">Sr.Developer</td>
								</tr>
								<tr>
									<td>Marital Status</td>
									<td><select id="updateProfileMaritalStatus" name="maritalStatus" class="form-control">
											<option value="NA">NA</option>
											<option value="Yes">Yes</option>
											<option value="NO">No</option>
									</select></td>
								</tr>
								<tr>
									<td>Hire date:</td>
									<td><input class="form-control" id="updateProfileHiredDate"
										type="text" placeholder="17/05/2016" disabled></td>
								</tr>
								<tr>
									<td>Date of Birth</td>
									<td>
									<input id="updateProfileDOB" name="dob" type="date"
						placeholder="start date" class="form-control input-md">
<!-- 									<input class="form-control" id="disabledInput" -->
<!-- 										type="text" id="id='datetimepicker4' placeholder=" -->
<!-- 										09/06/1996" disabled> -->
										
										</td>
								</tr>
								<tr>
									<td>PF UAN No:</td>
									<td><input id="updateProfilePFNo" name="pfNo"
										type="text" placeholder="PF No"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>PAN No:</td>
									<td><input id="updateProfilePANNo" name="panNo"
										type="text" placeholder="PAN No"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Aadhar No:</td>
									<td><input id="updateProfileAadharNo" name="aadharNo"
										type="text" placeholder="Aadhar No"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Gender</td>
									<td><input class="form-control" id="updateProfileGender"
										type="text" placeholder="Male" disabled></td>
								</tr>
								<tr>
									<td>Home Address</td>
									<td><textarea id="updateProfileEmployeeAddress" name="EmployeeAddress"
										type="text" class="form-control" placeholder="Address"></textarea>
								</td>
								</tr>
								<tr>
									<td>Email</td>
									<td><input id="updateProfileEmailId" name="emailId"
										type="text" placeholder="Email Id"
										class="form-control input-md"></td>
								</tr>
								<td>Mobile No.</td>
								<td><input id="updateProfileMobileNo" name="mobileNo"
									type="text" placeholder="Mobile No"
									class="form-control input-md"></td>
								</tr>
								</tr>
								<td>Blood Group</td>
								<td><input class="form-control" id="updateProfileBloodGroup"
									type="text" placeholder="Blood Group" disabled></td>
								</tr>
								</tr>
								<td>Skills</td>
								<td><textarea id="updateProfileEmployeeSkills" name="EmployeeSkills"
										type="text" class="form-control" placeholder="Skills"></textarea>
								</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="panel-footer clearfix">

					<a href="" data-original-title="Edit this user"
						data-toggle="tooltip" type="button" class="btn btn-md btn-default">Cancel</a>
					<button id="updateProfileComplete" class="btn btn-success btn-sm">Update Complete</button>
				</div>

			</div>
		</div>
	</div>
</div>


<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/updateprofile.js"></script>

<script type="text/javascript">
	$('.flexdatalist').flexdatalist(function() {
		selectionRequired: 1;
		minLength: 1
	});

	$(".datepicker").datepicker(function() {
		format: 'yyyy-mm-dd'
	});
</script>
</body>
</html>