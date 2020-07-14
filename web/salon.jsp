<%-- 
    Document   : salon
    Created on : 8 Jul, 2017, 12:21:19 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    
    </head>
    
    <script type="text/javascript">
        
        var myApp = angular.module("myApp",[]);
        
        myApp.controller("myCtrl",function($scope,$http){
            
            $scope.firstname = '';
            $scope.firstnameError = false;
            $scope.CheckUsername = function()
            {
                $scope.usernameError = ( $scope.username == '' || $scope.username == undefined )
            }
            
            $scope.password = '';
            $scope.passwordError = false;
            $scope.CheckPassword = function()
            {
                $scope.passwordError = ( $scope.password == '' || $scope.password == undefined )
            }
            
            $scope.AttemptLogin = function()
            {
                //
                var json = 
                    {
                        firstname : $scope.username,
                        password : $scope.password
                    };
            
                console.log(json);
            
                $http({
                    url: 'AttemptLogin',
                    method: "POST",
                    data: json,
                    body: json,
                    headers: {
                        'Content-Type': undefined
                      }
                })
                .then(function(response){
                    alert('Request Passed')
                },function(response){ 
                    alert('Request Failed')
                });
                //
            }
            
            
        });
        
    </script>
    
    <body ng-app="myApp" ng-controller="myCtrl" >
       
        <br>
        
        <div style="margin: auto; width: 80%; text-align: center;">
            
            <input type="text" class="form-control" placeholder="Enter Username" ng-model="firstname" ng-change="CheckUsername()"/>
            
            <br>
            <label class='alert alert-danger' ng-show="firstnameError"> Username cannot be empty!! </label>
 
            <br>
            
            <input type="password" class="form-control" placeholder="Enter Password" ng-model="password" ng-change="CheckPassword()"/>
            <br>
            <label class='alert alert-danger' ng-show="passwordError"> Password cannot be empty!! </label>
            
            <br>
            
            <button class="btn btn-primary" ng-disabled="passwordError || usernameError" ng-click="AttemptLogin()">Log In</button>
            
        </div>
        
    </body>
</html>