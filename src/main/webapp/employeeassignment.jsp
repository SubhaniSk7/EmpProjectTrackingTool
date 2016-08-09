<jsp:include page="adminheader.jsp" />

<div role="form" id="EmployeeAssignment">

	<form class="form-horizontal" method="POST">
		<fieldset>
			<legend style="text-align: center">Employee Assignment</legend>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="employeeAssignmentProjectId">Project Id</label>
				<div class="col-md-4">
					<input id="employeeAssignmentProjectId" name="projectId"
						type="text" placeholder="Project Id" class="form-control input-md"
						multiple='multiple' list="employeeAssignmentProjectIdDatalist"
						autocomplete="on" required>
					<datalist id="employeeAssignmentProjectIdDatalist">

					</datalist>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="employeeAssignmentProjectName">Project Name</label>
				<div class="col-md-4">
					<input id="employeeAssignmentProjectName" name="projectName"
						type="text" placeholder="project name"
						class="form-control input-md" required>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="employeeAssignmentProjectManager">Employee Project Status</label>
				<div class="col-md-4">
					<select id="employeeAssignmentProjectStatus" name="employeeAssignmentProjectStatus"
						class="form-control">
						<option value="Live">Live</option>
						<option value="Removed">Removed</option>
						<option value="Hold">Hold</option>
						<option value="Completed">Completed</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="employeeAssignmentEmpId">Employer
					Id </label>
				<div class="col-md-4">
					<input id="employeeAssignmentEmpId" name="EmpId" type="text"
						placeholder="ALxxx" class="form-control input-md flexdatalist"
						list='employeeAssignmentIdDatalist' multiple='multiple'
						autocomplete="on" required>

					<datalist id="employeeAssignmentIdDatalist">

					</datalist>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="employeeAssignmentRole">Project
					Role</label>
				<div class="col-md-4">
					<select id="employeeAssignmentRole" name="projectAssignmentRole"
						class="form-control">
						<option value="Project Manager">Project Manager</option>
						<option value="Developer">Developer</option>
						<option value="DB">DB</option>
						<option value="Support">Support</option>
						<option value="Testing">Testing</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="employeeAssignmentEffort">Effort
					percentage</label>
				<div class="col-md-4">
					<select id="employeeAssignmentEffort"
						name="employeeAssignmentEffort" class="form-control">
						<option value="25">25</option>
						<option value="50">50</option>
						<option value="75">75</option>
						<option value="100">100</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="employeeAssignmentStartDate">Start date</label>
				<div class="col-md-4 datepicker">
					<input id="employeeAssignmentStartDate" name="startDate"
						type="date" placeholder="start date" class="form-control input-md">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="employeeAssignmentEndDate">End date</label>
				<div class="col-md-4 datepicker">
					<input id="employeeAssignmentEndDate" name="endDate" type="date"
						placeholder="end date" class="form-control input-md">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="employeeAssignmentComplete"></label>
				<div class="col-md-4 span4 offset4 text-center">
					<button id="employeeAssignmentComplete" type="submit"
						name="employeeAssignmentComplete" class="btn btn-primary">Complete</button>
				</div>
			</div>

		</fieldset>
	</form>
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>

<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="js/employeeassignment.js"></script>

<script type="text/javascript" src="js/datalistValidation.js"></script>

<script type="text/javascript">
    $("#employeeAssignmentEndDate").on('select',function(){

		var startDate= $("#employeeAssignmentStartDate").val();
		var endDate=$("#employeeAssignmentEndDate").val();

		var sDate=new Date(startDate);
		var eDate=new Date(endDate);
		console.log(sDate);
		console.log(eDate)
		if(StartDate!= '' && StartDate!= '' && sDate> eDate)
	    {
	    	alert("Please ensure that the End Date is greater than or equal to the Start Date.");
	    	$('button[type="submit"]').attr("disabled",true);
	    	return false;
	    }

    });
</script>

<script type="text/javascript">
	$('.flexdatalist').flexdatalist(function() {
		selectionRequired: 1;
		minLength: 1
	});

	
	$(".datepicker").datepicker(function() {
		format: 'yyyy-mm-dd'
	});

	// $(document).ready(function () {
	//     $( "#employeeAssignmentStartDate" ).datepicker({
	//       minDate: new Date(),
	//       onSelect : function(selected_date){
	//         var selectedDate = new Date(selected_date);
	//         var msecsInADay = 86400000;
	//         var endDate = new Date(selectedDate.getTime() + msecsInADay);

	//          $("#employeeAssignmentEndDate").datepicker( "option", "minDate", endDate );
	//       }
	//     });
	// });
</script>
</body>
</html>