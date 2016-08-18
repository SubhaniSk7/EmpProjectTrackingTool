var app = angular.module('projectHistoryTable', ['angularUtils.directives.dirPagination']);

app.controller('historyList',function($scope, $http){
	$scope.users = []; //declare an empty array
	
	var id=localStorage.getItem("employeeButtonId");
	
	var string=id.substring(id.indexOf('y')+1);
	
	console.log(string);
	
	var url="http://192.168.35.190:8080/EmpProjectTrackingTool/app/employers/"+string+"/history";
	console.log(url);
	
	$http.get(url).success(function(response){ 
	
		$scope.users = response;  //ajax request to fetch data into $scope.data
		console.log(response);
		
	});
	
	$scope.sort = function(keyname){
		$scope.sortKey = keyname;   //set the sortKey to the param passed
		$scope.reverse = !$scope.reverse; //if true make it false and vice versa
	}
});
