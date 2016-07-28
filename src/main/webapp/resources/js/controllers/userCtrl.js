app.controller('UserCtrl', function($scope, $http) {
        $http.get('users/userlist.json').success(function(userList){
            $scope.users = userList;
        });
});