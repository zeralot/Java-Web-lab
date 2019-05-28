package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fpt.P0049.DAO.control;
import java.util.Calendar;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssP0049.css\">\n");
      out.write(" \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");
 Calendar theCal = Calendar.getInstance();
            int currYear = theCal.get(Calendar.YEAR);
            int currMonth = theCal.get(Calendar.MONTH);
            int currDay = theCal.get(Calendar.DATE);
            String currYearString = new Integer(currYear).toString();
            String currMonthString = new Integer(currMonth).toString();
            String newMonth = request.getParameter("month");
            String newYear = request.getParameter("year");

            if (newMonth != null) {
                currMonthString = newMonth;
            }
            if (newYear != null) {
                currYearString = newYear;
            }
            int Month = new Integer(currMonthString).intValue();
            int Year = new Integer(currYearString).intValue();
            String monthNames[] = {"Jan", "Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
            String monthName = monthNames[Month];
            int nextMonth = Month + 1;
            int nextYear = Year;
            int prevMonth = Month - 1;
            int prevYear = Year;
            if (prevMonth == -1) {
                prevMonth = 11;
                prevYear--;
            }
            if (nextMonth == 12) {
                nextMonth = 0;
                nextYear++;
            }

        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr> \n");
      out.write("                <td>\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        <input type=\"submit\" value=\"<<\" name=\"prev\"  class = \"button\" />\n");
      out.write("                        <input type=\"hidden\" name=\"month\" value=\"");
      out.print(prevMonth);
      out.write("\" />\n");
      out.write("                        <input type=\"hidden\" name=\"year\" value=\"");
      out.print(prevYear);
      out.write("\" />\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><b>");
      out.print(monthName);
      out.write("</b></td>\n");
      out.write("                <td>\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        <input type=\"submit\" value=\"==\" name=\"curr\" class = \"button\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"month\" value=\"");
      out.print(currMonth);
      out.write("\" />\n");
      out.write("                        <input type=\"hidden\" name=\"year\" value=\"");
      out.print(currYear);
      out.write("\" />\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td><b>");
      out.print( Year);
      out.write("</b></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td>\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        <input type=\"submit\" value=\">>\" name=\"curr\"  class = \"button\" />\n");
      out.write("                        <input type=\"hidden\" name=\"month\" value=\"");
      out.print(nextMonth);
      out.write("\" />\n");
      out.write("                        <input type=\"hidden\" name=\"year\" value=\"");
      out.print(nextYear);
      out.write("\" />\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            <tr> \n");
      out.write("                <th>Sun</th>\n");
      out.write("                <th>Mon</th>\n");
      out.write("                <th>Tue</th>\n");
      out.write("                <th>Wed</th>\n");
      out.write("                <th>Thu</th>\n");
      out.write("                <th>Fri</th>\n");
      out.write("                <th>Sat</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 control aMonth = control.getMonth(Integer.parseInt(currMonthString), Integer.parseInt(currYearString));
                int[][] days = aMonth.getDays();
                for (int i = 0; i < aMonth.getNumOfWeek(); i++) { 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");
 for (int j = 0; j<7; j++) { 
                    if (days[i][j]==0){ 
      out.write("\n");
      out.write("                    <td class=\"empty\">&nbsp;</td>\n");
      out.write("                ");
   } else if(currDay == days[i][j] && currMonth==aMonth.getMonth() && currYear == aMonth.getYear()){ 
      out.write("\n");
      out.write("                    <td class = \"currday\"> ");
      out.print(days[i][j]);
      out.write("</td>\n");
      out.write("                    ");
 } else if(j == 0){ 
      out.write("\n");
      out.write("                    <td class=\"sunday\" >  ");
      out.print(days[i][j]);
      out.write("</td>\n");
      out.write("                    ");
 } else { 
      out.write(" \n");
      out.write("                    <td class = \"normal\"> ");
      out.print(days[i][j]);
      out.write("</td>\n");
      out.write("                    ");
 } //end normal
} // end for j

      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
 } //end for i 

      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>     \n");
      out.write("    </center>\n");
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
