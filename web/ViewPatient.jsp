<%-- 
    Document   : ViewPatients
    Created on : 9 Jun, 2017, 12:40:41 PM
    Author     : Vasudev
--%>

<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%
                    List list = (List)request.getAttribute("data");
                    String dataJSONList = (String)request.getAttribute("dataJSONArray").toString();
                %>
                
                <c:set var="list" value="<%=list%>"></c:set>
                <c:set var="list1" value="<%=dataJSONList%>"></c:set>
        

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>

    <script type="text/javascript">
        
        var myApp = angular.module('myApp',[]);
        
        myApp.controller('myCtrl',function($scope){
            
            $scope.data = ${list1};
            
        });
        
    </script>

    <body ng-app="myApp" ng-controller="myCtrl">
        
        <h1>CUSTOMER LIST OR DELETE YOUR ACCOUNT</h1>
      
        
        
                
        <table class="table table-striped table-responsive">
          <thead>
            <tr>
                <th>Id</th>
              <th>Firstname</th>
              <th>Contact</th>
              <th>Address</th>
              <th>Email</th>
              <th>Delete</th>
            </tr>
          </thead>
            <tbody>
                
                
                
                <c:forEach var="i" items="${list}">
                    
                    <tr>
                
                            <td>${i.getId()}</td>
                        <td>${i.getFirstname()}</td>
                        <td>${i.getContact()}</td>
                        <td>${i.getAddress()}</td>
                        <td>${i.getEmail()}</td>
                        <td><a href="DeletePatient?id=${i.getId()}" class="btn btn-link">Delete</a></td>
                        
                    </tr>
                    
                </c:forEach>
            
            </tbody>
            
        </table>
        
    </body>
</html>
