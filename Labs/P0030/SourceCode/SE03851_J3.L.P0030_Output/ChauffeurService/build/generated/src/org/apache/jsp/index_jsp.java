package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fpt.P0028.MODEL.Entry;
import java.util.ArrayList;
import java.util.ArrayList;
import com.fpt.P0030.BAO.ListEntry;
import com.fpt.P0030.BAO.PageViews;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/./common/header.jsp");
    _jspx_dependants.add("/./common/sbleft.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\" class=\"\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\">\n");
      out.write("        <style type=\"text/css\">.fancybox-margin{margin-right:17px;}</style></head>\n");
      out.write("        ");
 ServletContext serContext = getServletContext();
      out.write("\n");
      out.write("    <body data-pid=\"423612163\" data-iid=\"\">\n");
      out.write("        <div class=\"container-fluid site-wrapper\"> <!-- this is the Sheet -->\n");
      out.write("            <div class=\"container-fluid header-wrapper \" id=\"header\"> <!-- this is the Header Wrapper -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"title-wrapper\">\n");
      out.write("                        <div class=\"title-wrapper-inner\">\n");
      out.write("                            <a rel=\"nofollow\" class=\"logo title-only\" href=\"http://us-123-chauffeur.simplesite.com/\">\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"title title-only\">\n");
      out.write("                                Chauffeur Services\n");
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
      out.write("                                <!-- Everything you want hidden at 940px or less, place within here -->\n");
      out.write("                                <div class=\"nav-collapse collapse\">\n");
      out.write("                                    <ul class=\"nav\" id=\"topMenu\" data-submenu=\"horizontal\">\n");
      out.write("                                        <li class=\" active \">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"./index.jsp\">Home</a>\n");
      out.write("                                        </li><li class=\"  \">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"./gallery.jsp\">Gallery</a>\n");
      out.write("                                        </li><li class=\"  \">\n");
      out.write("                                            <a rel=\"nofollow\" href=\"./contact.jsp\">Contact</a>\n");
      out.write("                                        </li>                </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- this is the Menu content -->\n");
      out.write("                </div>\n");
      out.write("            </div>  <!-- this is the Header content -->\n");
      out.write('\n');

    ListEntry listE = new ListEntry(serContext);
    ArrayList<Entry> list = listE.getListEntry();

      out.write("\n");
      out.write("<div class=\"container-fluid content-wrapper\" id=\"content\"> <!-- this is the Content Wrapper -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row-fluid content-inner\">\n");
      out.write("            <div id=\"left\" class=\"span9\"> <!-- ADD \"span12\" if no sidebar, or \"span9\" with sidebar -->\n");
      out.write("                <div class=\"wrapper \">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"section article\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"img-simple span12 \">\n");
      out.write("                                    <div class=\"image\">\n");
      out.write("                                        <a rel=\"nofollow\" data-ss=\"imagemodal\" ><img src=\"img/1.jpg\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 for (int i = 0; i < list.size(); i++) {
                                if (i == 0) {
                        
      out.write("\n");
      out.write("                        <div class=\"section article\">\n");
      out.write("                            <div class=\"heading\">\n");
      out.write("                                <h3>");
      out.print( list.get(i).getName());
      out.write("</h3>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <p><span>");
      out.print( list.get(i).getDescription_entry());
      out.write("</span></p>    </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }else
                            if (i == 1) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"section article\">\n");
      out.write("                            <div class=\"heading\">\n");
      out.write("                                <h3>");
      out.print( list.get(i).getName());
      out.write("</h3>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"img-simple span6 pull-right\">\n");
      out.write("                                    <div class=\"image\">\n");
      out.write("                                        <a rel=\"nofollow\" data-ss=\"imagemodal\" data-href=\"http://cdn.simplesite.com/i/ad/23/283163831105823661/i283163839570120340._szw1280h1280_.jpg\"><img src=\"./img/");
      out.print( list.get(i).getIcon());
      out.write(".jpg\"></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                               <p><span>");
      out.print( list.get(i).getDescription_entry());
      out.write("</span></p>     </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        ");

                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"section\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <ul class=\"thumbnails column-article-section\">\n");
      out.write("                                    ");

                                     for (int i = 2; i < list.size(); i++){
                                         
      out.write("\n");
      out.write("                                    <li class=\"span4\">\n");
      out.write("                                        <div class=\"img-simple span12 \">\n");
      out.write("                                            <div class=\"image\">\n");
      out.write("                                                <a rel=\"nofollow\" data-ss=\"imagemodal\" data-href=\"http://cdn.simplesite.com/i/ad/23/283163831105823661/i283163839570120380._szw1280h1280_.jpg\"><img src=\"./img/");
      out.print( list.get(i).getIcon());
      out.write(".jpg\"></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <h4>\n");
      out.write("                                            ");
      out.print( list.get(i).getName());
      out.write("</h4>\n");
      out.write("\n");
      out.write("                                        <p>");
      out.print( list.get(i).getDescription_entry());
      out.write("</p>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");

                                     } 
                                    
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"right\" class=\"span3\">\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <div class=\"wrapper share-box\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <h4>Share this page</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"content\"><span><ul>\n");
      out.write("                        <li><a id=\"share-facebook\" href=\"#\"><i class=\"icon-facebook-sign\"></i><span>Share on Facebook</span></a></li>\n");
      out.write("                        <li><a id=\"share-twitter\" href=\"#\"><i class=\"icon-twitter-sign\"></i><span>Share on Twitter</span></a></li>\n");
      out.write("                        <li><a id=\"share-google-plus\" href=\"#\"><i class=\"icon-google-plus-sign\"></i><span>Share on Google+</span></a></li>    \n");
      out.write("                    </ul></span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper viral-box\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <h4>Create a website</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <p>Everybody can create a website, it's easy.</p>\n");
      out.write("                <div class=\"bottom\">\n");
      out.write("                    <a rel=\"nofollow\" href=\"#\" class=\"btn btn-block\">Try it for FREE now</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        </div>        \n");
      out.write("    </div>\n");
      out.write("</div>  <!-- the controller has determined which view to be shown in the content -->\n");
 listE.close(); 
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    PageViews pages = new PageViews(getServletContext());
    if (session.getAttribute("view") == null) {
        pages.upViews();
        session.setAttribute("view", 0);
    }
    String views_number = pages.getViews();

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid footer-wrapper\" id=\"footer\"> <!-- this is the Footer Wrapper -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"footer-info\">\n");
      out.write("            <div class=\"footer-info-text\">\n");
      out.write("                This website was created with SimpleSite\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-powered-by\">\n");
      out.write("                <a rel=\"nofollow\" href=\"http://www.simplesite.com/\">Get Your own FREE website. Click here!</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"footer-page-counter\" >\n");
      out.write("            ");

                char a[] = views_number.toCharArray();
                for (int i = 0; i < a.length; i++) {
            
      out.write("\n");
      out.write("            <span class=\"footer-page-counter-item\">");
      out.print(a[i]);
      out.write("</span>\n");
      out.write("            ");

                }

            
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"css_simplesite_com_fallback\" class=\"hide\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>  <!-- this is the Footer content -->\n");
      out.write("</div>\n");
      out.write("</body></html>");
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
