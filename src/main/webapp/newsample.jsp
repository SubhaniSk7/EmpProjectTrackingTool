<!doctype html>
<html lang="en" ng-app="angularTable">
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

	<jsp:include page="header.jsp" />
	<!-- here 0 -->
	<!-- 	<div role="main" class="container"> -->
	<div class="container">
		<!-- 	here 0 -->
		<!-- 	here 1 -->
		<!-- 		<div class=""> -->
		<div class="toppad">
			<!-- 		here toppad -->
			<div class="panel panel-primary">
				<!-- 				<div> -->
				<!-- 			here 1-->
				<!-- 			here 2-->
				<!-- 				<div class="page-header"> -->
				<!-- 					<h2 id="tables">Projects List</h2> -->
				<!-- 				</div> -->
				<div class="panel-heading text-center clearfix">
					<h2 class="panel-title ">Projects</h2>
					<form class="form-inline pull-right">
						<!-- 							<div class="form-group"> -->
						<label>Search</label> <input type="text" ng-model="search"
							class="form-control" placeholder="Search">
						<!-- 							</div> -->
					</form>
				</div>

				<!-- 				here 2-->
				<div class="panel-body">
					<div class="bs-component" ng-controller="listdata">

						<table class="table table-striped table-hover text-center">
							<thead >
								<tr>
									<th ng-click="sort('projectId')"  class="text-center">Project Id <span
										class="glyphicon sort-icon" ng-show="sortKey=='projectId'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('projectName')"  class="text-center">Project Name <span
										class="glyphicon sort-icon" ng-show="sortKey=='projectName'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('startDate')"  class="text-center">Start Date <span
										class="glyphicon sort-icon" ng-show="sortKey=='startDate'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('endDate')"  class="text-center">End Date <span
										class="glyphicon sort-icon" ng-show="sortKey=='endDate'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('projectManager')"  class="text-center">Project Manager <span
										class="glyphicon sort-icon"
										ng-show="sortKey=='projectManager'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
								</tr>
							</thead>
							<tbody>
								<tr
									dir-paginate="user in users|orderBy:sortKey:reverse|filter:search|itemsPerPage:3">
									<td>
										<button id={{user.projectId}} class="btn btn-success btn-sm userid">{{user.projectId}}</button>
									</td>
									<td>{{user.projectName}}</td>
									<td>{{user.startDate}}</td>
									<td>{{user.endDate}}</td>
									<td>{{user.projectManager}}</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="panel-footer clearfix text-center">
						<dir-pagination-controls max-size="3" direction-links="true"
							boundary-links="true"> </dir-pagination-controls>
					</div>
				</div>
				<!-- 				</div> -->
			</div>
		</div>
	</div>

	<script src="js/angular.js"></script>
	<script src="js/dirPagination.js"></script>
	<script src="js/sampleprojectslist.js"></script>
	<script src="js/newsample.js"></script>
	<script src="js/profile.js"></script>
	
</body>
</html>
