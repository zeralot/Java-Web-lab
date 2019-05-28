package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.fpt.J3.L.P0001.model.DAO;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      com.fpt.J3.L.P0001.entity.Users loginBean = null;
      synchronized (session) {
        loginBean = (com.fpt.J3.L.P0001.entity.Users) _jspx_page_context.getAttribute("loginBean", PageContext.SESSION_SCOPE);
        if (loginBean == null){
          loginBean = new com.fpt.J3.L.P0001.entity.Users();
          _jspx_page_context.setAttribute("loginBean", loginBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("loginBean"), request);
      out.write("\n");
      out.write("        ");

            String sql = "select * from Users where userName = '" + loginBean.getUserName() + "' and password ='" + loginBean.getPassword() + "'";
            DAO dao = new DAO();
            ResultSet rs = dao.getData(sql);
            if (rs.next()) {
                loginBean.setUserID(rs.getInt(1));
                loginBean.setUserType(rs.getInt(4));
            }
        
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <ul class =\"menu\" data-submenu=\"horizontal\">\n");
      out.write("                    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"home.jsp?goPage=takequiz\">Take Quiz</a></li>\n");
      out.write("                        ");
 if (loginBean.getUserType() == 1) { 
      out.write("\n");
      out.write("                    <li><a href=\"home.jsp?goPage=makequiz\">Make Quiz</a></li>\n");
      out.write("                    <li><a href=\"Controller?service=managequiz\">Manage Quiz</a></li>\n");
      out.write("                        ");
 }
                            if (loginBean.getUserType() != 0) { 
      out.write("\n");
      out.write("                    <li><a href=\"Controller?service=logout\">Logout</a></li>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main\">\n");
      out.write("                ");

                String goPage = (String) request.getParameter("goPage");
                if (goPage == null || loginBean.getUserType() == 0) { 
      out.write("\n");
      out.write("\n");
      out.write("                    ");
  if (goPage != null && goPage.equals("register")) {
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "register.jsp", out, false);
      out.write("\n");
      out.write("                    ");
 } else {
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write("\n");
      out.write("                    ");
 }
                } else if (goPage.equals("takequiz")) {
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "takequiz.jsp", out, false);
      out.write("\n");
      out.write("                ");
 } else if (goPage.equals("makequiz")) {
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "makequiz.jsp", out, false);
      out.write("\n");
      out.write("                ");
 } else if (goPage.equals("managequiz")) {
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "managequiz.jsp", out, false);
      out.write("\n");
      out.write("                ");
 }
      out.write(" \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
