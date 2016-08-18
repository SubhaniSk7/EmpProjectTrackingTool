<!doctype html>
<html lang="en" ng-app="angularTable">
  <head>
    <meta charset="utf-8">
    <title>Search Sort and Pagination in Angular js</title>
<!--     <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> -->
<!--     <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"> -->
<!--     <link rel="stylesheet" type="text/css" href="css/styles.css"> -->

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  </head>
  <body >
	<div role="main" class="container theme-showcase">
      <div class="" style="margin-top:90px;">
        <div class="col-lg-8">
			<div class="page-header">
				<h2 id="tables">Search Sort and Pagination in Angular js</h2>
			</div>
			<div class="bs-component" ng-controller="listdata">
				<div class="alert alert-info">
					<p>Sort key: {{sortKey}}</p>
					<p>Reverse: {{reverse}}</p>
					<p>Search String : {{search}}</p>
				</div>
				<form class="form-inline">
					<div class="form-group">
						<label >Search</label>
						<input type="text" ng-model="search" class="form-control" placeholder="Search">
					</div>
				</form>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th ng-click="sort('projectId')">projectId
								<span class="glyphicon sort-icon" ng-show="sortKey=='projectId'" ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
							</th>
							<th ng-click="sort('projectName')">projectName
								<span class="glyphicon sort-icon" ng-show="sortKey=='projectName'" ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
							</th>
							<th ng-click="sort('startDate')">startDate
								<span class="glyphicon sort-icon" ng-show="sortKey=='startDate'" ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
							</th>
							<th ng-click="sort('endDate')">endDate
								<span class="glyphicon sort-icon" ng-show="sortKey=='endDate'" ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
							</th>
							<th ng-click="sort('projectManager')">projectManager
								<span class="glyphicon sort-icon" ng-show="sortKey=='projectManager'" ng-class="{'glyphicon-chevron-up':reverse,'glyphicon-chevron-down':!reverse}"></span>
							</th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="user in users" >
							<td>{{user.projectId}}</td>
								<td>{{user.projectName}}</td>
								<td>{{user.startDate}}</td>
							<td>{{user.endDate}}</td>
								<td>{{user.projectManager}}</td>
						</tr>
					</tbody>
				</table> 
				<dir-pagination-controls
					max-size="3"
					direction-links="true"
					boundary-links="true" >
				</dir-pagination-controls>
			</div>
		</div>
		<div>
			Link to <a href="http://code.ciphertrick.com/2015/05/31/search-sort-and-pagination-ngrepeat-angularjs/ ">tutorial</a>.
		</div>
      </div>
    </div>
		<script src="js/angular.js"></script>
		<script src="js/dirPagination.js"></script>
		<script src="js/app.js"></script>
  </body>
</html>
