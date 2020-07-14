<%-- 
    Document   : logout
    Created on : 12 Jul, 2017, 11:54:01 AM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>log Out</title>
        <style>
body{
background:url(img/ggc.jpg);
background-size: 1365px;
}
h3,h1,h2 {
    text-align: center;
}
h2.padding {
    padding-right: 3cm;
}
h3.padding {
    padding-right: 2cm;
}

        </style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    </head>
    <body>
         <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <img src="img/log3.png" width="100" height="58" alt="Header Image" style="float: left;display: inline"/>
        
     <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-log-in"></span>  LOG OUT</a>
    </div>
  <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span> HOME </a></li>
      </ul>
  </div></nav>
        
        <% session.invalidate(); %>
     <br><br>
    <h1>You have been successfully</h1>
    <h2  align="center" class="padding" style="color: red">LOG OUT</h2>
    <h3  align="center" class="padding" style="color: black"><a href="signin.jsp" style="color: black">Click here to LOGIN</a></h3>
    <h3  align="center" class="padding" style="color: black"><a href="index.jsp" style="color: black">Click here to HOME</a></h3>

     
     

    </body>
</html>
