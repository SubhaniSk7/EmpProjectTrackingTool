var app = angular.module('angularTable', ['angularUtils.directives.dirPagination']);

app.controller('listdata',function($scope, $http){
	$scope.users = []; //declare an empty array
	$http.get("http://192.168.35.190:8080/EmpProjectTrackingTool/app/projects").success(function(response){ 
	
		$scope.users = response;  //ajax request to fetch data into $scope.data
		console.log(response);
		
	});
	
	$scope.sort = function(keyname){
		$scope.sortKey = keyname;   //set the sortKey to the param passed
		$scope.reverse = !$scope.reverse; //if true make it false and vice versa
	}
});
