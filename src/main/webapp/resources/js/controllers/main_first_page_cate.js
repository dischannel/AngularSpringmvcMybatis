app.controller('MainFCategory', function($scope, $http) {
	$scope.fetchUsersList = function() {
		$http.get('fcate/firstcategory.json').success(function(categoryList){
	        $scope.category = categoryList;
	    });
	};
    $scope.submit = function() {
    	$http({
            url:'fcate/submitinfo',
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
            url:'fcate/removeinfo',
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
      data: 'category',
      selectedItems: $scope.mySelections,
      multiSelect: false
    };
});