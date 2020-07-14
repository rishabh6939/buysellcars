package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>J$R motors</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("  footer{\n");
      out.write("    text-align: center;\n");
      out.write("   color: white;\n");
      out.write("  \n");
      out.write("   background-color: #333333;\n");
      out.write("   font-family: arial;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        .carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 40%;\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 5px 10px;\n");
      out.write("    margin: 4px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 30%;\n");
      out.write("}\n");
      out.write("input.ng-invalid.ng-dirty{border:1px solid red;}\n");
      out.write("  body {\n");
      out.write("    background-image: url(\"img/ggc.jpg\");\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <img src=\"img/log3.png\" width=\"100\" height=\"58\" alt=\"Header Image\" style=\"float: left;display: inline\"/>\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        \n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"><span class=\"glyphicon glyphicon-fire\"></span>J&R motors</a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("      \n");
      out.write("      <li><a href=\"aboutcar.jsp\"><span class=\"glyphicon glyphicon-leaf\"></span>About</a></li>\n");
      out.write("      <li><a href=\"contactus.jsp\"><span class=\"glyphicon glyphicon-info-sign\"></span>Contact Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"signin.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign in</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> sign up</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("        </nav>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <hr>\n");
      out.write("          \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"img/image1dd.jpg\" alt=\"Flower\" width=\"260\" height=\"200\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        <div class=\"item\">\n");
      out.write("        <img src=\"img/image2dd.jpg\" alt=\"Flower\" width=\"260\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("        <div class=\"item\">\n");
      out.write("        <img src=\"img/image3dd.jpg\" alt=\"Flower\" width=\"260\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <div class=\"item\">\n");
      out.write("        <img src=\"img/image4dd.jpg\" alt=\"Flower\" width=\"260\" height=\"200\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("        <hr>\n");
      out.write("    \n");
      out.write("         <hr>\n");
      out.write("        \n");
      out.write("        </br><div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <center><image src=\"img/bb.png\" class=\"img-rounded\" width=\"200\" height=\"300\"><br> <li><a href=\"buycar.jsp\"> <button type=\"submit\">BUY CAR</button>  </a></li></center>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("            <center><image src=\"img/ttb.png\" class=\"img-rounded\" width=\"200\" height=\"300\"><br>  <li><a href=\"sellcar.jsp\"><button type=\"submit\">SELL CAR</button> </a></li></center>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("            </div></div>\n");
      out.write("   <hr>\n");
      out.write("  <center> <iframe width=\"420\" height=\"345\" src=\"https://www.youtube.com/embed/XgrvbcTkFHE\">\n");
      out.write("</iframe>\n");
      out.write("<iframe width=\"420\" height=\"345\" src=\"https://www.youtube.com/embed/9N4RpohW-hU\">\n");
      out.write("</iframe>\n");
      out.write("<iframe width=\"420\" height=\"345\" src=\"https://www.youtube.com/embed/sSi8xuRm5eE\">\n");
      out.write("</iframe></center>\n");
      out.write("\n");
      out.write("   <hr>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("   <footer>\n");
      out.write("         <div class=\"container\">\n");
      out.write("\n");
      out.write("              <div class=\"col-sm-4\"><br>\n");
      out.write(" <img src=\"img/log3.png\" width=\"200\" height=\"118\" alt=\"Header Image\" style=\"float: left;display: inline\"/>\n");
      out.write("\n");
      out.write("                  <h1><span class=\"glyphicon glyphicon-fire\"></span>J&R motors</h1>\n");
      out.write("<br></div>\n");
      out.write("             \n");
      out.write("            <div class=\"col-sm-4\"><br>\n");
      out.write("<b>&copy;&nbsp;NIITian<br>\n");
      out.write("          &reg;&nbsp; Pvt.Ltd<br>\n");
      out.write("          \n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4\">\n");
      out.write("    <table>\n");
      out.write("  <tr>\n");
      out.write("    <th colspan=\"5\"><h4>Quick Links</h4></th>\n");
      out.write("  </tr>\n");
      out.write("   <tr>\n");
      out.write("    <td><a href=\"index.html\" style=\"text-decoration: none; color: white\" >&raquo; Home </a></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"buyacar.jsp\" style=\"text-decoration: none; color: white\">&raquo; Buy A Car</a></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"contactus.jsp\" style=\"text-decoration: none; color: white\">&raquo; Contact Us</a></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"sellacar.jsp\" style=\"text-decoration: none; color: white\">&raquo; Sale A Car</a><br></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"aboutcar.jsp\" style=\"text-decoration: none; color: white\">&raquo; About Us</a></br></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("        </div><br></footer> </body>\n");
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
