<%-- 
    Document   : signin
    Created on : 4 May, 2017, 12:28:30 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <style>
        input[type=text], input[type=password] 
        {
    width: 45%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #f44336;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 10%;
}




input.ng-invalid.ng-dirty{border:1px solid red;}
 body {
    background-image: url("img/btn.jpg");
}
    </style>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login in</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    </head>
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LOGIN IN</a>
    </div>
        
      <ul class="nav navbar-nav navbar-right">
      
      <li><a href="signup.jsp"><span class="glyphicon glyphicon-log-in"></span> SIGN UP</a></li>
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span> HOME</a></li>
      </ul></div>
            
      
              
            <form action="login.jsp" method="post">
         
         <center> <label><p><font color="red">USERNAME</font></p></label>
             <input type="text" placeholder="Enter Username" name="firstname"  ng-model="user.name" required/>
 <span ng-show="myform.name.$dirty && myform.name.$error.required"><p><font color="red"></font></p></span><br>
           
    <label><p><font color="red">PASSWORD</font></p></label>
    <input type="password" placeholder="Enter Password" name="password" ng-model="user.psw" required/>
    <span ng-show="myform.psw.$dirty && myform.psw.$error.required"><p><font color="red"></font></p></span><br>

         <button type="submit">Login</button></center></br>
            </form>
         
            <center><a  style="text-decoration:none; color: #fff"href="forget_ps.jsp">FORGET PASSWORD</a></center>  
         
        </nav>
    </body>
</html>
