<jsp:include page="adminheader.jsp" />

<div role="form">

	<form class="form-horizontal" method="post" >
		<fieldset>
			<legend style="text-align: center">Edit Project</legend>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="EditProjectDetailsProjectId">Project Id</label>
				<div class="col-md-4">
					<input id="EditProjectDetailsProjectId" name="projectId"
						type="text" placeholder="Project Id" class="form-control input-md" disabled>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="projectDetailsProjectName">Project Name</label>
				<div class="col-md-4">
					<input id="EditProjectDetailsProjectName" name="projectName"
						type="text" placeholder="project name"
						class="form-control input-md" required="">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="projectDetailsProjectDescription">Description</label>

				<div class="col-md-4"">
					<textarea id="EditProjectDetailsProjectDescription"
						name="projectDescription" type="text" class="form-control"
						placeholder="Project Description"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="EditProjectDetailsProjectStatus">Project Status</label>
				<div class="col-md-4">
					<select id="EditProjectDetailsProjectStatus"
						name="ProjectStatus" class="form-control">
						<option value="Live">Live</option>
						<option value="Hold">Hold</option>
						<option value="Completed">Completed</option>
					</select>
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label"
					for="EditProjectDetailsProjectProgress">Project Progress</label>
				<div class="col-md-4">
					<input id="EditProjectDetailsProjectProgress" name="projectProgress"
						type="text" placeholder="project Progress"
						class="form-control input-md" required="">
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsStartDate">Start
					date</label>
				<div class="col-md-4">
					<input id="EditProjectDetailsStartDate" name="startDate"
						type="date" placeholder="start date"
						class="form-control input-md datepicker">
				</div>
			</div>


			<div class="form-group">
				<label class="col-md-4 control-label" for="empType">End date</label>
				<div class="col-md-4">
					<input id="EditProjectDetailsEndDate" name="endDate" type="date"
						placeholder="end date" class="form-control input-md datepicker">
				</div>

			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="EditProjectDetailsProjectSkills">Skills Required</label>
				<!-- 				<div class="col-md-4"> -->
				<!-- 					<input id="projectDetailsProjectSkills" name="skills" type="text" -->
				<!-- 						placeholder="skills" class="form-control input-md" required=""> -->
				<!-- 				</div> -->
				<div class="col-md-4"">
					<textarea id="EditProjectDetailsProjectSkills" name="skills"
						type="text" class="form-control" placeholder="Skills"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsClientName">Client
					Name</label>
				<div class="col-md-4">
					<input id="EditProjectDetailsClientName" name="clientName"
						type="text" placeholder="client name"
						class="form-control input-md" required="">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="projectDetailsClientDetails">Client Details</label>
				<div class="col-md-4"">
					<textarea id="EditProjectDetailsClientDetails" name="clientDetails"
						type="text" class="form-control" placeholder="Client Details"></textarea>
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label"
					for="ProjectDetailsEditProject"></label>
				<div class="col-md-4 span4 offset4 text-center">
					<button id="editProjectComplete" type="submit" name="editProject"
						class="btn btn-primary">Update Complete</button>
				</div>
			</div>
		</fieldset>
	</form>
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/editproject.js"></script>

<script type="text/javascript">
	$(".datepicker").datepicker({
		format : 'yyyy-mm-dd'
	});
</script>
</body>
</html>