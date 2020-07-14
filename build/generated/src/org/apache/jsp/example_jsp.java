package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class example_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("           <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <button type=\"button\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"\">CUSTOMER SIGN UP</button>\n");
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
      out.write("    <input type=\"text\" placeholder=\"First Name \" name=\"psignup\" class=\"form-control\" required /></input></br>\n");
      out.write("     <div class=\"row setup-content\" id=\"step-1\">\n");
      out.write("        <div class=\"col-xs-12\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <br>\n");
      out.write("                <h3> Car Details</h3><br>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label w3-text-red\"><span class=\"req\">* </span>model</label>\n");
      out.write("                    <input required=\"required\" name=\"car\" class=\"w3-input w3-border w3-round-xxlarge w3-text-black\"  maxlength=\"100\" type=\"text\" class=\"form-control\" placeholder=\"eg.Dzire\" ></input>\n");
      out.write("                </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     <label class=\"control-label w3-text-red\"><span class=\"req\">* </span>Variant</label>\n");
      out.write("                    <input required=\"required\" name=\"car\" id = \"txt\" onkeyup = \"Validate(this)\" class=\"w3-input w3-border w3-round-xxlarge w3-text-black\"  maxlength=\"100\" type=\"text\" class=\"form-control\" placeholder=\"eg.VXI\"  />\n");
      out.write("                </div>\n");
      out.write("                 </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    <center><button type=\"submit\" value=\"SUBMIT\" style=\"background:#f44336; color:#fff;\"/> submit</button></center>\n");
      out.write("         </pre>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
