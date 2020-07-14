<%-- 
    Document   : forget_ps
    Created on : 19 Jul, 2017, 12:49:08 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
function myFunction() {
    alert("PASSWORD UPDATED SUCCESSFULLY!");
}
</script>  
  <style>
    
    button {
    background-color:  #f44336;
    color: black;
    padding: 5px 10px;
    margin: 4px 0;
    border: none;
    cursor: pointer;
    width: 50%;
}
p.solid {border-style: solid;}
 
    </style>   
    </head>
    <body background="img/ggc.jpg">
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
        <img src="img/log3.png" width="100" height="58" alt="Header Image" style="float: left;display: inline"/>
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
        
        `   
    </div>
      <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      
      <li><a href="aboutcar.jsp"><span class="glyphicon glyphicon-leaf"></span>About</a></li>
      <li><a href="contactus.jsp"><span class="glyphicon glyphicon-info-sign"></span>Contact Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="index.jsp"><span class="glyphicon glyphicon-home"></span>HOME</a></li>
      
      
          
        </ul>
      </li>
    </ul>
  </div>
  </div>
        </nav>
          
        
        <form action="update_pass" method="post">
         <pr>
    <center><label><p><font color="red">USERNAME</font></p></label>
    <input type="text" placeholder="Enter Username" name="psignup"  ng-model="user.name" required/>
    <span ng-show="myform.name.$dirty && myform.name.$error.required"><p><font color="red"></font></p></span><br>
           
    <label><p><font color="red">PASSWORD</font></p></label>
    <input type="password" placeholder=" Password" name="password" ng-model="user.psw" required/>
    <span ng-show="myform.psw.$dirty && myform.psw.$error.required"><p><font color="red"></font></p></span><br>

    
    <label><p><font color="red">CONFIRM PASSWORD </font></p></label>
    <input type="password" placeholder="confirm Password" name="ConfirmPassword" ng-model="user.psw" required/>
    <span ng-show="myform.psw.$dirty && myform.psw.$error.required"><p><font color="red"></font></p></span><br>

    <button onclick="myFunction()" type="submit" style="">UPDATE</button></center></br>
            </pr>
            </form>
        
    </body>
</html>
