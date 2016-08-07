<%-- <jsp:include page="header.jsp"/> --%>
<!doctype html>
<html lang="en" ng-app="projectHistoryTable">
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
					<div class="bs-component" ng-controller="historyList">

						<table class="table table-striped table-hover text-center">
							<thead>
								<tr>
									<th ng-click="sort('projectId')" class="text-center">project
										Id <span class="glyphicon sort-icon"
										ng-show="sortKey=='projectId'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('employerId')" class="text-center">employerId
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
									<th ng-click="sort('effortPercentage')" class="text-center">Effort<span
										class="glyphicon sort-icon" ng-show="sortKey=='effortPercentage'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('currentStatus')" class="text-center">Status <span
										class="glyphicon sort-icon" ng-show="sortKey=='currentStatus'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('projectRole')" class="text-center">Project Role
										Employers <span class="glyphicon sort-icon"
										ng-show="sortKey=='projectRole'"
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
									<td>{{user.employerId}}</td>
									<td>{{user.startDate}}</td>
									<td>{{user.endDate}}</td>
									<td>{{user.effortPercentage}}</td>
									<td>{{user.currentStatus}}</td>
									<td>{{user.projectRole}}</td>
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
	
	<script src="js/angular.js"></script>
	<script src="js/dirPagination.js"></script>
	<script src="js/projecthistoryapp.js"></script>

</body>
</html>
