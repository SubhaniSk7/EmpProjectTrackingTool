<jsp:include page="adminheader.jsp"/>

<div role="form">

	<form class="form-horizontal" method="post">
		<fieldset>
			<legend style="text-align:center">Project Details</legend>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsProjectId">Project Id</label>
				<div class="col-md-4">
					<input id="projectDetailsProjectId" name="projectId" type="text" placeholder="Project Id" value="" class="form-control input-md" disabled >
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsProjectName">Project Name</label>  
				<div class="col-md-4">
					<input id="projectDetailsProjectName" name="firstName" type="text" placeholder="project name" value="" class="form-control input-md" required="" disabled>
				</div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="projectDetailsProjectDescription">Description</label>  
			  <div class="col-md-4">
			  <input id="projectDetailsProjectDescription" name="projectDescription" type="text" placeholder="Description" value="" class="form-control input-md" required="" disabled>
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="projectDetailsProjectManager">Project Manager</label>  
			  <div class="col-md-4">
			  <input id="projectDetailsProjectManager" name="projectManager" type="text" placeholder="Project manager" value="" class="form-control input-md" disabled> 
			  </div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsStartDate">Start date</label>  
				<div class="col-md-4">
					<input id="projectDetailsStartDate" name="startDate" type="text" placeholder="start date" value="" class="form-control input-md" required="" disabled>
				</div>
			</div>
			
			  
			<div class="form-group">
				<label class="col-md-4 control-label" for="empType">End date</label>  
				<div class="col-md-4">
					<input id="projectDetailsEndDate" name="endDate" type="text" placeholder="end date" value="" class="form-control input-md" required="" disabled>
				</div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="projectDetailsProgress">Progress</label>  
			  <div class="col-md-4">
			  <input id="projectDetailsProgress" name="progress" type="text" placeholder="progress" value="" class="form-control input-md" disabled> 
			  </div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="projectDetailsStatus">Status</label>  
			  <div class="col-md-4">
			  <input id="projectDetailsStatus" name="status" type="text" placeholder="Status" value="" class="form-control input-md" disabled> 
			  </div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsProjectSkills">Skills Required</label>  
				<div class="col-md-4">
					<input id="projectDetailsProjectSkills" name="skills" type="text" value="" placeholder="skills" class="form-control input-md" required="" disabled>
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsClientName">Client Name</label>  
				<div class="col-md-4">
					<input id="projectDetailsClientName" name="clientName" value="" type="text" placeholder="client name" class="form-control input-md" required="" disabled>
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="projectDetailsClientDetails">Client Details</label>  
				<div class="col-md-4">
					<input id="projectDetailsClientDetails" name="clientDetails" value="" type="text" placeholder="client details" class="form-control input-md" required="" disabled>
				</div>
			</div>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="ProjectDetailsEditProject"></label>
			  <div class="col-md-4 span4 offset4 text-center">
			    <button id="ProjectDetailsEditProject" class="btn btn-primary">Edit Project</button>
			  </div>
			</div>
		</fieldset>
	</form>
</div>

	<script type="text/javascript" src="js/projectdetails.js"></script>
	
</body>
</html>