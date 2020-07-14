<%-- 
    Document   : hello
    Created on : May 13, 2017, 10:01:40 AM
    Author     : Subhanjan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <style>
            body{

background-attachment:scroll;
background:url(img/ggc.jpg);
background-size: 1365px;
}
        </style>
    </head>
    
    <h1 align="center"></h1> 
    <p align="center"><a href="home.jsp">Click here</a> to login to your account.</p>
    <center> <img src="img/"></center>
        <jsp:useBean id="myBean" scope="session" class="org.geeks.third"/>
    <jsp:setProperty name="myBean" property="model" value="" />
      <jsp:setProperty name="myBean" property="variant" value="" />
      <jsp:setProperty name="myBean" property="registrationyear" value="" />
      <jsp:setProperty name="myBean" property="color" value="" />
      <jsp:setProperty name="myBean" property="kilometerdrive" value="" />
      <jsp:setProperty name="myBean" property="ownership" value="" />
      <jsp:setProperty name="myBean" property="city" value="" />
      <jsp:setProperty name="myBean" property="locality" value="" />
      <jsp:setProperty name="myBean" property="sellingprice" value="" />
      <jsp:setProperty name="myBean" property="ownername" value="" />
      <jsp:setProperty name="myBean" property="email" value="" />
      <jsp:setProperty name="myBean" property="mobileno" value="" />
    
    <table border="1">
              <thead>
                <tr>
                    <td> Form values</td>
                </tr>
            </thead>
            <tbody>
                <tr height="100"><td><jsp:getProperty name="myBean" property="model" /> </td></tr>
                <tr height="100"><td> <jsp:getProperty name="myBean" property="variant" /> </td></tr>
                <tr height="100"><td>  <jsp:getProperty name="myBean" property="registrationyear" /> </td></tr>
                <tr height="100"><td> <jsp:getProperty name="myBean" property="color" />  </td></tr>
                <tr height="100"><td>  <jsp:getProperty name="myBean" property="kilometerdrive" />  </td></tr>
                <tr height="100"><td>   <jsp:getProperty name="myBean" property="ownership" />  </td></tr>
                <tr height="100"><td>   <jsp:getProperty name="myBean" property="city" />  </td></tr>
                <tr height="100"><td>   <jsp:getProperty name="myBean" property="locality" />  </td></tr>
                <tr height="100"><td>  <jsp:getProperty name="myBean" property="sellingprice" />   </td></tr>
                <tr height="100"><td>  <jsp:getProperty name="myBean" property="ownername" />   </td></tr>
                <tr height="100"><td>   <jsp:getProperty name="myBean" property="email" /> </td></tr>
                <tr height="100"><td>  <jsp:getProperty name="myBean" property="mobileno" /> </td></tr>
            </tbody>
          
            </table>  
                <%
                    int a = myBean.store();
                    if(a==1){
                        out.print("data inserted");
                    }else{
                        out.print("Element Not Stored");
                    }
%>
    
 
