<!doctype html>
<html lang="en" ng-app="employeeTable">
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

	<jsp:include page="empheader.jsp" />
	
	<div class="container">
		<div class="toppad">
			<div class="panel panel-primary">
				<div class="panel-heading text-center clearfix">
					<h2 class="panel-title ">Employee List</h2>
					<form class="form-inline pull-right">
						<label>Search</label> <input type="text" ng-model="search"
							class="form-control" placeholder="Search">
					</form>
				</div>
				<div class="panel-body">
					<div class="bs-component" ng-controller="employeelist">

						<table class="table table-striped table-hover text-center">
							<thead >
								<tr>
									<th ng-click="sort('employerId')"  class="text-center">Employee Id <span
										class="glyphicon sort-icon" ng-show="sortKey=='employerId'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('firstName')"  class="text-center">Name <span
										class="glyphicon sort-icon" ng-show="sortKey=='name'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('mobileNo')"  class="text-center">Mobile <span
										class="glyphicon sort-icon" ng-show="sortKey=='mobileNo'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('bloodGroup')"  class="text-center">Blood Group <span
										class="glyphicon sort-icon"
										ng-show="sortKey=='bloodGroup'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('emailId')"  class="text-center">Email Id <span
										class="glyphicon sort-icon" ng-show="sortKey=='emailId'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('prjStatus')"  class="text-center">Project Status <span
										class="glyphicon sort-icon" ng-show="sortKey=='prjStatus'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									<th ng-click="sort('dateOfBirth')"  class="text-center">DOB <span
										class="glyphicon sort-icon" ng-show="sortKey=='dateOfBirth'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
									
									<th ng-click="sort('history')"  class="text-center">Project History <span
										class="glyphicon sort-icon" ng-show="sortKey=='history'"
										ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
									</th>
								</tr>
							</thead>
							<tbody>
								<tr
									dir-paginate="user in users|orderBy:sortKey:reverse|filter:search|itemsPerPage:5">
									<td>
										<button id={{user.employerId}} class="btn btn-success btn-sm">{{user.employerId}}</button>
									</td>
									<td>{{user.firstName}} {{user.lastName}}</td>
									<td>{{user.mobileNo}}</td>
									<td>{{user.bloodGroup}}</td>
									<td>{{user.emailId}}</td>
									<td>{{user.prjStatus}}</td>
									<td>{{user.dateOfBirth}}</td>
									<td><button id=history{{user.employerId}} class="btn btn-success btn-sm">Project</button></td>
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
	<script src="js/employeelistapp.js"></script>
	<script src="js/employeelist.js"></script>
	
</body>
</html>