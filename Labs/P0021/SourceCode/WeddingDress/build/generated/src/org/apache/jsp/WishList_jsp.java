package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.fpt.lab221.DAO.DatabaseInvoke;

public final class WishList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- saved from url=(0049)http://www.simplesite.com/us-123wedding/146239000 -->\n");
      out.write("<html lang=\"en-US\" class=\"\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Wishlist - www.simplesite.com/us-123wedding</title>\n");
      out.write("        <meta property=\"og:site_name\" content=\"Maria and Paul&#39;s Wedding\">\n");
      out.write("        <meta property=\"article:publisher\" content=\"https://www.facebook.com/simplesite\">\n");
      out.write("        <meta property=\"og:locale\" content=\"en-US\">\n");
      out.write("        <meta property=\"og:url\" content=\"http://www.simplesite.com/us-123wedding/146239000\">\n");
      out.write("        <meta property=\"og:title\" content=\"Our Wishes:\">\n");
      out.write("        <meta property=\"og:description\" content=\"\">\n");
      out.write("        <meta property=\"og:updated_time\" content=\"2016-06-18T11:22:20.3423407+02:00\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <meta name=\"robots\" content=\"nofollow\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"description\" content=\"Maria and Paul&#39;s Wedding - http://www.simplesite.com/us-123wedding/\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./Prototype/Wishlist - www.simplesite.com_us-123wedding_files/3731000.design.v25490.css\">\n");
      out.write("        <link rel=\"canonical\" href=\"http://www.simplesite.com/us-123wedding/146239000\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"data:image/x-icon;,\">\n");
      out.write("        <script type=\"text/javascript\" async=\"\" src=\"./Prototype/Wishlist - www.simplesite.com_us-123wedding_files/analytics.js\"></script><script async=\"\" src=\"./Prototype/Wishlist - www.simplesite.com_us-123wedding_files/gtm.js\"></script><script type=\"text/javascript\" src=\"./Prototype/Wishlist - www.simplesite.com_us-123wedding_files/FrontendAppLocalePage.aspx\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./Prototype/Wishlist - www.simplesite.com_us-123wedding_files/frontendApp.min.js\"></script>\n");
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
      out.write("        <style type=\"text/css\">.fancybox-margin{margin-right:17px;}</style></head>\n");
      out.write("    <body data-pid=\"146239000\" data-iid=\"\">\n");
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
      out.write("                                        </li><li class=\" active \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"WishList.jsp\">Wishlist</a>\n");
      out.write("                                        </li><li class=\" \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"Guestbook.jsp\">Guestbook</a>\n");
      out.write("                                        </li><li class=\"  \" style=\"\">\n");
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
      out.write("                            <div class=\"wrapper \">\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"section article\">\n");
      out.write("                                        <div class=\"heading\">\n");
      out.write("                                            <h3>Our Wishes:</h3>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                             ");
 DatabaseInvoke db = new DatabaseInvoke();
                                                ServletContext sc = getServletContext();
                                                db.connectToDatabase(sc);
                                                String sql = "select * from WishList";
                                                ResultSet rs = db.getData(sql);
                                                while (rs.next()) {
      out.write("\n");
      out.write("                                            <p>");
      out.print(rs.getString(2));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                            ");
 }
      out.write("  </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
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
      out.write("                                                <li><a id=\"share-facebook\" href=\"http://www.simplesite.com/us-123wedding/146239000#\"><i class=\"icon-facebook-sign\"></i><span>Share on Facebook</span></a></li>\n");
      out.write("                                                <li><a id=\"share-twitter\" href=\"http://www.simplesite.com/us-123wedding/146239000#\"><i class=\"icon-twitter-sign\"></i><span>Share on Twitter</span></a></li>\n");
      out.write("                                                <li><a id=\"share-google-plus\" href=\"http://www.simplesite.com/us-123wedding/146239000#\"><i class=\"icon-google-plus-sign\"></i><span>Share on Google+</span></a></li>    \n");
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
      out.write("                    <div class=\"footer-page-counter\" style=\"display: block;\">\n");
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
      out.write("        <input type=\"hidden\" id=\"anti-forgery-token\" value=\"vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjadE686Sjhc6oDKZlJnux560OQS9Z21TbBWy2dvAyPVKGaADoSowBBR+wcCDeRiOhkPkqHsUvOn9PEJU9Zxmw0A==\">\n");
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
