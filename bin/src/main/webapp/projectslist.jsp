<!doctype html>
<html lang="en" ng-app="projectsTable">
<head>
<meta charset="utf-8">
<title>EmpProjectTrackingTool</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

	<jsp:include page="adminheader.jsp" />
	<!-- 	<div class="navbar-header" > -->
	<!-- 		<button class="btn btn-sm btn-warning" id="addProject">Add</button> -->
	<!-- 	</div> -->
	<div class="container">
		<div class="toppad">
			<div class="panel panel-primary">
				<div class="panel-heading text-center clearfix">
					<h2 class="panel-title ">Projects List</h2>
					<form class="form-inline pull-right">
						<label>Search</label> <input type="text" ng-model="search"
							class="form-control" placeholder="Search">
					</form>
				</div>
				<div class="panel-body">
					<div class="bs-component" ng-controller="projectslist">

						<table class="table table-striped table-hover text-center">
							<thead>
								<tr>
									<th ng-click="sort('projectId')" class="text-center">project
										Id <span class="glyphicon sort-icon"
										ng-show="sortKey=='projectId'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('projectName')" class="text-center">Project
										Name <span class="glyphicon sort-icon"
										ng-show="sortKey=='projectName'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('startDate')" class="text-center">Start
										Date <span class="glyphicon sort-icon"
										ng-show="sortKey=='startDate'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('endDate')" class="text-center">End
										Date<span class="glyphicon sort-icon"
										ng-show="sortKey=='endDate'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('progress')" class="text-center">Progress<span
										class="glyphicon sort-icon" ng-show="sortKey=='progress'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('status')" class="text-center">Status <span
										class="glyphicon sort-icon" ng-show="sortKey=='status'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('Assign')" class="text-center">Assign
										Employers <span class="glyphicon sort-icon"
										ng-show="sortKey=='Assign'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>

									</th>
								</tr>
							</thead>
							<tbody>
								<tr
									dir-paginate="user in users|orderBy:sortKey:reverse|filter:search|itemsPerPage:5">

									<td>
										<button id={{user.projectId}} class="btn btn-success btn-sm">{{user.projectId}}</button>
									</td>
									<td>{{user.projectName}}</td>
									<td>{{user.startDate}}</td>
									<td>{{user.endDate}}</td>
									<td>{{user.progress}}</td>
									<td>{{user.status}}</td>
									<td><button id=projectassign{{user.projectId}}
											class="btn btn-info btn-sm">Assign</button></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="panel-footer clearfix text-center">
						<dir-pagination-controls max-size="5" direction-links="true"
							boundary-links="true"> </dir-pagination-controls>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		$("#sessionId").text(sessionStorage.getItem("userName"));
		
	</script>
	<script src="js/angular.js"></script>
	<script src="js/dirPagination.js"></script>
	<script src="js/projectslistapp.js"></script>
	<script src="js/projectslist.js"></script>


</body>
</html>