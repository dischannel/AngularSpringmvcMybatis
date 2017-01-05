app.controller('MainSProduct', function($scope, $http) {
	$scope.fetchUsersList = function() {
		$http.get('sprod/simpleprod.json').success(function(sprodList){
	        $scope.product = sprodList;
	    });
	};
    $scope.submit = function() {
    	$http({
            url:'sprod/submitinfo',
            method: 'POST',            
            data: $scope.mySelections[0]      
        }).success(function(){
        	$scope.fetchUsersList();
            console.log("success!");
        }).error(function(){
            console.log("error");
        })
    };
//
    $scope.removeInfo = function() {
    	$http({
            url:'sprod/removeinfo',
            method: 'POST',            
            data: $scope.mySelections[0]      
        }).success(function(){
        	$scope.fetchUsersList();
            console.log("success!");
        }).error(function(){
            console.log("error");
        })
    };
    $scope.fetchUsersList();
    $scope.mySelections = [];
    $scope.gridOptions = { 
      data: 'product',
      selectedItems: $scope.mySelections,
      multiSelect: false
    };
});