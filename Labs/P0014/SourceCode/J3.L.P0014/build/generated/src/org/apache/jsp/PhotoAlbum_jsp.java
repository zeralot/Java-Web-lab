package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.fpt.J3LP0014.dao.DAO;

public final class PhotoAlbum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en-US\" class=\"\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Photo Album</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/8488947.design.v26374.css\">\n");
      out.write("        <link rel=\"canonical\" href=\"http://us-123hiking.simplesite.com/411163283\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"data:image/x-icon;,\">\n");
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
      out.write("                    link.href = '{/d/designs/8488947.design.v26374.css}';\n");
      out.write("\n");
      out.write("                    head.appendChild(link);\n");
      out.write("                }\n");
      out.write("            }</script>\n");
      out.write("        <style type=\"text/css\">.fancybox-margin{margin-right:17px;}</style></head>\n");
      out.write("    <body data-pid=\"411163283\" data-iid=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid site-wrapper\"> <!-- this is the Sheet -->\n");
      out.write("            <div class=\"container-fluid header-wrapper \" id=\"header\"> <!-- this is the Header Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"title-wrapper\">\n");
      out.write("                        <div class=\"title-wrapper-inner\">\n");
      out.write("                            <a rel=\"nofollow\" class=\"logo \" href=\"http://us-123hiking.simplesite.com/\">\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"title \">\n");
      out.write("                                Trekking and Hiking\n");
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
      out.write("                                            <a rel=\"nofollow\" href=\"FrontPage.jsp\">Front page</a>\n");
      out.write("                                        </li><li class=\"  \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"OurDiary.jsp\">Our Diary</a>\n");
      out.write("                                        </li><li class=\" active \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"PhotoAlbum.jsp\">Photo Album</a>\n");
      out.write("                                        </li><li class=\"  \" style=\"\">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"TrekkingLinks.jsp\">Trekking Links</a>\n");
      out.write("                                        </li>                \n");
      out.write("                                    </ul>\n");
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
      out.write("                            <div class=\"wrapper photo-album photo-album-compact\">\n");
      out.write("                                <div class=\"heading\">\n");
      out.write("                                    <h1 class=\"page-title\">Photo Album</h1>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"content\"> <!-- Slideshow -->\n");
      out.write("                                    <div class=\"section\">\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <div class=\"slideshow\" data-ss=\"albumslideshow\"><object width=\"100%\" height=\"425px\" id=\"flash-2303\" type=\"application/x-shockwave-flash\" data=\"CSS/fotoalbum20110225b.swf\" style=\"visibility: visible;\"><param name=\"wmode\" value=\"transparent\"><param name=\"allowfullscreen\" value=\"true\"><param name=\"quality\" value=\"best\"><param name=\"allowscriptaccess\" value=\"always\"><param name=\"flashvars\" value=\"mode=normal&amp;xmlurl=http%3A%2F%2Fwww.simplesite.com%2Fuserpages%2Fpages%2FPhotoAlbumSlideShowXml.aspy%3Fid%3D411163283%26cid%3D10723027&amp;imageid=95199546\"></object></div>                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"section\"> \n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            ");

                                                DAO dao = new DAO();
                                                ServletContext sc = getServletContext();
                                                dao.connection4(sc);
                                                ResultSet rs = dao.setPhotoAlbum();
                                            
      out.write("\n");
      out.write("                                            \n");
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
      out.write("                                                <li><a id=\"share-facebook\" href=\"http://us-123hiking.simplesite.com/411163283#\"><i class=\"icon-facebook-sign\"></i><span>Share on Facebook</span></a></li>\n");
      out.write("                                                <li><a id=\"share-twitter\" href=\"http://us-123hiking.simplesite.com/411163283#\"><i class=\"icon-twitter-sign\"></i><span>Share on Twitter</span></a></li>\n");
      out.write("                                                <li><a id=\"share-google-plus\" href=\"http://us-123hiking.simplesite.com/411163283#\"><i class=\"icon-google-plus-sign\"></i><span>Share on Google+</span></a></li>    \n");
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
      out.write("                    ");

                        java.util.Enumeration e = session.getAttributeNames();
                        ResultSet rs2 = dao.setVisit();
                        int count = 0;
                        if (rs2.next()) {
                            count = rs2.getInt(1);
                        }
                        if (!e.hasMoreElements()) {
                            count++;
                            dao.updateData(count);
                            session.setAttribute("track", count);
                        }
                    
      out.write("\n");
      out.write("                    <div class=\"footer-page-counter\" style=\"display: block;\">\n");
      out.write("                        <span class=\"footer-page-counter-item\">");
      out.print( count );
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"css_simplesite_com_fallback\" class=\"hide\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>  <!-- this is the Footer content -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" id=\"anti-forgery-token\" value=\"vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjhUs5V4GfMgBcFA1ZpZbI3fmbEWWbe0KEKNcxYQUeOl0H4kGiwcctQUeckRtDgkPeYxAmu1Yx4Ak9bpW7fglOzg==\">\n");
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
      out.write("                            '//www.googletagmanager.com/gtm.js?id=' + i + dl;f.parentNode.insertBefore(j, f);\n");
      out.write("                }\n");
      out.write("    })(window, document, 'script', 'dataLayer', 'GTM-2MMH');</script>\n");
      out.write("        <!-- End Google Tag Manager -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Remove after blog exp concludes -->\n");
      out.write("        <!-- Remove after expeirment is done-->\n");
      out.write("\n");
      out.write("        <div id=\"sm2-container\" class=\"movieContainer high_performance\" style=\"z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden; visibility: hidden;\"><embed name=\"sm2movie\" id=\"sm2movie\" src=\"/Images/sm297/soundmanager2_flash9.swf\" quality=\"high\" allowscriptaccess=\"always\" bgcolor=\"#ffffff\" pluginspage=\"www.macromedia.com/go/getflashplayer\" title=\"JS/Flash audio component (SoundManager 2)\" type=\"application/x-shockwave-flash\" wmode=\"transparent\" haspriority=\"true\">\n");
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
