package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write(" \n");
      out.write("        input[type=firstname], input[type=text], \n");
      out.write("     input[type=password], \n");
      out.write(" input[type=address], input[type=contact] \n");
      out.write("  \n");
      out.write(" input[type=text], input[type=password] {\n");
      out.write("    width: 60%;\n");
      out.write("   height: 20%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color:  #f44336;\n");
      out.write("    color: black;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cancelbtn,.signupbtn {\n");
      out.write("    float: left;\n");
      out.write("    width: 10%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input.ng-invalid.ng-dirty{border:1px solid red;}\n");
      out.write("body {\n");
      out.write("    background-image: url(\"img/btn.jpg\");\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign up</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("var regMail = /^([_a-zA-Z0-9-]+)(\\.[_a-zA-Z0-9-]+)*@([a-zA-Z0-9-]+\\.)+([a-zA-Z]{2,3})$/;\n");
      out.write("\n");
      out.write("    if(regMail.test(email) === false)\n");
      out.write("    {\n");
      out.write("    document.getElementById(\"status\").innerHTML    = \"<span class='warning'>Email address is not valid yet.</span>\";\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("    document.getElementById(\"status\").innerHTML\t= \"<span class='valid'>Thanks, you have entered a valid Email address!</span>\";\t\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function Validate(txt) {\n");
      out.write("    txt.value = txt.value.replace(/[^a-z A-Z-'\\n\\r.]+/g, '');\n");
      out.write("}\n");
      out.write("function validatephone(phone) \n");
      out.write("{\n");
      out.write("    var maintainplus = '';\n");
      out.write("    var numval = phone.value\n");
      out.write("    if ( numval.charAt(0)=='+' )\n");
      out.write("    {\n");
      out.write("        var maintainplus = '';\n");
      out.write("    }\n");
      out.write("    curphonevar = numval.replace(/[\\\\A-Za-z!\"£$%^&\\,*+_={};:'@#~,.?\\/<>?|`¬\\]\\[]/g,'');\n");
      out.write("    phone.value = maintainplus + curphonevar;\n");
      out.write("    var maintainplus = '';\n");
      out.write("    phone.focus;\n");
      out.write("}\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"AddPatientToDB\" method=\"post\">\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("     <img src=\"img/log3.png\" width=\"100\" height=\"58\" alt=\"Header Image\" style=\"float: left;display: inline\"/>\n");
      out.write("        \n");
      out.write("     <a class=\"navbar-brand\" href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>  SIGN UP</a>\n");
      out.write("    </div>\n");
      out.write("  <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \n");
      out.write("      <li><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> HOME </a></li>\n");
      out.write("      </ul>\n");
      out.write("  </div></nav>\n");
      out.write("    \n");
      out.write("         <hr>\n");
      out.write("        <div class=\"container\">\n");
      out.write("  \n");
      out.write("  <!-- Trigger the modal with a button -->\n");
      out.write("  <button type=\"button\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"\">CUSTOMER SIGN UP</button>\n");
      out.write("\n");
      out.write("  <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">sign up</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"background-color:black\">\n");
      out.write("        \n");
      out.write("            <pre>\n");
      out.write("           \n");
      out.write("   \n");
      out.write("    <legend><b>First Name</b></legend>\n");
      out.write("    <input type=\"text\" id = \"txt\" onkeyup = \"Validate(this)\" pattern=\"^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$\" placeholder=\"First Name \" name=\"psignup\" class=\"form-control\" required /></input></br>\n");
      out.write("  <legend><b>Password</b></legend>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psignup\" class=\"form-control\" title=\"Minimum 8 characters, one number, one uppercase and one lowercase letter\" required/></br>\n");
      out.write("    <legend><b>Contact</b></legend>\n");
      out.write("    <input type =\"number\"  id=\"phone\" onkeyup=\"validatephone(this);\" maxlength=\"10\"  pattern=\"[0-9]{10}\" placeholder=\"Enter Contact no. \" name=\"psignup\" class=\"form-control\" pattern=\"d{10}\" required /></br>\n");
      out.write("    <legend><b>Address</b></legend>\n");
      out.write("    <textarea class=\"form-control\" name=\"psignup\" placeholder=\"Enter Address\" required /></textarea></br>\n");
      out.write("    <legend><b>Email</b></legend>\n");
      out.write("    <input type=\"text\" id = \"email\" onchange=\"email_validate(this.value);\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" placeholder=\"Enter Email\" name=\"psignup\" class=\"form-control\" title=\"Please enter a valid email\" required /></br>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("    <center><button type=\"submit\" value=\"SUBMIT\" style=\"background:#f44336; color:#fff;\"/> submit</button></center>\n");
      out.write("         </pre>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<hr>\n");
      out.write("        \n");
      out.write("        </br><div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <center><image src=\"img/bb.png\" class=\"img-rounded\" width=\"300\" height=\"300\"> <a href=\"buycar.jsp\"><button type=\"submit\">BUY CAR</button></a></p></center>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("        <center><image src=\"img/ttb.png\" class=\"img-rounded\" width=\"300\" height=\"300\"><a href=\"sellcar.jsp\"><button type=\"submit\">SELL CAR</button></a></center>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("       <center><image src=\"img/ooy.png\" class=\"img-rounded\" width=\"300\" height=\"300\"><a href=\"ViewPatientData\"><button type=\"submit\">SHOW CUSTOMER DETAILS</button></a></center>\n");
      out.write("      </div>\n");
      out.write("            </div></div>\n");
      out.write("   \n");
      out.write("       <hr>\n");
      out.write("        </form>\n");
      out.write("       </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
