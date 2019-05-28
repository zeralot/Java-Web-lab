<%-- 
    Document   : services
    Created on : Sep 16, 2016, 1:49:56 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.controller.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!-- saved from url=(0046)http://us-123gardener.simplesite.com/422327513 -->
<!DOCTYPE html>
<!-- saved from url=(0046)http://us-123gardener.simplesite.com/422327513 -->
<html lang="en-US" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Services </title>
<meta property="og:site_name" content="Gardening Service">
<meta property="article:publisher" content="https://www.facebook.com/simplesite">
<meta property="og:locale" content="en-US">
<meta property="og:url" content="http://us-123gardener.simplesite.com/422327513">
<meta property="og:title" content="Hedge Cutting">
<meta property="og:description" content="
Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip
 ex ea commodo consequat. Duis autem vel eum iriur...">
<meta property="og:image" content="http://cdn.simplesite.com/i/2a/ea/287104480797190698/i287104489242216165._szw1280h1280_.jpg">
<meta property="og:updated_time" content="2016-07-11T15:54:23.1744366+02:00">
<meta property="og:type" content="website">
<meta name="robots" content="nofollow">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Gardening Service - http://us-123gardener.simplesite.com/">
        <link rel="stylesheet" type="text/css" href="./Services - us-123gardener.simplesite.com_files/9767173.design.v27169.css">
<link rel="canonical" href="http://us-123gardener.simplesite.com/422327513">
                <link rel="apple-touch-icon" sizes="57x57" href="http://us-123gardener.simplesite.com/apple-touch-icon-57x57.png">
                <link rel="apple-touch-icon" sizes="60x60" href="http://us-123gardener.simplesite.com/apple-touch-icon-60x60.png">
                <link rel="apple-touch-icon" sizes="72x72" href="http://us-123gardener.simplesite.com/apple-touch-icon-72x72.png">
                <link rel="apple-touch-icon" sizes="76x76" href="http://us-123gardener.simplesite.com/apple-touch-icon-76x76.png">
                <link rel="apple-touch-icon" sizes="114x114" href="http://us-123gardener.simplesite.com/apple-touch-icon-114x114.png">
                <link rel="apple-touch-icon" sizes="120x120" href="http://us-123gardener.simplesite.com/apple-touch-icon-120x120.png">
                <link rel="apple-touch-icon" sizes="144x144" href="http://us-123gardener.simplesite.com/apple-touch-icon-144x144.png">
                <link rel="apple-touch-icon" sizes="152x152" href="http://us-123gardener.simplesite.com/apple-touch-icon-152x152.png">
                <link rel="apple-touch-icon" sizes="180x180" href="http://us-123gardener.simplesite.com/apple-touch-icon-180x180.png">
                <link rel="icon" sizes="194x194" href="http://us-123gardener.simplesite.com/favicon-194x194.png">
                <link rel="icon" sizes="192x192" href="http://us-123gardener.simplesite.com/android-chrome-192x192.png">
<link rel="manifest" href="http://us-123gardener.simplesite.com/manifest.json">
<link rel="manifest" href="http://us-123gardener.simplesite.com/yandex-browser-manifest.json">
        <script type="text/javascript" async="" src="./Services - us-123gardener.simplesite.com_files/analytics.js"></script><script async="" src="./Services - us-123gardener.simplesite.com_files/gtm.js"></script><script type="text/javascript" src="./Services - us-123gardener.simplesite.com_files/FrontendAppLocalePage.aspx"></script>
                <script type="text/javascript" src="./Services - us-123gardener.simplesite.com_files/frontendApp.min.js"></script>
        <script type="text/javascript">if(typeof window.jQuery=="undefined"){(function(){var a=document.createElement("script");a.type="text/javascript";a.src="/c/js/version3/frontendApp/init/frontendApp.min.js?_v=cc2c76e4dcbafc6b4401ae93a0511ba0";document.getElementsByTagName('head')[0].appendChild(a);})();}</script>

                <script type="text/javascript">var css_simplesite_com_fallback_element = document.getElementById('css_simplesite_com_fallback');
if(typeof css_simplesite_com_fallback_element !== 'undefined' && css_simplesite_com_fallback_element !== null){
var isVisible = css_simplesite_com_fallback_element.offsetParent !== null
if(isVisible){
var head = document.head, link = document.createElement('link');

link.type = 'text/css';
link.rel = 'stylesheet';
link.href = '{/d/designs/9767173.design.v27169.css}';

head.appendChild(link);
}
}</script>
    <style type="text/css">.fancybox-margin{margin-right:17px;}</style></head>
    <body data-pid="422327513" data-iid="">
        
        
        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper " id="header"> <!-- this is the Header Wrapper -->
    <div class="container">
<div class="title-wrapper">
	<div class="title-wrapper-inner">
	    <a rel="nofollow" class="logo " href="http://us-123gardener.simplesite.com/">
	        
	    </a>
	    <div class="title ">
	        Gardening Service
	    </div>
	    <div class="subtitle">
	        Welcome to our website
	    </div>
	</div>
</div>  <!-- these are the titles -->
<div class="navbar navbar-compact">
    <div class="navbar-inner">
        <div class="container">
            <!-- .btn-navbar is used as the toggle for collapsed navbar content -->
            <a rel="nofollow" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse" title="Toggle menu">
                <span class="menu-name">Menu</span>
                <span class="menu-bars">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </span>
            </a>
            


            <!-- Everything you want hidden at 940px or less, place within here -->
            <div class="nav-collapse collapse">
                <ul class="nav" id="topMenu" data-submenu="horizontal">
<li class="  " style="">
    <a rel="nofollow" href="home.jsp">Home</a>
</li><li class=" active " style="">
    <a rel="nofollow" href="services.jsp">Services</a>
</li><li class="  " style="">
    <a rel="nofollow" href="gallery.jsp">Gallery</a>
</li><li class="  " style="">
    <a rel="nofollow" href="contact.jsp">Contact</a>
</li>                </ul>
            </div>
        </div>
    </div>
</div>
  <!-- this is the Menu content -->
    </div>
</div>  <!-- this is the Header content -->

            <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
    <div class="container">
        <div class="row-fluid content-inner">
            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                <div class="wrapper ">
                    <div class="content">
                        <%DAO dao=new DAO();
                        ServletContext sc=getServletContext();
                        dao.connect(sc);
                        ResultSet rs=dao.get("select * from dulieu");
                        int i=2;
                        while(rs.next())
                        {
                           if (i%2==0) 
                           {
                            %>
<div class="section article">
    <div class="heading">
        <h3><%=rs.getString(1)%></h3>
</div>

    <div class="content">
<div class="img-simple span6 pull-left">
    <div class="image">
        <a rel="nofollow" data-ss="imagemodal" data-href="http://cdn.simplesite.com/i/2a/ea/287104480797190698/i287104489242216165._szw1280h1280_.jpg"><img src="./Services - us-123gardener.simplesite.com_files/<%=rs.getString(3)%>"></a>
    </div>
    </div>
        <p><span><%=rs.getString(2)%></span></p>    </div>
</div>
<% } else  {%>
<div class="section article">
    <div class="heading">
        <h3><%=rs.getString(1)%></h3>
</div>

    <div class="content">
<div class="img-simple span6 pull-right">
    <div class="image">
        <a rel="nofollow" data-ss="imagemodal" data-href="http://cdn.simplesite.com/i/2a/ea/287104480797190698/i287104489242216166._szw1280h1280_.jpg"><img src="./Services - us-123gardener.simplesite.com_files/<%=rs.getString(3)%>"></a>
    </div>
    </div>
        <p><span><%=rs.getString(2)%>.</span></p>    </div>
</div>
<%} i++;}%>
    </div>

                
                </div>
            </div>
            <div id="right" class="span3">
                <div class="sidebar">
            <div class="wrapper share-box">
                <div class="heading">
        <h4>Share this page</h4>
</div>

                <div class="content"><span><ul>
    <li><a id="share-facebook" href="http://us-123gardener.simplesite.com/422327513#"><i class="icon-facebook-sign"></i><span>Share on Facebook</span></a></li>
    <li><a id="share-twitter" href="http://us-123gardener.simplesite.com/422327513#"><i class="icon-twitter-sign"></i><span>Share on Twitter</span></a></li>
    <li><a id="share-google-plus" href="http://us-123gardener.simplesite.com/422327513#"><i class="icon-google-plus-sign"></i><span>Share on Google+</span></a></li>    
</ul></span></div>
            </div>
            <div class="wrapper viral-box">
                <div class="heading">
        <h4>Create a website</h4>
</div>

                <div class="content">
                    <p>Everybody can create a website, it's easy.</p>
<div class="bottom">
    <a rel="nofollow" href="http://www.simplesite.com/pages/receive.aspx?partnerkey=123i%3arightbanner&amp;referercustomerid=15831018&amp;refererpageid=422327513" class="btn btn-block">Try it for FREE now</a>
</div>

                </div>
            </div>
</div>
            </div>
        </div>        
    </div>
</div>  <!-- the controller has determined which view to be shown in the content -->

            <div class="container-fluid footer-wrapper" id="footer"> <!-- this is the Footer Wrapper -->
    <div class="container">
        <div class="footer-info">
                <div class="footer-info-text">
                    This website was created with SimpleSite
                </div>
                            <div class="footer-powered-by">
                    <a rel="nofollow" href="http://www.simplesite.com/">Get Your own FREE website. Click here!</a>
                </div>
        </div>
          <%
                            java.util.Enumeration e = session.getAttributeNames();
                            ResultSet rs1 = null;
                            int view = 0;
                            if (e.hasMoreElements()) {
                                String sql1 = "select * from db";
                                rs1 = dao.get(sql1);

                                if (rs1.next()) {
                                    view = rs1.getInt(1);
                                }

                            } else {
                                String sql1 = "select * from db";
                                rs1 = dao.get(sql1);

                                if (rs1.next()) {
                                    view = rs1.getInt(1);
                                }
                                session.setAttribute("luot", 1);
                                view++;
                                session.setMaxInactiveInterval(30);
                                dao.up(view);
                            }
                            
                           String b = String.format("%06d", view);
                           char[]c=b.toCharArray();

                        %>
                        <div class="footer-page-counter" style="display: block;">
                            <% 
              for(int k=0;k<c.length;k++)
{
                            
                            %>
                           <span class="footer-page-counter-item"><%=c[k]%></span>

	
                
             <% } %>
                        </div>
        <div id="css_simplesite_com_fallback" class="hide"></div>
    </div>
</div>  <!-- this is the Footer content -->
        </div>
        
                        
        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5fAD8BNW681R156VbishbOuMSQfSiMUD2yJnFgRe4ymqLXQ320vzzhmHDai7YyqQORPq3/VHd5UdYn07TVcZw3jxwzZOP9SaDPzGa/+sRjQBx6rAxSjptxAmIruwj1qkAM30VMLISWPEe/dCmcRVCixtya3JNfHeR36ojUJ1SST3Ye8FE+rNkgBZFAmDXjOAQrpJwJwY35t2/WI8kEi+zaZzvkXuIj72VmXB53eesvTGdKaVIkPJFTblYd2EQPwilykLtKBaEDUr9xMWtVQJwB7HY9HhbzvgFtHnsVh8sJoE7a5UXINcbaSxg6I6JqXO6D6DyTW89viHbMyGm/fSbNzTUz8jKS1+dW0kIkYzORJg/GA4yIel2JsJlRwWoR42Zg==">
        
        
        <script>
    dataLayer = [{"SiteVer":"US","MainOrUser":"UserPage","PreOrFre":"Free","Language":"en","Culture":"en-US","Instrumentation":"ShowPage","Market":"DK"}];
</script>
<!-- Google Tag Manager -->
<noscript>&lt;iframe src="//www.googletagmanager.com/ns.html?id=GTM-2MMH"
height="0" width="0" style="display:none;visibility:hidden"&gt;&lt;/iframe&gt;</noscript>
<script>(function(w,d,s,l,i){{w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'//www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
}})(window,document,'script','dataLayer','GTM-2MMH');</script>
<!-- End Google Tag Manager -->

        
        <!-- Remove after blog exp concludes -->
        <!-- Remove after expeirment is done-->
    
<div id="sm2-container" class="movieContainer high_performance" style="z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden;"><embed name="sm2movie" id="sm2movie" src="/Images/sm297/soundmanager2_flash9.swf" quality="high" allowscriptaccess="always" bgcolor="#ffffff" pluginspage="www.macromedia.com/go/getflashplayer" title="JS/Flash audio component (SoundManager 2)" type="application/x-shockwave-flash" wmode="transparent" haspriority="true"></div></body></html>