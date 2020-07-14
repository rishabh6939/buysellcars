<%-- 
    Document   : example
    Created on : 14 Jul, 2017, 9:29:25 PM
    Author     : jatin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="org.geeks.thirdInterImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>JSP Page</title>
        <style>
.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 20%;
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
             .table > thead > tr > th, .table > tbody > tr > th, .table > tfoot > tr > th, .table > thead > tr > td, .table > tbody > tr > td, .table > tfoot > tr > td {

        padding: 5px !important; 
    }
    
.modal {
display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
      /* Sit on top */
    left: 0%;
     
    top: 0%;
    width: 100%; /* Full width */
    height: 300%; /* Full height */
   
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}
.modal-list > li > a {
  color:#333;
  text-decoration: none;
  list-style: none;
  display: block;
  text-align: center;
}  .confirmBox{
    top:25%;
    left:100%;
}#myModal.modal{
     text-align: center;
}
#myModal.modal::before {
     content: "";	  
     display: inline-block;
     height: 100%;	 
     margin-right: -4px;
     vertical-align: middle;
}
#myModal .modal-dialog {	
     display: none;	
     text-align: left;	
     vertical-align:middle ;
}	
.modal-body {padding: 2px 16px;
            right:0%;
            
            
            overflow: auto;
    }

                </style>    
    </head>
    <body background="img/ggc.jpg">
        <%
            thirdInterImpl impl = new thirdInterImpl();
            ArrayList list = (ArrayList) impl.list_data();
            request.setAttribute("list", list);

        %>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <img src="img/log3.png" width="135" height="58" alt="Header Image" style="float: left;display: inline"/>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>

                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
                        <li><a href="sellcar.jsp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; SELL CAR &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
                        <li><a href="aboutcar.jsp"><span class="glyphicon glyphicon-leaf"></span>ABOUT US&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>


                        <li><a href="contactus.jsp"><span class="glyphicon glyphicon-info-sign"></span>CONTACT US&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a><span class="glyphicon glyphicon-user"></span> WELCOME, <%=session.getAttribute("firstname")%></a></li> 
                    </ul>     
                </div>
            </div>
        </nav> 
<hr>
<c:forEach var="i" items="${list}">    
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    </ol>
    
    <div class="carousel-inner" role="listbox" style="margin: auto; width: 50%;">
      <div class="item active">
              
        <center><img src="${i.getImage_path()}" width="300" height="300"/></center>

      </div>
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
  
       
        <!-- Modal -->
        <div class="modal fade" id="${i.getId()}" role="dialog">
            <div class="modal-dialog modal-lg" >
                <div class="modal-content" style="margin: auto; width: 80%; text-align: center; background-color: #f44336;">
                    <div class="modal-header" style="color: white;">

                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title" style="">USED CAR DETAILS</h4>
                    </div>
                    <div class="modal-body">


                        <table class="table table-striped table-responsive">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>MODEL</th>
                                    <th>VARIANT</th>
                                    <th>REGISTRATIONYEAR</th>
                                    <th>COLOR</th>
                                    <th>KILOMETERDRIVE</th>
                                    <th>OWNERSHIP</th>
                                    <th>CITY</th>
                                    <th>LOCALITY</th>
                                    <th>SELLINGPRICE</th>
                                    <th>OWNERNAME</th>
                                    <th>EMAIL</th>
                                    <th>MOBILENO</th>

                                </tr>
                            </thead>
                            <tbody>



                                <tr>

                                    <td>${i.getId()}</td>
                                    <td>${i.getModel()}</td>
                                    <td>${i.getVariant()}</td>
                                    <td>${i.getRegistrationyear()}</td>
                                    <td>${i.getColor()}</td>
                                    <td>${i.getKilometerdrive()}</td>
                                    <td>${i.getOwnership()}</td>
                                    <td>${i.getCity()}</td>
                                    <td>${i.getLocality()}</td>
                                    <td>${i.getSellingprice()}</td>
                                    <td>${i.getOwnername()}</td>
                                    <td>${i.getEmail()}</td>
                                    <td>${i.getMobileno()}</td>





                                </tr>


                            </tbody>

                        </table>


                    </div>


                </div>

            </div>

        </div>

        <center><button type="button" data-toggle="modal" data-target="#${i.getId()}"  style="">DETAILS</button></center> 
        </c:forEach>









</body>

</html>
