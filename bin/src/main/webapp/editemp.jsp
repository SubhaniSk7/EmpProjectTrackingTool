<jsp:include page="adminheader.jsp" />

<div class="container" style="width: 100%;">
	<div class="row">
		<div
			class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
			<div class="panel panel-info">
				<div class="panel-heading text-center">
					<h3 class="panel-title ">Edit Employer Details</h3>
				</div>
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table table-striped table table-hover">
							<tbody>
								<tr>
									<td>Emp Id:</td>
									<td><input class="form-control" id="editEmpIdInput"
										type="text" placeholder="ALxxx"></td>
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
									<td><select id="updateProfileDepartmentSelect"
										name="department" class="form-control">

									</select></td>
								</tr>
								<tr>
									<td>Designation:</td>
									<td><select id="updateProfileDesignationSelect"
										name="designation" class="form-control">

									</select></td>
								</tr>

								<tr>
									<td>Marital Status</td>
									<td><select id="updateProfileMaritalStatus" name="gender"
										class="form-control">
											<option value="NA">Select</option>
											<option value="Married">Married</option>
											<option value="Not Married">Not Married</option>
									</select></td>
								</tr>
								<tr>
									<td>Hire date:</td>
									<td><input name="hireDate" id="editHireDateInput"
										type="date" placeholder="17/05/2016"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Date of Birth</td>
									<td><input id="updateProfileDOB" name="dob" type="date"
										placeholder="start date" class="form-control input-md">

									</td>
								</tr>
								<tr>
									<td>PF UAN No:</td>
									<td><input id="updateProfilePFNo" name="pfNo" type="text"
										placeholder="PF No" class="form-control input-md"></td>
								</tr>
								<tr>
									<td>PAN No:</td>
									<td><input id="updateProfilePANNo" name="panNo"
										type="text" placeholder="PAN No" class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Aadhar No:</td>
									<td><input id="updateProfileAadharNo" name="aadharNo"
										type="text" placeholder="Aadhar No"
										class="form-control input-md"></td>
								</tr>
								<tr>
									<td>Gender</td>
									<td><select id="editGenderInput" name="gender"
										class="form-control">
											<option value="NA">Select</option>
											<option value="Male">Male</option>
											<option value="Female">Female</option>
									</select></td>
								</tr>
								<tr>
									<td>Home Address</td>
									<td><textarea id="EmployeeAddress" name="EmployeeAddress"
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
								<td><input class="form-control"
									id="updateProfileBloodGroupInput" type="text"
									placeholder="Blood Group"></td>
								</tr>
								</tr>
								<td>Skills</td>
								<td><textarea id="EmployeeSkills" name="EmployeeSkills"
										type="text" class="form-control" placeholder="Skills"></textarea>
								</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="panel-footer clearfix  ">

					<button class="btn btn-md btn-default">Cancel</button>
					<button id="editComplete" class="btn btn-md btn-success pull-right">Complete</button>
				</div>

			</div>
		</div>
	</div>
</div>


<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/logout.js"></script>

<script type="text/javascript">
	$('.flexdatalist').flexdatalist(function() {
		selectionRequired: 1;
		minLength: 1
	});

	$(".datepicker").datepicker(function() {
		format: 'yyyy-mm-dd'
	});
</script>
<script src="js/editemp.js"></script>
</body>
</html>