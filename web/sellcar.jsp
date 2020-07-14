

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell A Car</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/anchor-js/4.0.0/anchor.min.js">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
  <style>
  #myBtn:hover {
    background-color: #555; /* Add a dark-grey background on hover */
}
input.ng-invalid.ng-dirty{border:1px solid red;}
 body {
    background-image: url("img/btn.jpg");
}
 footer{
    text-align: center;
   color: white;
  
   background-color: #333333;
   font-family: arial;
}
button {
    background-color:  #f44336;
    color: black;
    padding: 5px 10px;
    margin: 4px 0;
    border: none;
    cursor: pointer;
    width: 50%;
}
  </style>
  
<body>
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
    <li><a href="buycar.jsp"> BUY A CAR</a></li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown">
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="buycar.jsp">USED CARS</a></li>
        </ul>
        </li>
       <li><a href="aboutcar.jsp"><span class="glyphicon glyphicon-leaf"></span>ABOUT US&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
        
        
        <li><a href="contactus.jsp"><span class="glyphicon glyphicon-info-sign"></span>CONTACT US&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
   
      </ul>
      <ul class="nav navbar-nav navbar-right">
         <li><a><span class="glyphicon glyphicon-user"></span> WELCOME, <%=session.getAttribute("firstname")%></a></li> 
      </ul>     
    </div>
  </div>
         </nav> 
      
    
    <div class="row">
    <div class="col-md-6 col-sm-12 col-lg-6 col-md-offset-3">
		<div class="panel panel-primary">
			<div class="panel-heading">Enter Your Car Details 
			</div>
			<div class="panel-body" style="background:#00C492; color:#fff">
                            <form class="w3-container w3-card-4 w3-black" enctype="multipart/form-data" action="cloud" method="post" role="form" autocomplete="off">
                            
                            
                                
                                
    <div class="row setup-content" id="step-1">
        <div class="col-xs-12">
            <div class="col-md-12">
                <br>
                <h3> Car Details</h3><br>
                <div class="col-lg-6">
                    <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>model</label>
                    <input required="required" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.Dzire" ></input>
                </div>
                    </div>
                <div class="col-lg-6">
                    <div class="form-group">
                     <label class="control-label w3-text-red"><span class="req">* </span>Variant</label>
                    <input required="required" name="car" id = "txt" onkeyup = "Validate(this)" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.VXI"  />
                </div>
                 </div>
                <div class="col-lg-6">
                <div class="form-group">
                <label class="control-label w3-text-red"><span class="req">* </span>Registration Year</label>
                    <input required="required" onkeyup="validatephone(this);" id="phone" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.2017"  />
                </div>
                </div>
                <div class="col-lg-6">
                <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>Color</label>
                 <select class="w3-select w3-border w3-round-xxlarge w3-text-black" name="car">
  <option value="" disabled selected>Choose your Car Color</option>
  <option value="Blood Red" style="color: red">Blood Red</option>
  <option value="Black" style="color: black">Black</option>
  <option value="Silver Glory" style="color: silver">Silver Glory</option>
  <option value="Granite Grey" style="color: gray">Granite Grey</option>
  <option value=" Blue" style="color: blue"> Royal Blue </option>
  <option value="Sky White" style="background:whitesmoke">Sky White</option>
  
                 </select> </div>
                </div>
                    
                <div class="col-lg-6">
                <div class="form-group">
                     <label class="control-label w3-text-red"><span class="req">* </span>Kilometers Driven</label>
                    <input required="required" name="car" onkeyup="validatephone(this);" id="phone" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.150000 km"  />
                </div></div>
                <div class="col-lg-6">
                <div class="form-group">
                     <label class="control-label w3-text-red"><span class="req">* </span> No of Owners</label>
                 <select class="w3-select w3-border w3-round-xxlarge  w3-text-black" name="car">
  <option value="" disabled selected>No Of Ownership</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3 or above">3 or above</option>
                 </select> </div>
                </div>
                 <div class="col-lg-6">
                <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>City</label>
                    <input required="required" name="car" id = "txt" onkeyup = "Validate(this)" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.New Delhi"  />
                </div></div>
                <div class="col-lg-6">
                <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>Locality or Pincode</label>
                    <input required="required" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg./model Town or 110095"  />
                </div></div> 
                
                <div class="col-lg-12">
                     <div class="form-group"><br>
                    <input  name="image" class="w3-input w3-border w3-round-xxlarge w3-text-white"  maxlength="100" type="file" class="form-control"  />       
                     </div></div>
 
                <div class="col-lg-12">
                     <div class="form-group"><br>
                         <center>  <label class="control-label w3-text-red"><span class="req">* </span>Selling Price</label></center>
                    <input required="required" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control"  />       
                     </div></div></div>
        </div>
    </div>
        <h3> Contact Details </h3>
<div class="col-lg-12">
                <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>Name</label>
                    <input pattern="^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$" id = "txt" onkeyup = "Validate(this)" required="required" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.Jack Sparrow"  />
                </div>
                </div>
                <div class="col-lg-12">
                <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>Email</label>
                    <input pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" id = "email"  onchange="email_validate(this.value);" required="required" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="email" class="form-control" placeholder="eg.sparrow.jack@gmail.com"  />
               <div class="status" id="status"></div>
                </div></div>
                <div class="col-lg-12">
                <div class="form-group">
                    <label class="control-label w3-text-red"><span class="req">* </span>Mobile (10 digit)</label>
                    <input maxlength="10"  pattern="[0-9]{10}" onkeyup="validatephone(this);" id="phone" required="required" name="car" class="w3-input w3-border w3-round-xxlarge w3-text-black"  maxlength="100" type="text" class="form-control" placeholder="eg.9865893569"  />
                </div></div><br>
                <div class="col-lg-2"></div>
                <div class="form-group">
                    <div class="col-lg-8"><br>
                <button class="btn-lg btn-block" type="submit">Submit</button>
                    </div></div></div>
        </div>
    </div>			
    </div>
                                
                                
                                
                                
                            </form>
    
    
		

                
                  <footer>
        <div class="container">

            <div class="col-sm-6"><br>
<b>&copy;&nbsp;NIITian<br>
          &reg;&nbsp; Pvt.Ltd<br>
          
</div>
<div class="col-sm-6">
    <table>
  <tr>
    <th colspan="5"><h4>Quick Links</h4></th>
  </tr>
  <tr>
    <td><a href="index.jsp" style="text-decoration: none; color: white" >&raquo; Home </a></td>
    <td></td>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="buyacar.jsp" style="text-decoration: none; color: white">&raquo; Buy A Car</a></td>
    
    
  
  <tr>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="sellacar.jsp" style="text-decoration: none; color: white">&raquo; Sale A Car</a><br></td>
    <td></td>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="aboutcar.jsp" style="text-decoration: none; color: white">&raquo; About Us</a></br></td>
  </tr>
</table>
</div>
        </div><br>
      </footer>
</body>
