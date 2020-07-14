<%-- 
    Document   : index
    Created on : 4 May, 2017, 12:09:04 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>J$R motors</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
  footer{
    text-align: center;
   color: white;
  
   background-color: #333333;
   font-family: arial;
}
        
        .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 90%;
      margin: auto;
  }
  button {
    background-color:  #f44336;
    color: black;
    padding: 5px 10px;
    margin: 4px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}
input.ng-invalid.ng-dirty{border:1px solid red;}
  body {
    background-image: url("img/ggc.jpg");
}
video {
    width: 80%;
    height: auto;
}


    </style>
    </head>
    <body>
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
      <li><a href="signin.jsp"><span class="glyphicon glyphicon-user"></span> login in</a></li>
      
      <li><a href="signup.jsp"><span class="glyphicon glyphicon-log-in"></span> sign up</a></li>
      <li><a><span class="glyphicon glyphicon-user"></span> WELCOME     <%=session.getAttribute("firstname")%></a>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href="logout.jsp">log out</a></li>
          
        </ul>
      </li>
    </ul>
  </div>
  </div>
        </nav>
      
      
        
    
        <hr>
          
        <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img/buy.jpg" alt="Flower" width="260" height="200">
      </div>

          
        
        <div class="item">
        <img src="img/image2dd.jpg" alt="Flower" width="260" height="200">
    </div>
     
        <div class="item">
        <img src="img/image3dd.jpg" alt="Flower" width="260" height="200">
    </div>
        
        <div class="item">
        <img src="img/image4dd.jpg" alt="Flower" width="260" height="200">
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
  
        <hr>
    
         <hr>
        
        </br><div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <center><img class="img-circle" src="img/buy1.jpg" width="400" height="400"><br> <li><a href="buycar.jsp"> <button type="submit" class="btn-lg btn-block">BUY CAR</button>  </a></li></img></center>
       </div>
        <div class="col-sm-6">
            <center><img class="img-circle" src="img/sell.jpeg" width="400" height="400"><br>  <li><a href="sellcar.jsp"><button type="submit" class="btn-lg btn-block">SELL CAR</button>  </a></li></img></center>
       </div>
        
            </div></div>
   <hr>
  <center> <iframe width="420" height="345" src="https://www.youtube.com/embed/XgrvbcTkFHE">
</iframe>
<iframe width="420" height="345" src="https://www.youtube.com/embed/9N4RpohW-hU">
</iframe>
<iframe width="420" height="345" src="https://www.youtube.com/embed/sSi8xuRm5eE">
</iframe></center>

   <hr>
    
   
   <footer>
         <div class="container">

              <div class="col-sm-4"><br>
 <img src="img/log3.png" width="200" height="118" alt="Header Image" style="float: left;display: inline"/>

                  <h1><span class="glyphicon glyphicon-fire"></span>J&R motors</h1>
<br></div>
             
            <div class="col-sm-4"><br>
<b>&copy;&nbsp;NIITian<br>
          &reg;&nbsp; Pvt.Ltd<br>
          
</div>
<div class="col-sm-4">
    <table>
  <tr>
    <th colspan="5"><h4>Quick Links</h4></th>
  </tr>
   <tr>
    <td><a href="index.html" style="text-decoration: none; color: white" >&raquo; Home </a></td>
    <td></td>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="buyacar.jsp" style="text-decoration: none; color: white">&raquo; Buy A Car</a></td>
    <td></td>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="contactus.jsp" style="text-decoration: none; color: white">&raquo; Contact Us</a></td>
  </tr>
  <tr>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="sellacar.jsp" style="text-decoration: none; color: white">&raquo; Sale A Car</a><br></td>
    <td></td>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="aboutcar.jsp" style="text-decoration: none; color: white">&raquo; About Us</a></br></td>
  </tr>
</table>
</div>
        </div><br></footer> </body>
</html>
