<%-- 
    Document   : FrontPage
    Created on : Sep 21, 2016, 2:14:18 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.J3LP0014.dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Front Page</title>
        <link rel="stylesheet" type="text/css" href="CSS/8488947.design.v26374.css">
        <script type="text/javascript">if (typeof window.jQuery == "undefined") {
                (function () {
                    var a = document.createElement("script");
                    a.type = "text/javascript";
                    a.src = "/c/js/version3/frontendApp/init/frontendApp.min.js?_v=b8e7069b6e4fecc37c8394dc153e5d4f";
                    document.getElementsByTagName('head')[0].appendChild(a);
                })();
            }</script>

        <script type="text/javascript">var css_simplesite_com_fallback_element = document.getElementById('css_simplesite_com_fallback');
            if (typeof css_simplesite_com_fallback_element !== 'undefined' && css_simplesite_com_fallback_element !== null) {
                var isVisible = css_simplesite_com_fallback_element.offsetParent !== null
                if (isVisible) {
                    var head = document.head, link = document.createElement('link');

                    link.type = 'text/css';
                    link.rel = 'stylesheet';
                    link.href = '{/d/designs/8488947.design.v26374.css}';

                    head.appendChild(link);
                }
            }</script>
        <style type="text/css">.fancybox-margin{margin-right:17px;}</style></head>
    <body data-pid="411013668" data-iid="">


        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper " id="header"> <!-- this is the Header Wrapper -->
                <div class="container">
                    <div class="title-wrapper">
                        <div class="title-wrapper-inner">
                            <a rel="nofollow" class="logo " href="http://us-123hiking.simplesite.com/">

                            </a>
                            <div class="title ">
                                Trekking and Hiking
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
                                        <li class=" active " style="">
                                            <a rel="nofollow" href="FrontPage.jsp">Front page</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="OurDiary.jsp">Our Diary</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="PhotoAlbum.jsp">Photo Album</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="TrekkingLinks.jsp">Trekking Links</a>
                                        </li>                
                                    </ul>
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
                                    <div class="section">
                                        <div class="content">
                                            <ul class="thumbnails column-article-section">
                                                <%
                                                    DAO dao = new DAO();
                                                    ServletContext sc = getServletContext();
                                                    dao.connection4(sc);
                                                    ResultSet rs = dao.setBanner();
                                                    while (rs.next()) {
                                                %>
                                                <li class="span4">
                                                    <div class="img-simple span12 ">
                                                        <div class="image">
                                                            <a rel="nofollow" data-ss="imagemodal" data-href="<%= rs.getString(5) %>"><img src="<%= rs.getString(2) %>"></a>
                                                        </div>
                                                    </div>

                                                    <h4>
                                                        <a rel="nofollow" href="<%= rs.getString(5) %>"><%= rs.getString(4) %></a>
                                                    </h4>

                                                    <p><%= rs.getString(3) %></p>
                                                </li>
                                                <%
                                                    }
                                                %>
                                            </ul>
                                        </div>
                                    </div>
                                    <%
                                        ResultSet rs2 = dao.setIntro();
                                        while (rs2.next()) {
                                    %>
                                    <div class="section article">
                                        <div class="content">
                                            <div class="img-simple span12 ">
                                                <div class="image">
                                                    <a rel="nofollow" data-ss="imagemodal" data-href="#"><img src="<%= rs2.getString(3) %>"></a>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                    <div class="section article">
                                        <div class="heading">
                                            <h3><%= rs2.getString(1) %></h3>
                                        </div>

                                        <div class="content">
                                            <p><span><%= rs2.getString(2) %></span></p>    </div>
                                    </div>
                                    <%
                                        }
                                    %>
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
                                                <li><a id="share-facebook" href="http://us-123hiking.simplesite.com/#"><i class="icon-facebook-sign"></i><span>Share on Facebook</span></a></li>
                                                <li><a id="share-twitter" href="http://us-123hiking.simplesite.com/#"><i class="icon-twitter-sign"></i><span>Share on Twitter</span></a></li>
                                                <li><a id="share-google-plus" href="http://us-123hiking.simplesite.com/#"><i class="icon-google-plus-sign"></i><span>Share on Google+</span></a></li>    
                                            </ul></span></div>
                                </div>
                            </div>
                        </div>
                    </div>        
                </div>
            </div>  <!-- the controller has determined which view to be shown in the content -->

            <div class="container-fluid footer-wrapper" id="footer"> <!-- this is the Footer Wrapper -->
                <div class="container">
                    <div class="footer-info">
                        <div class="footer-powered-by">
                            <a rel="nofollow" href="http://www.simplesite.com/">Created with SimpleSite</a>
                        </div>
                    </div>
                    <%
                        java.util.Enumeration e = session.getAttributeNames();
                        ResultSet rs3 = dao.setVisit();
                        int count = 0;
                        if (rs3.next()) {
                            count = rs3.getInt(1);
                        }
                        if (!e.hasMoreElements()) {
                            count++;
                            dao.updateData(count);
                            session.setAttribute("track", count);
                        }
                    %>
                    <div class="footer-page-counter" style="display: block;">
                        <span class="footer-page-counter-item"><%=count%></span>
                    </div>
                    <div id="css_simplesite_com_fallback" class="hide"></div>
                </div>
            </div>  <!-- this is the Footer content -->
        </div>


        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjhUs5V4GfMgBcFA1ZpZbI3d2BpeVecqBhTzNxGqiXzAz7NYKLTQpdxj1vU5caA2A7bu5+g5/zvFYx+iBxdRvncA==">


        <script>
            dataLayer = [{"SiteVer": "US", "MainOrUser": "UserPage", "PreOrFre": "Free", "Language": "en", "Culture": "en-US", "Instrumentation": "ShowPage", "Market": "DK"}];
        </script>
        <!-- Google Tag Manager -->
        <noscript>&lt;iframe src="//www.googletagmanager.com/ns.html?id=GTM-2MMH"
        height="0" width="0" style="display:none;visibility:hidden"&gt;&lt;/iframe&gt;</noscript>
        <script>(function (w, d, s, l, i) {
                {
                    w[l] = w[l] || [];
                    w[l].push({'gtm.start':
                                new Date().getTime(), event: 'gtm.js'});
                    var f = d.getElementsByTagName(s)[0],
                            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : '';
                    j.async = true;
                    j.src =
                            '//www.googletagmanager.com/gtm.js?id=' + i + dl;f.parentNode.insertBefore(j, f);
                }
    })(window, document, 'script', 'dataLayer', 'GTM-2MMH');</script>
        <!-- End Google Tag Manager -->


        <!-- Remove after blog exp concludes -->
        <!-- Remove after expeirment is done-->

        <div id="sm2-container" class="movieContainer high_performance" style="z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden; visibility: hidden;"><embed name="sm2movie" id="sm2movie" src="/Images/sm297/soundmanager2_flash9.swf" quality="high" allowscriptaccess="always" bgcolor="#ffffff" pluginspage="www.macromedia.com/go/getflashplayer" title="JS/Flash audio component (SoundManager 2)" type="application/x-shockwave-flash" wmode="transparent" haspriority="true">
        </div>
        <% dao.closeConnection(); %>
    </body>
</html>
