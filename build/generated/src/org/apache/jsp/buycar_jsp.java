package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.geeks.thirdInterImpl;

public final class buycar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write(".carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 20%;\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                background-color:  #f44336;\n");
      out.write("                color: black;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                margin: 4px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 20%;\n");
      out.write("            }\n");
      out.write("             .table > thead > tr > th, .table > tbody > tr > th, .table > tfoot > tr > th, .table > thead > tr > td, .table > tbody > tr > td, .table > tfoot > tr > td {\n");
      out.write("\n");
      out.write("        padding: 1px !important; \n");
      out.write("    }\n");
      out.write("    \n");
      out.write(".modal {\n");
      out.write("display: none; /* Hidden by default */\n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("      /* Sit on top */\n");
      out.write("    left: 0%;\n");
      out.write("     \n");
      out.write("    top: 0%;\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("    height: 300%; /* Full height */\n");
      out.write("   \n");
      out.write("    overflow: auto; /* Enable scroll if needed */\n");
      out.write("    background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("}\n");
      out.write(".modal-list > li > a {\n");
      out.write("  color:#333;\n");
      out.write("  text-decoration: none;\n");
      out.write("  list-style: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: center;\n");
      out.write("}  .confirmBox{\n");
      out.write("    top:25%;\n");
      out.write("    left:100%;\n");
      out.write("}#myModal.modal{\n");
      out.write("     text-align: center;\n");
      out.write("}\n");
      out.write("#myModal.modal::before {\n");
      out.write("     content: \"\";\t  \n");
      out.write("     display: inline-block;\n");
      out.write("     height: 100%;\t \n");
      out.write("     margin-right: -4px;\n");
      out.write("     vertical-align: middle;\n");
      out.write("}\n");
      out.write("#myModal .modal-dialog {\t\n");
      out.write("     display: inline-block;\t\n");
      out.write("     text-align: left;\t\n");
      out.write("     vertical-align:middle ;\n");
      out.write("}\t\n");
      out.write(".modal-body {padding: 2px 16px;\n");
      out.write("            right:0%;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            overflow: auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("                </style>    \n");
      out.write("    </head>\n");
      out.write("    <body background=\"img/ggc.jpg\">\n");
      out.write("        ");

            thirdInterImpl impl = new thirdInterImpl();
            ArrayList list = (ArrayList) impl.list_data();
            request.setAttribute("list", list);

        
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img src=\"img/log3.png\" width=\"135\" height=\"58\" alt=\"Header Image\" style=\"float: left;display: inline\"/>\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;HOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>\n");
      out.write("                        <li><a href=\"sellcar.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; SELL CAR &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>\n");
      out.write("                        <li><a href=\"aboutcar.jsp\"><span class=\"glyphicon glyphicon-leaf\"></span>ABOUT US&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li><a href=\"contactus.jsp\"><span class=\"glyphicon glyphicon-info-sign\"></span>CONTACT US&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a><span class=\"glyphicon glyphicon-user\"></span> WELCOME, ");
      out.print(session.getAttribute("firstname"));
      out.write("</a></li> \n");
      out.write("                    </ul>     \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav> \n");
      out.write("<hr>\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("    \n");
          out.write("<div class=\"container\">\n");
          out.write("  <br>\n");
          out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
          out.write("    <!-- Indicators -->\n");
          out.write("    <ol class=\"carousel-indicators\">\n");
          out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
          out.write("    </ol>\n");
          out.write("    \n");
          out.write("    <div class=\"carousel-inner\" role=\"listbox\" style=\"margin: auto; width: 50%;\">\n");
          out.write("      <div class=\"item active\">\n");
          out.write("              \n");
          out.write("        <center><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getImage_path()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"300\" height=\"300\"/></center>\n");
          out.write("\n");
          out.write("      </div>\n");
          out.write("           <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
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
          out.write("       \n");
          out.write("        <!-- Modal -->\n");
          out.write("        <div class=\"modal fade\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" role=\"dialog\">\n");
          out.write("            <div class=\"modal-dialog modal-lg\" >\n");
          out.write("                <div class=\"modal-content\" style=\"margin: auto; width: 80%; text-align: center;\">\n");
          out.write("                    <div class=\"modal-header\">\n");
          out.write("\n");
          out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
          out.write("                        <h4 class=\"modal-title\" style=\"\">USED CAR DETAILS</h4>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"modal-body\">\n");
          out.write("\n");
          out.write("\n");
          out.write("                        <table class=\"table table-striped table-responsive\">\n");
          out.write("                            <thead>\n");
          out.write("                                <tr>\n");
          out.write("                                    <th>Id</th>\n");
          out.write("                                    <th>MODEL</th>\n");
          out.write("                                    <th>VARIANT</th>\n");
          out.write("                                    <th>REGISTRATIONYEAR</th>\n");
          out.write("                                    <th>COLOR</th>\n");
          out.write("                                    <th>KILOMETERDRIVE</th>\n");
          out.write("                                    <th>OWNERSHIP</th>\n");
          out.write("                                    <th>CITY</th>\n");
          out.write("                                    <th>LOCALITY</th>\n");
          out.write("                                    <th>SELLINGPRICE</th>\n");
          out.write("                                    <th>OWNERNAME</th>\n");
          out.write("                                    <th>EMAIL</th>\n");
          out.write("                                    <th>MOBILENO</th>\n");
          out.write("\n");
          out.write("                                </tr>\n");
          out.write("                            </thead>\n");
          out.write("                            <tbody>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getModel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getVariant()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getRegistrationyear()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getColor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getKilometerdrive()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getOwnership()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getLocality()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getSellingprice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getOwnername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getMobileno()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                                </tr>\n");
          out.write("\n");
          out.write("\n");
          out.write("                            </tbody>\n");
          out.write("\n");
          out.write("                        </table>\n");
          out.write("\n");
          out.write("\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("                </div>\n");
          out.write("\n");
          out.write("            </div>\n");
          out.write("\n");
          out.write("        </div>\n");
          out.write("\n");
          out.write("        <center><button type=\"button\" data-toggle=\"modal\" data-target=\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  style=\"\">DETAILS</button></center> \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
