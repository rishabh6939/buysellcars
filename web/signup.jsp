<%-- 
    Document   : signup
    Created on : 4 May, 2017, 12:33:34 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
 
        input[type=firstname], input[type=text], 
     input[type=password], 
 input[type=address], input[type=contact] 
  
 input[type=text], input[type=password] {
    width: 60%;
   height: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}


button {
    background-color:  #f44336;
    color: black;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}


.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

.cancelbtn,.signupbtn {
    float: left;
    width: 10%;
}

input.ng-invalid.ng-dirty{border:1px solid red;}
body {
    background-image: url("img/btn.jpg");
}
    
    </style>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
var regMail = /^([_a-zA-Z0-9-]+)(\.[_a-zA-Z0-9-]+)*@([a-zA-Z0-9-]+\.)+([a-zA-Z]{2,3})$/;

    if(regMail.test(email) === false)
    {
    document.getElementById("status").innerHTML    = "<span class='warning'>Email address is not valid yet.</span>";
    }
    else
    {
    document.getElementById("status").innerHTML	= "<span class='valid'>Thanks, you have entered a valid Email address!</span>";	
    }
}
function Validate(txt) {
    txt.value = txt.value.replace(/[^a-z A-Z-'\n\r.]+/g, '');
}
function validatephone(phone) 
{
    var maintainplus = '';
    var numval = phone.value
    if ( numval.charAt(0)=='+' )
    {
        var maintainplus = '';
    }
    curphonevar = numval.replace(/[\\A-Za-z!"£$%^&\,*+_={};:'@#~,.?\/<>?|`¬\]\[]/g,'');
    phone.value = maintainplus + curphonevar;
    var maintainplus = '';
    phone.focus;
}
  </script>
  
    </head>
    <body>
        <form action="AddPatientToDB" method="post">
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <img src="img/log3.png" width="100" height="58" alt="Header Image" style="float: left;display: inline"/>
        
     <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-log-in"></span>  SIGN UP</a>
    </div>
  <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span> HOME </a></li>
      </ul>
  </div></nav>
    
         <hr>
        <div class="container">
  
  <!-- Trigger the modal with a button -->
  <button type="button" data-toggle="modal" data-target="#myModal" style="">CUSTOMER SIGN UP</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">sign up</h4>
        </div>
        <div class="modal-body" style="background-color:black">
        
            <pre>
           
   
    <legend><b>First Name</b></legend>
    <input type="text" id = "txt" onkeyup = "Validate(this)" pattern="^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$" placeholder="First Name " name="psignup" class="form-control" required /></input></br>
  <legend><b>Password</b></legend>
    <input type="password" placeholder="Enter Password" name="psignup" class="form-control" title="Minimum 8 characters, one number, one uppercase and one lowercase letter" required/></br>
    <legend><b>Contact</b></legend>
    <input type ="text"  id="phone" onkeyup="validatephone(this);" maxlength="10"  pattern="[0-9]{10}" placeholder="Enter Contact no. " name="psignup" class="form-control" pattern="d{10}" required /></br>
    <legend><b>Address</b></legend>
    <textarea class="form-control" name="psignup" placeholder="Enter Address" required /></textarea></br>
    <legend><b>Email</b></legend>
    <input type="text" id = "email" onchange="email_validate(this.value);" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="Enter Email" name="psignup" class="form-control" title="Please enter a valid email" required /></br>
    


    <center><button type="submit" value="SUBMIT" style="background:#f44336; color:#fff;"/> submit</button></center>
         </pre>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
      </div>
    </div>
  </div>
</div>

<hr>
<hr>
        
        </br><div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <center><image src="img/bb.png" class="img-rounded" width="300" height="300"> <a href="buycar.jsp"><button type="submit">BUY CAR</button></a></p></center>
       </div>
        <div class="col-sm-4">
        <center><image src="img/ttb.png" class="img-rounded" width="300" height="300"><a href="sellcar.jsp"><button type="submit">SELL CAR</button></a></center>
       </div>
        <div class="col-sm-4">
       <center><image src="img/ooy.png" class="img-rounded" width="300" height="300"><a href="ViewPatientData"><button type="submit">SHOW CUSTOMER DETAILS</button></a></center>
      </div>
            </div></div>
   
       <hr>
        </form>
       </body>
</html>
