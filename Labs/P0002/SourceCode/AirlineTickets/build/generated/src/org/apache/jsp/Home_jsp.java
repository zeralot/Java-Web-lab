package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body  >\n");
      out.write("        <div class=\"bghome\">\n");
      out.write("            <div class=\"btnfli\">\n");
      out.write("                <button class=\"btnflight\">Flight</button>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"FlightController?service=search\" method=\"post\"> \n");
      out.write("                <div class=\"fli\">\n");
      out.write("                    <div class=\"fli1\">\n");
      out.write("                        <input type=\"radio\" name=\"trip\" value=\"0\" checked>  Roundtrip \n");
      out.write("                        <input type=\"radio\" name=\"trip\" value=\"1\"> One way\n");
      out.write("                        <table class=\"tblfli\">\n");
      out.write("\n");
      out.write("                            <tr><td>From  </td>\n");
      out.write("                                <td> <select name=\"from\" width=\"500px\">\n");
      out.write("                                        <option value=\"Ha Noi\">Ha Noi</option>\n");
      out.write("                                        <option value=\"Da Nang\">Da Nang</option>\n");
      out.write("                                        <option value=\"Ho Chi Minh\">Ho Chi Minh</option>\n");
      out.write("                                        <option value=\"Hai Phong\">Hai Phong</option>\n");
      out.write("                                    </select></td></tr>\n");
      out.write("                            <tr><td>To  </td>\n");
      out.write("                                <td> <select name=\"to\" width=\"150px\">\n");
      out.write("                                        <option value=\"Ha Noi\">Ha Noi</option>\n");
      out.write("                                        <option value=\"Da Nang\">Da Nang</option>\n");
      out.write("                                        <option value=\"Ho Chi Minh\">Ho Chi Minh</option>\n");
      out.write("                                        <option value=\"Hai Phong\">Hai Phong</option>\n");
      out.write("                                    </select></td></tr>\n");
      out.write("                            <tr><td>Depature </td>\n");
      out.write("                                <td><input type=\"date\" name=\"depart\">\n");
      out.write("                            </tr>\n");
      out.write("                            <tr><td>Return </td>\n");
      out.write("                                <td><input type=\"date\" name=\"retur\">\n");
      out.write("                            <br></tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fli2\">\n");
      out.write("                    <button type=\"submit\" class=\"btnfli2\"><font color=\"white\"><b>Search</b></font></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
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
