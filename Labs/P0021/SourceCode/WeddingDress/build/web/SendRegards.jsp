<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.lab221.DAO.DatabaseInvoke"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItem"%>
<%@page import="org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<!DOCTYPE html>
<!-- saved from url=(0049)http://www.simplesite.com/us-123wedding/146239002 -->
<html lang="en-US" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guestbook - www.simplesite.com/us-123wedding</title>
        <meta property="og:site_name" content="Maria and Paul&#39;s Wedding">
        <meta property="article:publisher" content="https://www.facebook.com/simplesite">
        <meta property="og:locale" content="en-US">
        <meta property="og:url" content="http://www.simplesite.com/us-123wedding/146239002">
        <meta property="og:title" content="Guestbook">
        <meta property="og:description" content="Charlotte Robert - Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est not... - 27-10-2015 - André Martin - Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quin...">
        <meta property="og:image" content="http://sp.simplesite.com/7a/e3/s7ae3b6c800a342ed95b955bd73ab42db.jpg">
        <meta property="og:updated_time" content="2016-06-18T11:22:25.9273555+02:00">
        <meta property="og:type" content="website">
        <meta name="robots" content="nofollow">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Maria and Paul&#39;s Wedding - http://www.simplesite.com/us-123wedding/">
        <link rel="stylesheet" type="text/css" href="./Prototype/Guestbook - www.simplesite.com_us-123wedding_files/3731000.design.v25490.css">
        <link rel="canonical" href="http://www.simplesite.com/us-123wedding/146239002">
        <link rel="shortcut icon" href="data:image/x-icon;,">
        <script type="text/javascript" async="" src="./Prototype/Guestbook - www.simplesite.com_us-123wedding_files/analytics.js"></script><script async="" src="./Prototype/Guestbook - www.simplesite.com_us-123wedding_files/gtm.js"></script><script type="text/javascript" src="./Prototype/Guestbook - www.simplesite.com_us-123wedding_files/FrontendAppLocalePage.aspx"></script>
        <script type="text/javascript" src="./Prototype/Guestbook - www.simplesite.com_us-123wedding_files/frontendApp.min.js"></script>
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
                    link.href = '{/d/designs/3731000.design.v25490.css}';

                    head.appendChild(link);
                }
            }</script>
        <style type="text/css">.fancybox-margin{margin-right:0px;}</style></head>
    <body data-pid="146239002" data-iid="">


        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper " id="header"> <!-- this is the Header Wrapper -->
                <div class="container">
                    <div class="title-wrapper">
                        <div class="title-wrapper-inner">
                            <a rel="nofollow" class="logo " href="http://www.simplesite.com/us-123wedding/">

                            </a>
                            <div class="title ">
                                Maria and Paul's Wedding
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
                                            <a rel="nofollow" href="http://www.simplesite.com/us-123wedding/146238995">Wedding Blog</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="http://www.simplesite.com/us-123wedding/146239001">Photo Album</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="http://www.simplesite.com/us-123wedding/146239000">Wishlist</a>
                                        </li><li class=" active " style="">
                                            <a rel="nofollow" href="http://www.simplesite.com/us-123wedding/146239002">Guestbook</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="http://www.simplesite.com/us-123wedding/146239003">Party Address</a>
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
                            <div class="wrapper guest-book">                                
                                <div class="heading">
                                    <h1 class="page-title">Send Regards</h1>
                                </div>

                                <div class="content">

                                    <form method="POST" action="NewServlet" enctype="multipart/form-data">
                                        <table border="0">
                                            <thead>
                                                <tr>
                                                    <th></th>
                                                    <th></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>Your name: </td>
                                                    <td><input type="text" name="nameInput" value="" placeholder="Input your name here" /></td>
                                                </tr>
                                                <tr>
                                                    <td>Your Email: </td>
                                                    <td><input type="email" name="email" value="" placeholder="Input your email here"/></td>
                                                </tr>
                                                <tr>
                                                    <td>Website: </td>
                                                    <td><input type="text" name="website" value="" placeholder="Input your website here" /></td>
                                                </tr>
                                                <tr>
                                                    <td>Write something</td>
                                                    <td><textarea name="content" rows="4" cols="20" placeholder="Write something">
                                                        </textarea></td>
                                                </tr>
                                                <tr>
                                                    <td>Image Link: </td>
                                                    <td><input type="file" name="imgLink" value="" accept="image/*"/></td>
                                                </tr>
                                                <tr>
                                                    <td><input type="submit" value="Submit" name="submit" /></td>
                                                    <td><input type="submit" value="Cancel" name="cancel"/></td>
                                                </tr>
                                            </tbody>
                                        </table>

                                    </form> 



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
                                                <li><a id="share-facebook" href="http://www.simplesite.com/us-123wedding/146239002#"><i class="icon-facebook-sign"></i><span>Share on Facebook</span></a></li>
                                                <li><a id="share-twitter" href="http://www.simplesite.com/us-123wedding/146239002#"><i class="icon-twitter-sign"></i><span>Share on Twitter</span></a></li>
                                                <li><a id="share-google-plus" href="http://www.simplesite.com/us-123wedding/146239002#"><i class="icon-google-plus-sign"></i><span>Share on Google+</span></a></li>    
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
                    <div class="footer-page-counter" style="display: block;">
                        <%
                            DatabaseInvoke db = new DatabaseInvoke();
                            ServletContext sc = getServletContext();
                            db.connectToDatabase(sc);
                            String sql = "";
                            ResultSet rs;
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

                        %>
                        <%  while (trackVisit != 0) {

                        %>

                        <span class="footer-page-counter-item"><%=trackVisit % 10%></span>
                        <%trackVisit = trackVisit / 10;
                            }%>


                    </div>
                    <div id="css_simplesite_com_fallback" class="hide"></div>
                </div>
            </div>  <!-- this is the Footer content -->
        </div>


        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5XDrvUyMasUYb8PZlmgROpWgWhFTGjCoyYPRNAZ57HUVr4c6QnvYhoYJLJG8dWLP2NhmdVJF+RhKEwkT1Q7ogGGTSddnANm69E10QsexY3DV5L0XqDr1VHHaGc7ZSxM2ktc82EJ4KYkwEXssuv2a0gNK9Zc8XKu5Ft28qiKVqNsj3YTpteTqb5UM9+U6Dtk4R+nJWQ1rw7NgjMDh9hCABmCHxgiQJBhPooojs3CleKjorvDjhc1vLhNfhEdOaEJSAXy1zHip7yoxj/Ybn86swSis7wnW/YTVdMos5ci15FQjadE686Sjhc6oDKZlJnux58xEqC04VRWWt/UWhmwuYEDZaqgsnIzs9uoL+nGrh1ggkp8wvm8ZVmFVzWrEqWBnXg==">


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
                            '//www.googletagmanager.com/gtm.js?id=' + i + dl;
                    f.parentNode.insertBefore(j, f);
                }
            })(window, document, 'script', 'dataLayer', 'GTM-2MMH');</script>
        <!-- End Google Tag Manager -->


        <!-- Remove after blog exp concludes -->
        <!-- Remove after expeirment is done-->

        <div id="sm2-container" class="movieContainer high_performance" style="z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden; visibility: hidden;"><embed name="sm2movie" id="sm2movie" src="/Images/sm297/soundmanager2_flash9.swf" quality="high" allowscriptaccess="always" bgcolor="#ffffff" pluginspage="www.macromedia.com/go/getflashplayer" title="JS/Flash audio component (SoundManager 2)" type="application/x-shockwave-flash" wmode="transparent" haspriority="true"></div></body></html>