<%-- 
    Document   : error
    Created on : 8 Jul, 2017, 3:16:54 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
    <body  background="img/errer.png">
        
         <h1 class="alert alert-danger">NO MATCH DATA FOUND</h1>
        <div>
            <a href="signin.jsp"><p><input type="submit" value="SIGNIN" class="btn-lg btn-block" style="background-color:#f44336 ; color: black ;width: 20%;"></a></p><p><font color="red">PLEASE RE-ENTER YOUR USERNAME AND PASSWORD!</font></p>
        </div>
        </body>
</html>
