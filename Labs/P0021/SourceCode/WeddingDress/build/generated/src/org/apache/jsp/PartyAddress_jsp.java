package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.fpt.lab221.DAO.DatabaseInvoke;

public final class PartyAddress_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- saved from url=(0049)http://www.simplesite.com/us-123wedding/146239003 -->\n");
      out.write("<html lang=\"en-US\" class=\"\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><style type=\"text/css\">.gm-style .gm-style-mtc label,.gm-style .gm-style-mtc div{font-weight:400}</style><style type=\"text/css\">.gm-style-pbc{transition:opacity ease-in-out;background-color:black;text-align:center}.gm-style-pbt{font-size:22px;color:white;font-family:Roboto,Arial,sans-serif;position:relative;margin:0;top:50%;-webkit-transform:translateY(-50%);-ms-transform:translateY(-50%);transform:translateY(-50%)}</style><link type=\"text/css\" rel=\"stylesheet\" href=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/css\"><style type=\"text/css\">.gm-style .gm-style-cc span,.gm-style .gm-style-cc a,.gm-style .gm-style-mtc div{font-size:10px}</style><style type=\"text/css\">@media print {  .gm-style .gmnoprint, .gmnoprint {    display:none  }}@media screen {  .gm-style .gmnoscreen, .gmnoscreen {    display:none  }}</style><style type=\"text/css\">.gm-style{font-family:Roboto,Arial,sans-serif;font-size:11px;font-weight:400;text-decoration:none}.gm-style img{max-width:none}</style><script type=\"text/javascript\" async=\"\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/analytics.js\"></script>\n");
      out.write("        <title>Party Address - www.simplesite.com/us-123wedding</title>\n");
      out.write("        <meta property=\"og:site_name\" content=\"Maria and Paul&#39;s Wedding\">\n");
      out.write("        <meta property=\"article:publisher\" content=\"https://www.facebook.com/simplesite\">\n");
      out.write("        <meta property=\"og:locale\" content=\"en-US\">\n");
      out.write("        <meta property=\"og:url\" content=\"http://www.simplesite.com/us-123wedding/146239003\">\n");
      out.write("        <meta property=\"og:title\" content=\"Party Address\">\n");
      out.write("        <meta property=\"og:image\" content=\"http://maps.googleapis.com/maps/api/staticmap?center=40.7127837%2c-74.00594130000002&amp;zoom=9&amp;size=1200x630&amp;maptype=roadmap&amp;sensor=false&amp;markers=40.7127837%2c-74.00594130000002\">\n");
      out.write("        <meta property=\"og:updated_time\" content=\"2016-06-18T11:22:30.8883463+02:00\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <meta name=\"robots\" content=\"nofollow\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"description\" content=\"Maria and Paul&#39;s Wedding - http://www.simplesite.com/us-123wedding/\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/3731000.design.v25490.css\">\n");
      out.write("        <link rel=\"canonical\" href=\"http://www.simplesite.com/us-123wedding/146239003\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"data:image/x-icon;,\">\n");
      out.write("        <script async=\"\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/gtm.js\"></script><script type=\"text/javascript\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/FrontendAppLocalePage.aspx\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/frontendApp.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">if (typeof window.jQuery == \"undefined\") {\n");
      out.write("                (function () {\n");
      out.write("                    var a = document.createElement(\"script\");\n");
      out.write("                    a.type = \"text/javascript\";\n");
      out.write("                    a.src = \"/c/js/version3/frontendApp/init/frontendApp.min.js?_v=b8e7069b6e4fecc37c8394dc153e5d4f\";\n");
      out.write("                    document.getElementsByTagName('head')[0].appendChild(a);\n");
      out.write("                })();\n");
      out.write("            }</script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">var css_simplesite_com_fallback_element = document.getElementById('css_simplesite_com_fallback');\n");
      out.write("            if (typeof css_simplesite_com_fallback_element !== 'undefined' && css_simplesite_com_fallback_element !== null) {\n");
      out.write("                var isVisible = css_simplesite_com_fallback_element.offsetParent !== null\n");
      out.write("                if (isVisible) {\n");
      out.write("                    var head = document.head, link = document.createElement('link');\n");
      out.write("\n");
      out.write("                    link.type = 'text/css';\n");
      out.write("                    link.rel = 'stylesheet';\n");
      out.write("                    link.href = '{/d/designs/3731000.design.v25490.css}';\n");
      out.write("\n");
      out.write("                    head.appendChild(link);\n");
      out.write("                }\n");
      out.write("            }</script>\n");
      out.write("        <style type=\"text/css\">.fancybox-margin{margin-right:17px;}</style><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/common.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/map.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/util.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/marker.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/infowindow.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/onion.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/ViewportInfoService.GetViewportInfo\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/stats.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/controls.js\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt\"></script><script type=\"text/javascript\" charset=\"UTF-8\" src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/AuthenticationService.Authenticate\"></script></head>\n");
      out.write("    <body data-pid=\"146239003\" data-iid=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid site-wrapper\"> <!-- this is the Sheet -->\n");
      out.write("            <div class=\"container-fluid header-wrapper \" id=\"header\"> <!-- this is the Header Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"title-wrapper\">\n");
      out.write("                        <div class=\"title-wrapper-inner\">\n");
      out.write("                            <a rel=\"nofollow\" class=\"logo \" href=\"http://www.simplesite.com/us-123wedding/\">\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"title \">\n");
      out.write("                                Maria and Paul's Wedding\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subtitle\">\n");
      out.write("                                Welcome to our website\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  <!-- these are the titles -->\n");
      out.write("                    <div class=\"navbar navbar-compact\">\n");
      out.write("                        <div class=\"navbar-inner\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <!-- .btn-navbar is used as the toggle for collapsed navbar content -->\n");
      out.write("                                <a rel=\"nofollow\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\" title=\"Toggle menu\">\n");
      out.write("                                    <span class=\"menu-name\">Menu</span>\n");
      out.write("                                    <span class=\"menu-bars\">\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                        <span class=\"icon-bar\"></span>\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- Everything you want hidden at 940px or less, place within here -->\n");
      out.write("                                <div class=\"nav-collapse collapse\">\n");
      out.write("                                    <ul class=\"nav\" id=\"topMenu\" data-submenu=\"horizontal\">\n");
      out.write("                                        <li class=\"  \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"Wedding Blog.jsp\">Wedding Blog</a>\n");
      out.write("                                        </li><li class=\"  \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"Photo.jsp\">Photo Album</a>\n");
      out.write("                                        </li><li class=\"  \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"WishList.jsp\">Wishlist</a>\n");
      out.write("                                        </li><li class=\"  \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"Guestbook.jsp\">Guestbook</a>\n");
      out.write("                                        </li><li class=\" active \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"PartyAddress.jsp\">Party Address</a>\n");
      out.write("                                        </li>                </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- this is the Menu content -->\n");
      out.write("                </div>\n");
      out.write("            </div>  <!-- this is the Header content -->\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid content-wrapper\" id=\"content\"> <!-- this is the Content Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row-fluid content-inner\">\n");
      out.write("                        <div id=\"left\" class=\"span9\"> <!-- ADD \"span12\" if no sidebar, or \"span9\" with sidebar -->\n");
      out.write("                            <div class=\"wrapper map-page\">\n");
      out.write("                                <div class=\"heading\">\n");
      out.write("                                    <h1 class=\"page-title\">Party Address</h1>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("\n");
      out.write("                                            <div class=\"row-fluid map-page-info\">\n");
      out.write("                                                <div class=\"span6\">\n");
      out.write("                                                    <div class=\"item\">\n");
      out.write("                                                        <div class=\"heading\">\n");
      out.write("                                                            <h4 class=\"item-title map-page-title\">Address:</h4>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"content\">\n");
      out.write("                                                            ");
 DatabaseInvoke db = new DatabaseInvoke();
                                                                ServletContext sc = getServletContext();
                                                                db.connectToDatabase(sc);
                                                                String sql = "select * from PartyAddress";
                                                                ResultSet rs = db.getData(sql);
                                                                if (rs.next()) {
                                                            
      out.write("\n");
      out.write("                                                            <div class=\"country\">\n");
      out.write("                                                                <p>");
      out.print(rs.getString(1));
      out.write("</p>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"row-fluid\">\n");
      out.write("                                                                <div class=\"span2\">\n");
      out.write("\n");
      out.write("                                                                </div>    \n");
      out.write("                                                                <div class=\"span10\">\n");
      out.write("\n");
      out.write("                                                                </div>    \n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"row-fluid\">\n");
      out.write("                                                                <div class=\"span2\">\n");
      out.write("                                                                    Email:\n");
      out.write("                                                                </div>    \n");
      out.write("                                                                <div class=\"span10\">\n");
      out.write("                                                                    ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("                                                                </div> ");
 }
      out.write("   \n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"span6\">\n");
      out.write("                                                    <div class=\"item\">\n");
      out.write("                                                        <div class=\"heading\">\n");
      out.write("                                                            <h4 class=\"item-title map-page-title\"></h4>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"content\">\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <div class=\"map-container\">\n");
      out.write("                                                <div id=\"mapCanvas\" data-ss=\"map\" class=\"google-map\" data-zoom=\"9\" data-lat=\"40.7127837\" data-lng=\"-74.00594130000002\" data-maptype=\"roadmap\" data-bubbletext=\"\" data-showbubble=\"True\" data-culture=\"en-US\" style=\"position: relative; overflow: hidden; transform: translateZ(0px); background-color: rgb(229, 227, 223);\"><div class=\"gm-style\" style=\"position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;\"><div style=\"position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0; cursor: url(&quot;http://maps.gstatic.com/mapfiles/openhand_8_8.cur&quot;) 8 8, default;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 1; width: 100%; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 0, 0);\"><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 100; width: 100%;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: 0;\"><div aria-hidden=\"true\" style=\"position: absolute; left: 0px; top: 0px; z-index: 1; visibility: inherit;\"><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 159px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 415px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 415px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 159px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 159px; top: 383px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 415px; top: 383px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: -97px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 671px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: -97px; top: 383px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 671px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: -97px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; transform: translateZ(0px); position: absolute; left: 671px; top: 383px;\"></div></div></div></div><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 101; width: 100%;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 102; width: 100%;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 103; width: 100%;\"><div style=\"position: absolute; left: 0px; top: 0px; z-index: -1;\"><div aria-hidden=\"true\" style=\"position: absolute; left: 0px; top: 0px; z-index: 1; visibility: inherit;\"><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 159px; top: 127px;\"><canvas draggable=\"false\" height=\"256\" width=\"256\" style=\"-webkit-user-select: none; position: absolute; left: 0px; top: 0px; height: 256px; width: 256px;\"></canvas></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 415px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 415px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 159px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 159px; top: 383px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 415px; top: 383px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: -97px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 671px; top: 127px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: -97px; top: 383px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 671px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: -97px; top: -129px;\"></div><div style=\"width: 256px; height: 256px; overflow: hidden; transform: translateZ(0px); position: absolute; left: 671px; top: 383px;\"></div></div></div></div><div style=\"position: absolute; z-index: 0; transform: translateZ(0px); left: 0px; top: 0px;\"><div style=\"overflow: hidden; width: 700px; height: 512px;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/StaticMapService.GetMapImage\" style=\"width: 700px; height: 512px;\"></div></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 0;\"><div aria-hidden=\"true\" style=\"position: absolute; left: 0px; top: 0px; z-index: 1; visibility: inherit;\"><div style=\"transform: translateZ(0px); position: absolute; left: 415px; top: 127px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(1)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 159px; top: 127px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(2)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 415px; top: -129px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(3)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 159px; top: -129px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(4)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 159px; top: 383px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(5)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 415px; top: 383px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(6)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: -97px; top: 127px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(7)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 671px; top: 127px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(8)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 671px; top: -129px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(9)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: -97px; top: -129px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(10)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 671px; top: 383px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(11)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: -97px; top: 383px; transition: opacity 200ms ease-out;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/vt(12)\" draggable=\"false\" alt=\"\" style=\"position: absolute; left: 0px; top: 0px; width: 256px; height: 256px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div></div></div></div><div class=\"gm-style-pbc\" style=\"position: absolute; left: 0px; top: 0px; z-index: 2; width: 100%; height: 100%; transition-duration: 0.3s; opacity: 0; display: none;\"><p class=\"gm-style-pbt\">Use two fingers to move the map</p></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 3; width: 100%; height: 100%;\"></div><div style=\"position: absolute; left: 0px; top: 0px; z-index: 4; width: 100%; transform-origin: 0px 0px 0px; transform: matrix(1, 0, 0, 1, 0, 0);\"><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 104; width: 100%;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 105; width: 100%;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 106; width: 100%;\"></div><div style=\"transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 107; width: 100%;\"></div></div></div><div style=\"margin-left: 5px; margin-right: 5px; z-index: 1000000; position: absolute; left: 0px; bottom: 0px;\"><a target=\"_blank\" href=\"https://maps.google.com/maps?ll=40.712784,-74.005941&amp;z=9&amp;t=m&amp;hl=en-US&amp;gl=US&amp;mapclient=apiv3\" title=\"Click to see this area on Google Maps\" style=\"position: static; overflow: visible; float: none; display: inline;\"><div style=\"width: 66px; height: 26px; cursor: pointer;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/google4.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: 0px; width: 66px; height: 26px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\"></div></a></div><div style=\"padding: 15px 21px; border: 1px solid rgb(171, 171, 171); font-family: Roboto, Arial, sans-serif; color: rgb(34, 34, 34); box-shadow: rgba(0, 0, 0, 0.2) 0px 4px 16px; z-index: 10000002; display: none; width: 256px; height: 148px; position: absolute; left: 200px; top: 166px; background-color: white;\"><div style=\"padding: 0px 0px 10px; font-size: 16px;\">Map Data</div><div style=\"font-size: 13px;\">Map data ©2016 Google</div><div style=\"width: 13px; height: 13px; overflow: hidden; position: absolute; opacity: 0.7; right: 12px; top: 12px; z-index: 10000; cursor: pointer;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/mapcnt6.png\" draggable=\"false\" style=\"position: absolute; left: -2px; top: -336px; width: 59px; height: 492px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div></div><div class=\"gmnoprint\" style=\"z-index: 1000001; position: absolute; right: 166px; bottom: 0px; width: 121px;\"><div draggable=\"false\" class=\"gm-style-cc\" style=\"-webkit-user-select: none; height: 14px; line-height: 14px;\"><div style=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\"><div style=\"width: 1px;\"></div><div style=\"width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);\"></div></div><div style=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; vertical-align: middle; display: inline-block;\"><a style=\"color: rgb(68, 68, 68); text-decoration: none; cursor: pointer; display: none;\">Map Data</a><span style=\"\">Map data ©2016 Google</span></div></div></div><div class=\"gmnoscreen\" style=\"position: absolute; right: 0px; bottom: 0px;\"><div style=\"font-family: Roboto, Arial, sans-serif; font-size: 11px; color: rgb(68, 68, 68); direction: ltr; text-align: right; background-color: rgb(245, 245, 245);\">Map data ©2016 Google</div></div><div class=\"gmnoprint gm-style-cc\" draggable=\"false\" style=\"z-index: 1000001; -webkit-user-select: none; height: 14px; line-height: 14px; position: absolute; right: 95px; bottom: 0px;\"><div style=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\"><div style=\"width: 1px;\"></div><div style=\"width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);\"></div></div><div style=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; vertical-align: middle; display: inline-block;\"><a href=\"https://www.google.com/intl/en-US_US/help/terms_maps.html\" target=\"_blank\" style=\"text-decoration: none; cursor: pointer; color: rgb(68, 68, 68);\">Terms of Use</a></div></div><div style=\"width: 25px; height: 25px; overflow: hidden; display: none; margin: 10px 14px; position: absolute; top: 0px; right: 0px;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/sv5.png\" draggable=\"false\" class=\"gm-fullscreen-control\" style=\"position: absolute; left: -52px; top: -86px; width: 164px; height: 112px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px;\"></div><div draggable=\"false\" class=\"gm-style-cc\" style=\"-webkit-user-select: none; height: 14px; line-height: 14px; position: absolute; right: 0px; bottom: 0px;\"><div style=\"opacity: 0.7; width: 100%; height: 100%; position: absolute;\"><div style=\"width: 1px;\"></div><div style=\"width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);\"></div></div><div style=\"position: relative; padding-right: 6px; padding-left: 6px; font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); white-space: nowrap; direction: ltr; text-align: right; vertical-align: middle; display: inline-block;\"><a target=\"_new\" title=\"Report errors in the road map or imagery to Google\" href=\"https://www.google.com/maps/@40.7127837,-74.0059413,9z/data=!10m1!1e1!12b1?source=apiv3&amp;rapsrc=apiv3\" style=\"font-family: Roboto, Arial, sans-serif; font-size: 10px; color: rgb(68, 68, 68); text-decoration: none; position: relative;\">Report a map error</a></div></div><div class=\"gmnoprint gm-bundled-control gm-bundled-control-on-bottom\" draggable=\"false\" controlwidth=\"28\" controlheight=\"93\" style=\"margin: 10px; -webkit-user-select: none; position: absolute; bottom: 107px; right: 28px;\"><div class=\"gmnoprint\" controlwidth=\"28\" controlheight=\"55\" style=\"position: absolute; left: 0px; top: 38px;\"><div draggable=\"false\" style=\"-webkit-user-select: none; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; border-radius: 2px; cursor: pointer; width: 28px; height: 55px; background-color: rgb(255, 255, 255);\"><div title=\"Zoom in\" style=\"position: relative; width: 28px; height: 27px; left: 0px; top: 0px;\"><div style=\"overflow: hidden; position: absolute; width: 15px; height: 15px; left: 7px; top: 6px;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/tmapctrl.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: 0px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none; width: 120px; height: 54px;\"></div></div><div style=\"position: relative; overflow: hidden; width: 67%; height: 1px; left: 16%; top: 0px; background-color: rgb(230, 230, 230);\"></div><div title=\"Zoom out\" style=\"position: relative; width: 28px; height: 27px; left: 0px; top: 0px;\"><div style=\"overflow: hidden; position: absolute; width: 15px; height: 15px; left: 7px; top: 6px;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/tmapctrl.png\" draggable=\"false\" style=\"position: absolute; left: 0px; top: -15px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none; width: 120px; height: 54px;\"></div></div></div></div><div class=\"gm-svpc\" controlwidth=\"28\" controlheight=\"28\" style=\"box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; border-radius: 2px; width: 28px; height: 28px; cursor: url(&quot;http://maps.gstatic.com/mapfiles/openhand_8_8.cur&quot;) 8 8, default; position: absolute; left: 0px; top: 0px; background-color: rgb(255, 255, 255);\"><div style=\"position: absolute; left: 1px; top: 1px;\"></div><div style=\"position: absolute; left: 1px; top: 1px;\"><div aria-label=\"Street View Pegman Control\" style=\"width: 26px; height: 26px; overflow: hidden; position: absolute; left: 0px; top: 0px;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/cb_scout5.png\" draggable=\"false\" style=\"position: absolute; left: -147px; top: -26px; width: 215px; height: 835px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div aria-label=\"Pegman is on top of the Map\" style=\"width: 26px; height: 26px; overflow: hidden; position: absolute; left: 0px; top: 0px; visibility: hidden;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/cb_scout5.png\" draggable=\"false\" style=\"position: absolute; left: -147px; top: -52px; width: 215px; height: 835px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div aria-label=\"Street View Pegman Control\" style=\"width: 26px; height: 26px; overflow: hidden; position: absolute; left: 0px; top: 0px; visibility: hidden;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/cb_scout5.png\" draggable=\"false\" style=\"position: absolute; left: -147px; top: -78px; width: 215px; height: 835px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div></div></div><div class=\"gmnoprint\" controlwidth=\"28\" controlheight=\"0\" style=\"display: none; position: absolute;\"><div title=\"Rotate map 90 degrees\" style=\"width: 28px; height: 28px; overflow: hidden; position: absolute; border-radius: 2px; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; cursor: pointer; display: none; background-color: rgb(255, 255, 255);\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/tmapctrl4.png\" draggable=\"false\" style=\"position: absolute; left: -141px; top: 6px; width: 170px; height: 54px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div><div class=\"gm-tilt\" style=\"width: 28px; height: 28px; overflow: hidden; position: absolute; border-radius: 2px; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; top: 0px; cursor: pointer; background-color: rgb(255, 255, 255);\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/tmapctrl4.png\" draggable=\"false\" style=\"position: absolute; left: -141px; top: -13px; width: 170px; height: 54px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;\"></div></div></div><div class=\"gmnoprint\" style=\"margin: 10px; z-index: 0; position: absolute; cursor: pointer; left: 0px; top: 0px;\"><div class=\"gm-style-mtc\" style=\"float: left;\"><div draggable=\"false\" title=\"Show street map\" style=\"direction: ltr; overflow: hidden; text-align: center; position: relative; color: rgb(0, 0, 0); font-family: Roboto, Arial, sans-serif; -webkit-user-select: none; font-size: 11px; padding: 8px; border-bottom-left-radius: 2px; border-top-left-radius: 2px; -webkit-background-clip: padding-box; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; min-width: 21px; font-weight: 500; background-color: rgb(255, 255, 255); background-clip: padding-box;\">Map</div><div style=\"z-index: -1; padding: 2px; border-bottom-left-radius: 2px; border-bottom-right-radius: 2px; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; position: absolute; left: 0px; top: 38px; text-align: left; display: none; background-color: white;\"><div draggable=\"false\" title=\"Show street map with terrain\" style=\"color: rgb(0, 0, 0); font-family: Roboto, Arial, sans-serif; -webkit-user-select: none; font-size: 11px; padding: 6px 8px 6px 6px; direction: ltr; text-align: left; white-space: nowrap; background-color: rgb(255, 255, 255);\"><span role=\"checkbox\" style=\"box-sizing: border-box; position: relative; line-height: 0; font-size: 0px; margin: 0px 5px 0px 0px; display: inline-block; border: 1px solid rgb(198, 198, 198); border-radius: 1px; width: 13px; height: 13px; vertical-align: middle; background-color: rgb(255, 255, 255);\"><div style=\"position: absolute; left: 1px; top: -2px; width: 13px; height: 11px; overflow: hidden; display: none;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/imgs8.png\" draggable=\"false\" style=\"position: absolute; left: -52px; top: -44px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none; width: 68px; height: 67px;\"></div></span><label style=\"vertical-align: middle; cursor: pointer;\">Terrain</label></div></div></div><div class=\"gm-style-mtc\" style=\"float: left;\"><div draggable=\"false\" title=\"Show satellite imagery\" style=\"direction: ltr; overflow: hidden; text-align: center; position: relative; color: rgb(86, 86, 86); font-family: Roboto, Arial, sans-serif; -webkit-user-select: none; font-size: 11px; padding: 8px; border-bottom-right-radius: 2px; border-top-right-radius: 2px; -webkit-background-clip: padding-box; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; border-left-width: 0px; min-width: 37px; background-color: rgb(255, 255, 255); background-clip: padding-box;\">Satellite</div><div style=\"z-index: -1; padding: 2px; border-bottom-left-radius: 2px; border-bottom-right-radius: 2px; box-shadow: rgba(0, 0, 0, 0.298039) 0px 1px 4px -1px; position: absolute; right: 0px; top: 38px; text-align: left; display: none; background-color: white;\"><div draggable=\"false\" title=\"Show imagery with street names\" style=\"color: rgb(0, 0, 0); font-family: Roboto, Arial, sans-serif; -webkit-user-select: none; font-size: 11px; padding: 6px 8px 6px 6px; direction: ltr; text-align: left; white-space: nowrap; background-color: rgb(255, 255, 255);\"><span role=\"checkbox\" style=\"box-sizing: border-box; position: relative; line-height: 0; font-size: 0px; margin: 0px 5px 0px 0px; display: inline-block; border: 1px solid rgb(198, 198, 198); border-radius: 1px; width: 13px; height: 13px; vertical-align: middle; background-color: rgb(255, 255, 255);\"><div style=\"position: absolute; left: 1px; top: -2px; width: 13px; height: 11px; overflow: hidden;\"><img src=\"./Prototype/Party Address - www.simplesite.com_us-123wedding_files/imgs8.png\" draggable=\"false\" style=\"position: absolute; left: -52px; top: -44px; -webkit-user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none; width: 68px; height: 67px;\"></div></span><label style=\"vertical-align: middle; cursor: pointer;\">Labels</label></div></div></div></div></div></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"right\" class=\"span3\">\n");
      out.write("                            <div class=\"sidebar\">\n");
      out.write("                                <div class=\"wrapper share-box\">\n");
      out.write("                                    <div class=\"heading\">\n");
      out.write("                                        <h4>Share this page</h4>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"content\"><span><ul>\n");
      out.write("                                                <li><a id=\"share-facebook\" href=\"http://www.simplesite.com/us-123wedding/146239003#\"><i class=\"icon-facebook-sign\"></i><span>Share on Facebook</span></a></li>\n");
      out.write("                                                <li><a id=\"share-twitter\" href=\"http://www.simplesite.com/us-123wedding/146239003#\"><i class=\"icon-twitter-sign\"></i><span>Share on Twitter</span></a></li>\n");
      out.write("                                                <li><a id=\"share-google-plus\" href=\"http://www.simplesite.com/us-123wedding/146239003#\"><i class=\"icon-google-plus-sign\"></i><span>Share on Google+</span></a></li>    \n");
      out.write("                                            </ul></span></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("                </div>\n");
      out.write("            </div>  <!-- the controller has determined which view to be shown in the content -->\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid footer-wrapper\" id=\"footer\"> <!-- this is the Footer Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"footer-info\">\n");
      out.write("                        <div class=\"footer-powered-by\">\n");
      out.write("                            <a rel=\"nofollow\" href=\"http://www.simplesite.com/\">Created with SimpleSite</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   <div class=\"footer-page-counter\" style=\"display: block;\">\n");
      out.write("                        ");

                            int trackVisit = 0;
                            java.util.Enumeration e = session.getAttributeNames();
                            if (e.hasMoreElements()) {
                                sql = "select * from TrackViewer";
                                rs = null;
                                rs = db.getData(sql);
                                if (rs.next()) {
                                    trackVisit = rs.getInt(1);
                                }
                            } else {
                                sql = "select * from TrackViewer";
                                rs = null;
                                rs = db.getData(sql);

                                if (rs.next()) {
                                    trackVisit = rs.getInt(1);
                                }
                                db.updateView(trackVisit);
                                trackVisit++;
                                session.setAttribute("track", 1);
//                                session.setMaxInactiveInterval(30);

                            }

                        
      out.write("\n");
      out.write("                        ");
  while (trackVisit != 0) {

                        
      out.write("\n");
      out.write("\n");
      out.write("                        <span class=\"footer-page-counter-item\">");
      out.print(trackVisit % 10);
      out.write("</span>\n");
      out.write("                        ");
trackVisit = trackVisit / 10;
                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"css_simplesite_com_fallback\" class=\"hide\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>  <!-- this is the Footer content -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" id=\"anti-forgery-token\" value=\"vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjadE686Sjhc6oDKZlJnux53xbgXcID/EC8qApGnWnWuMKKdJJRMxSbdXc0VxdX8ZQvYsBRgJ6tQILywcLICUA+g==\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            dataLayer = [{\"SiteVer\": \"US\", \"MainOrUser\": \"UserPage\", \"PreOrFre\": \"Free\", \"Language\": \"en\", \"Culture\": \"en-US\", \"Instrumentation\": \"ShowPage\", \"Market\": \"DK\"}];\n");
      out.write("        </script>\n");
      out.write("        <!-- Google Tag Manager -->\n");
      out.write("        <noscript>&lt;iframe src=\"//www.googletagmanager.com/ns.html?id=GTM-2MMH\"\n");
      out.write("        height=\"0\" width=\"0\" style=\"display:none;visibility:hidden\"&gt;&lt;/iframe&gt;</noscript>\n");
      out.write("        <script>(function (w, d, s, l, i) {\n");
      out.write("                {\n");
      out.write("                    w[l] = w[l] || [];\n");
      out.write("                    w[l].push({'gtm.start':\n");
      out.write("                                new Date().getTime(), event: 'gtm.js'});\n");
      out.write("                    var f = d.getElementsByTagName(s)[0],\n");
      out.write("                            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : '';\n");
      out.write("                    j.async = true;\n");
      out.write("                    j.src =\n");
      out.write("                            '//www.googletagmanager.com/gtm.js?id=' + i + dl;\n");
      out.write("                    f.parentNode.insertBefore(j, f);\n");
      out.write("                }\n");
      out.write("            })(window, document, 'script', 'dataLayer', 'GTM-2MMH');</script>\n");
      out.write("        <!-- End Google Tag Manager -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Remove after blog exp concludes -->\n");
      out.write("        <!-- Remove after expeirment is done-->\n");
      out.write("\n");
      out.write("        <div id=\"sm2-container\" class=\"movieContainer high_performance\" style=\"z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden; visibility: hidden;\"><embed name=\"sm2movie\" id=\"sm2movie\" src=\"/Images/sm297/soundmanager2_flash9.swf\" quality=\"high\" allowscriptaccess=\"always\" bgcolor=\"#ffffff\" pluginspage=\"www.macromedia.com/go/getflashplayer\" title=\"JS/Flash audio component (SoundManager 2)\" type=\"application/x-shockwave-flash\" wmode=\"transparent\" haspriority=\"true\"></div></body></html>");
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
