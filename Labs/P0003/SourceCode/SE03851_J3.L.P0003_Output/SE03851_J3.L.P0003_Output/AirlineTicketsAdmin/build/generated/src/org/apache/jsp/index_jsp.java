package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.fpt.edu.vn.P0003.Model.*;
import com.fpt.edu.vn.P0003.BAO.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/./common/header.jsp");
    _jspx_dependants.add("/./common/navbar.jsp");
    _jspx_dependants.add("/./common/footer.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Admin page booking ticket</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/styleall.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Cookie cookie[] = request.getCookies();
            Cookie get = null;
            if (cookie != null) {
                for (int i = 0; i < cookie.length; i++) {
                    if (cookie[i].getName().equals("user")) {
                        get = cookie[i];
                    }
                }
            }
            if (get == null) {
                if (session.getAttribute("UserName") == null) {
                    response.sendRedirect("./login.jsp");
                    return;
                }
            }


        
      out.write("\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <nav class=\"navbar navbar-static-top navbar-inverse\" role=\"navigation\">\n");
      out.write("                <div class=\"navbar-custom-menu\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"./index.jsp\"> <i class=\"fa fa-question-circle\"></i> Admin</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                Hello : <span class=\"text-green\">");
                                    
                                    if (cookie != null && get != null) {
                                       out.print(get.getValue());
                                        
                                    }else
                                    if(session.getAttribute("UserName") != null){
                                        out.print(session.getAttribute("UserName"));
                                    }
                                    
      out.write("</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"hidden-xs text-bold text-lime\">Setting</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"hidden-xs text-bold text-lime\">Logout</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">");
      out.write("\n");
      out.write("<!-- Navigation -->\n");

    ListLocation list = new ListLocation(getServletContext());
    ArrayList<Location> ListLocation = list.getListLocation();

      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-2\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h4>Manages</h4>\n");
      out.write("<ul class=\"treeview-menu menu-open\">\n");
      out.write("    <li><a href=\"./index.jsp\">Location</a></li>\n");
      out.write("    <li><a href=\"./aircaft.jsp\">Aircraft </a></li>\n");
      out.write("    <li><a href=\"./flights.jsp\">Flights </a></li>\n");
      out.write("    <li><a href=\"./booking.jsp\">Bookings</a></li>\n");
      out.write("    <li><a href=\"./account.jsp\">Users </a></li>\n");
      out.write("</ul>");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-10 row-right\">\n");
      out.write("        <h4> Location Management </h4>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label>\n");
      out.write("                        Location ID: \n");
      out.write("                    </label>\n");
      out.write("                    <input class=\"form-control\" type=\"number\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <input type=\"submit\" class=\"btn\" value=\"Search\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <table class=\"table table-striped table-bordered table-hover dataTable no-footer dtr-inline\">\n");
      out.write("            <thead>\n");
      out.write("                <tr role=\"row\">\n");
      out.write("                    <th class=\"sorting\" >Local ID</th>\n");
      out.write("                    <th class=\"all sorting\">Country</th>\n");
      out.write("                    <th class=\"all nowrap sorting_disabled\">City</th>\n");
      out.write("                    <th class=\"never sorting\" >Symbol</th>\n");
      out.write("                    <th class=\"all sorting\" >Status</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for (int i = 0; i < ListLocation.size(); i++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( ListLocation.get(i).getLid() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ListLocation.get(i).getCountry());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ListLocation.get(i).getSymbol());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ListLocation.get(i).isStatuss());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"");
      out.print( ListLocation.get(i).getLid() );
      out.write("\">Edit</a>\n");
      out.write("                        <input type=\"checkbox\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <div class=\"text-right\">\n");
      out.write("            <a href=\"./\" class=\"btn btn-primary\">Add new Location</a>\n");
      out.write("            <a href=\"./\" class=\"btn btn-danger\">X</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                ");

                list.close();
                
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
