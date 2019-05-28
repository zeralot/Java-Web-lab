package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fpt.J3.L.P0002.Model.DBConnect;
import com.fpt.J3.L.P0002.Entity.Customer;
import java.sql.ResultSet;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Home.jsp");
    _jspx_dependants.add("/Login.jsp");
    _jspx_dependants.add("/Register.jsp");
    _jspx_dependants.add("/Booking.jsp");
    _jspx_dependants.add("/ManageBookingSearch.jsp");
    _jspx_dependants.add("/ManageBookingResult.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Airline Tickets</title>\n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("        ");


            String msg = null;
            msg = (String) session.getAttribute("msg");
            if (msg != null) {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert(\"");
      out.print(msg);
      out.write("\");\n");
      out.write("        </script>\n");
      out.write("        ");

                session.removeAttribute("msg");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body style='margin:0px'>\n");
      out.write("        <div class=\"bg1\">\n");
      out.write("            <div class=\"logoheader\">\n");
      out.write("                <img src=\"pic/logo.png\" style=\"width:90%; margin-top: 30px\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textheader\">\n");
      out.write("                <font color=\"white\" size=\"+2\">  Fast, Frequent & Safe Flights </font>\n");
      out.write("            </div>\n");
      out.write("            ");
 Customer cus = (Customer)session.getAttribute("cus");  
      out.write("\n");
      out.write("            <div class=\"buttonheader\">\n");
      out.write("            ");
 if (cus == null) {
      out.write("\n");
      out.write("                <a href=\"index.jsp?service=prelogin\"><img src=\"pic/home.png\" width=\"20%\"></a>\n");
      out.write("                <a href=\"index.jsp?service=preregister\"><img src=\"pic/register_t.png\" width=\"20%\"></a>\n");
      out.write("                <br>\n");
      out.write("                <font color=\"white\" size=\"-1\">\n");
      out.write("                <span style=\"margin-left: 10px\">Login</span> \n");
      out.write("                <span style=\"margin-left: 15px\">Register</span>\n");
      out.write("                </font>\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"hed\">\n");
      out.write("                Hello, ");
      out.print(cus.getFirstname());
      out.write(".\n");
      out.write("                <a href=\"CustomerController?service=logout\">Logout</a> \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
 String service1 = request.getParameter("service");
             if (service1==null) service1="home";
      out.write("\n");
      out.write("            <div style=\"margin-top: 3% \">       \n");
      out.write("                <a href=\"index.jsp?service=home\"><button class=\" menu ");
if(service1.equals("home") || service1.equals("prelogin") || service1.equals("preregister")){
      out.write(" active ");
}
      out.write("\"><font size=\"+2\">Home</font></button></a>\n");
      out.write("                <a href=\"FlightController?service=book\"><button class=\"menu  ");
 if (service1.equals("list")){ 
      out.write(" active ");
}
      out.write(" \"><font size=\"+2\">Book</font></button></a>\n");
      out.write("                <a href=\"index.jsp?service=managebookingsearch\"><button class=\"menu  ");
 if (service1.equals("managebookingsearch") || service1.equals("managebookingresult")){ 
      out.write(" active ");
}
      out.write(" \" style=\"width:20%\"><font size=\"+2\">Manage Booking</font></button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class='index2'>\n");
      out.write("        ");

            String service = request.getParameter("service");
            if (service == null) {
                service = "home";
            }
            if (service.equals("home")) {
        
      out.write("\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        ");
}
            if (service.equals("prelogin") && session.getAttribute("cus") == null) {
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"CustomerController?service=login\" method=\"post\">\n");
      out.write("        <div align=\"center\" style=\"margin-top: 60px; margin-bottom: 50px\">\n");
      out.write("            <font color=\"orange\" size=\"+2\"><b>Login</b></font>\n");
      out.write("            <table class=\"login1\" style=\"margin-top:10px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"width: 20%\">Email</td>\n");
      out.write("                    <td  style=\"width:40%\"><input type=\"email\" name=\"email\" style=\"width:200px\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td ><input type=\"password\" name=\"password\" style=\"width:200px\">\n");
      out.write("                </tr>\n");
      out.write("                <tr style=\"line-height: 60px\">\n");
      out.write("                    <td> </td>\n");
      out.write("                    <td>\n");
      out.write("                        <button class=\"login2\" type=\"submit\"><font color=\"white\">Login</font></button>\n");
      out.write("                        <a href=\"index.jsp?service=preregister\"><button class=\"login2\" type=\"button\"><font color=\"white\">Register</font></button></a>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
} else  if (service.equals("prelogin") && session.getAttribute("cus") != null){ 
      out.write("\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        ");
}
            if (service.equals("preregister") && session.getAttribute("cus") == null) {
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\" style=\"margin-top: 60px; margin-bottom: 100px\">\n");
      out.write("            <font color=\"orange\" size=\"+3\">  Register </font>\n");
      out.write("        \n");
      out.write("        <form action=\"CustomerController?service=register\" method=\"post\" style=\"margin-top: 20px\">\n");
      out.write("        <table style=\"line-height: 30px\">\n");
      out.write("            <tr>\n");
      out.write("                <td><font color=\"orange\" size=\"+1\"> New Account</font>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email\n");
      out.write("                <td><input type=\"email\" name=\"email\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password\n");
      out.write("                <td><input type=\"password\" name=\"pass\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Verify Password\n");
      out.write("                <td><input type=\"password\" name=\"repass\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><font color=\"orange\" size=\"+1\">Contact Information</font>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>First name\n");
      out.write("                <td><input type =\"text\" name=\"firstname\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Last name\n");
      out.write("                <td><input type=\"text\" name=\"lastname\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Address\n");
      out.write("                <td><input type=\"text\" name=\"address\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Phone Number\n");
      out.write("                <td><input type=\"text\" name=\"phonenumber\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Sex\n");
      out.write("                <td><select name=\"sex\">\n");
      out.write("                        <option value=\"0\">Male</option>\n");
      out.write("                        <option value=\"1\">Female</option>\n");
      out.write("                    </select>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Age\n");
      out.write("                <td><input type=\"text\" name=\"age\">\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Card Number\n");
      out.write("                <td><input type=\"text\" name=\"card\">\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"height:50px\">\n");
      out.write("                <td>\n");
      out.write("                <td> <button type=\"submit\" class=\"reg1\"><font color=\"white\">Register</font></button>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
} else  if (service.equals("preregister") && session.getAttribute("cus") != null){ 
      out.write("\n");
      out.write("        ");
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
      out.write("\n");
      out.write("        ");
}
            if (service.equals("list")) {
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            ResultSet rs = (ResultSet) session.getAttribute("rsflight");

        
      out.write("\n");
      out.write("        <div class=\"booking1\">\n");
      out.write("            <div align=\"right\"><b>Deparure: </b>");
      out.print((String) session.getAttribute("from"));
      out.write(" <b>Return: </b>");
      out.print((String) session.getAttribute("to"));
      out.write("</div>\n");
      out.write("            <h1>1. Select Departing Flight</h1>\n");
      out.write("            ");
 while (rs.next()) {
      out.write("\n");
      out.write("            <div class=\"booking2\">\n");
      out.write("                <font  size = \"+1\" > <b> ");
      out.print(rs.getString(2));
      out.write("</b> </font><font color=\"gray\">to </font><font size=\"+1\"><b>");
      out.print(rs.getString(3));
      out.write("</b></font>\n");
      out.write("                <div style=\"margin-left: 20px; margin-top: 10px\">\n");
      out.write("                    <font size='+1' color='orange'><b>");
      out.print(rs.getString(4));
      out.write("</b></font>\n");
      out.write("                    <table class=\"booking3\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td width='20%'>Departs\n");
      out.write("                            <td width='20%'>Arrives\n");
      out.write("                            <td width='20%'>Flight Detail\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                            <td>");
      out.print(rs.getString(6));
      out.write("\n");
      out.write("                            <td>");
      out.print(rs.getString(7));
      out.write("\n");
      out.write("                            <td class=\"booking4\" width=\"250px\"><font color=\"orange\"><input type=\"radio\">$");
      out.print(rs.getInt(8));
      out.write(".00</font>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    Note: Prices quoted are per adult passenger in USD. Unless otherwise stated fares are non refundable, limited changes are permitted changes apply<br>\n");
      out.write("                    Please note that this amount excludes fees and taxes.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div align='right' style='margin-top:10px'>\n");
      out.write("                <a href=\"BookingController?service=add&fid=");
      out.print(rs.getInt(1));
      out.write("\"> <button class=\"booking5\"><font color=\"white\">Save</font></button></a>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
}
            if (service.equals("managebookingsearch")) {
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <font color=\"orange\"><h1>Search Bookings</h1></font>\n");
      out.write("            <form action=\"BookingController?service=search\" method=\"post\">\n");
      out.write("            <div style='margin-left: -25%'>\n");
      out.write("                <input type='radio' name='typeBooking' value='0' checked>Reservation code\n");
      out.write("                <input type='radio' name='typeBooking' value='1'>All Bookings\n");
      out.write("            </div>\n");
      out.write("            <div align='left' style='margin-left: 15%'>\n");
      out.write("                <table style='margin-top:20px'>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter reservation code \n");
      out.write("                        <td><input type='text' name='reservationCode' style='width:300px'>\n");
      out.write("                    </trnh>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                        <td> <button class=\"mbs1\" type=\"submit\"><font color=\"white\"><b>Search</b></font></button>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
}
            if (service.equals("managebookingresult")) {
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mbr1\" class='index1'>\n");
      out.write("            ");


                String msg2 = null;
                msg2 = (String) session.getAttribute("msg");
                if (msg2 != null) {
            
      out.write("\n");
      out.write("            <script>\n");
      out.write("            alert(\"");
      out.print(msg2);
      out.write("\");\n");
      out.write("            </script>\n");
      out.write("            ");

                    session.removeAttribute("msg");
                }
            
      out.write("\n");
      out.write("            ");
 ResultSet rs = (ResultSet) session.getAttribute("rsbooking");

                while (rs.next()) {
      out.write("\n");
      out.write("            <font color='orange' size='+2'><b>eTicket Receipt</b></font><br>\n");
      out.write("            Prepared For<br>\n");
      out.write("            ");
      out.print(rs.getString(16));
      out.write(',');
      out.print(rs.getString(17));
      out.write("<br>\n");
      out.write("            RESERVATION CODE <b>");
      out.print(rs.getInt(1));
      out.write("</b><br>\n");
      out.write("            TICKET ISSUE DATE ");
      out.print(rs.getString(4));
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <font color='orange' size='+2'><b>Itinerary Details</b></font>\n");
      out.write("            <table style='line-height:20px'>\n");
      out.write("                <tr>\n");
      out.write("                    <td width='20%'>TRAVEL DATE\n");
      out.write("                    <td width='20%'>DEPARTURE\n");
      out.write("                    <td width='20%'>ARRIVAL\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString(8));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(6));
      out.write("<br>\n");
      out.write("                        Time ");
      out.print(rs.getString(9));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(7));
      out.write("\n");
      out.write("                        <br>Time ");
      out.print(rs.getString(10));
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            ");
 if (!rs.isLast()) {
      out.write("\n");
      out.write("            <hr align='center' width='80%' class='hr1'>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");

            DBConnect dao = new DBConnect(getServletContext());
            if (dao.getConnect()!=null) dao.close();
            
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
