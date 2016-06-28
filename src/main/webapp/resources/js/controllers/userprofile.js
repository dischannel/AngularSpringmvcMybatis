app.controller('UserProfileCtrl', ['$scope', '$http', function($scope, $http) {
	 $scope.fetchUsersList = function() {
	        $http.get('users/userlist.json').success(function(userList){
	            $scope.users = userList;
	            $scope.user = 'Alex';
	        });
	    };
	
	 $scope.fetchUsersList();
}]);