<jsp:include page="adminheader.jsp" />

<div role="form">

	<form class="form-horizontal" method="post">
		<fieldset>
			<legend style="text-align: center">Add Project</legend>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectName">Project Name</label>
				<div class="col-md-4">
					<input id="addProjectName" name="addProjectName"
						type="text" placeholder="project name"
						class="form-control input-md" required="">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectDescription">Description</label>

				<div class="col-md-4"">
					<textarea id="addProjectDescription"
						name="addProjectDescription" type="text" class="form-control"
						placeholder="Project Description"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectStatus">Project Status</label>
				<div class="col-md-4">
					<select id="addProjectStatus"
						name="addProjectStatus" class="form-control">
						<option value="Live">Live</option>
						<option value="Hold">Hold</option>
						<option value="Completed">Completed</option>
					</select>
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectProgress">Project Progress</label>
				<div class="col-md-4">
					<input id="addProjectProgress" name="addProjectProgress"
						type="text" placeholder="project Progress"
						class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="addProjectStartDate">Start
					date</label>
				<div class="col-md-4">
					<input id="addProjectStartDate" name="startDate"
						type="date" placeholder="start date"
						class="form-control input-md datepicker">
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-4 control-label" for="addProjectEndDate">End date</label>
				<div class="col-md-4">
					<input id="addProjectEndDate" name="endDate" type="date"
						placeholder="end date" class="form-control input-md datepicker">
				</div>

			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectSkills">Skills Required</label>
				<div class="col-md-4"">
					<textarea id="addProjectSkills" name="skills"
						type="text" class="form-control" placeholder="Skills"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="addProjectClientName">Client
					Name</label>
				<div class="col-md-4">
					<input id="addProjectClientName" name="clientName"
						type="text" placeholder="client name"
						class="form-control input-md" required="">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectClientDetails">Client Details</label>
				<div class="col-md-4"">
					<textarea id="addProjectClientDetails" name="clientDetails"
						type="text" class="form-control" placeholder="Client Details"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="addProjectComplete"></label>
				<div class="col-md-4 span4 offset4 text-center">
					<button id="addProjectComplete" type="submit" name="addProjectComplete"
						class="btn btn-primary">Confirm</button>
				</div>
			</div>
		</fieldset>
	</form>
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/addproject.js"></script>

<script type="text/javascript">
	$(".datepicker").datepicker({
		format : 'yyyy-mm-dd'
	});
</script>
</body>
</html>