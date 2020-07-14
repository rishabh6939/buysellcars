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
    button {
    background-color:  #f44336;
    color: black;
    padding: 5px 10px;
    margin: 4px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}
    </style>    
    </head>
    <body>
     <%
                          thirdInterImpl impl =new thirdInterImpl();
                            ArrayList list=(ArrayList)impl.list_data();
                            request.setAttribute("list", list);

        %>
        
     <c:set var="car_dta" value="${list}"/>
    <c:forEach var="i" items="${list}">
    <center><img src="${i.getImage_path()}" width="300" height="300"/></center>
    </c:forEach>
    <center><button type="button" data-toggle="modal" data-target="#myModal"  style="">DETAILS</button></center>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
           
            <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" style="">cars</h4>
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
                
                
                
            <c:forEach var="i" items="${list}">
                    
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
                    
                </c:forEach>
            
            </tbody>
            
        </table>
       
         
        </div>
       
          
        </div>
      </div>
    </div>
  </div>
</div>
    </form>
    </body>
</html>
