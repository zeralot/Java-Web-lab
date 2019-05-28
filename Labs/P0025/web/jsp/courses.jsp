<%-- 
    Document   : courses
    Created on : Jul 17, 2017, 10:00:21 AM
    Author     : anhgqse04763
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en-US" class="">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Courses</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="CC Computer Courses - http://us-123-education.simplesite.com/">

        <link rel="stylesheet" type="text/css" href="./css/10449359.design.v27526.css">
        <link rel="canonical" href="http://us-123-education.simplesite.com/423611838">
        <link rel="apple-touch-icon" sizes="57x57" href="http://us-123-education.simplesite.com/apple-touch-icon-57x57.png">
        <link rel="apple-touch-icon" sizes="60x60" href="http://us-123-education.simplesite.com/apple-touch-icon-60x60.png">
        <link rel="apple-touch-icon" sizes="72x72" href="http://us-123-education.simplesite.com/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="76x76" href="http://us-123-education.simplesite.com/apple-touch-icon-76x76.png">
        <link rel="apple-touch-icon" sizes="114x114" href="http://us-123-education.simplesite.com/apple-touch-icon-114x114.png">
        <link rel="apple-touch-icon" sizes="120x120" href="http://us-123-education.simplesite.com/apple-touch-icon-120x120.png">
        <link rel="apple-touch-icon" sizes="144x144" href="http://us-123-education.simplesite.com/apple-touch-icon-144x144.png">
        <link rel="apple-touch-icon" sizes="152x152" href="http://us-123-education.simplesite.com/apple-touch-icon-152x152.png">
        <link rel="apple-touch-icon" sizes="180x180" href="http://us-123-education.simplesite.com/apple-touch-icon-180x180.png">
        <link rel="icon" sizes="194x194" href="http://us-123-education.simplesite.com/favicon-194x194.png">
        <link rel="icon" sizes="192x192" href="http://us-123-education.simplesite.com/android-chrome-192x192.png">
        <link rel="manifest" href="http://us-123-education.simplesite.com/manifest.json">
        <link rel="manifest" href="http://us-123-education.simplesite.com/yandex-browser-manifest.json">
    </head>

    <body data-pid="423611838" data-iid="">


        <div class="container-fluid site-wrapper">
            <div class="container-fluid header-wrapper " id="header">
                <div class="container">
                    <div class="title-wrapper">
                        <div class="title-wrapper-inner">
                            <a rel="nofollow" class="logo ">

                            </a>
                            <div class="title ">
                                CC Computer Courses
                            </div>
                            <div class="subtitle">
                                Welcome to my website
                            </div>
                        </div>
                    </div>
                    <div class="navbar navbar-compact">
                        <div class="navbar-inner">
                            <div class="container">
                                
                                <a rel="nofollow" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse" title="Toggle menu">
                                    <span class="menu-name">Menu</span>
                                    <span class="menu-bars">
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </span>
                                </a>

                                <div class="nav-collapse collapse">
                                    <ul class="nav" id="topMenu" data-submenu="horizontal">
                                        <li class="  " style="">
                                            <a rel="nofollow" href="IndexController">Front Page</a>
                                        </li><li class=" active " style="">
                                            <a rel="nofollow" href="CourseController">Courses</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="ContactController">Contact</a>
                                        </li>                
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 

            <div class="container-fluid content-wrapper" id="content"> 
                <div class="container">
                    <div class="row-fluid content-inner">
                        <div id="left" class="span9"> 
                            <div class="wrapper ">
                                <div class="content">

                                    <c:forEach var="item" items="${courses}">
                                        <div class="section article">
                                            <div class="heading">
                                                <h3>${item.title}</h3>
                                            </div>

                                            <div class="content">
                                                <c:if test="${item.image != null}" >
                                                    <div class="img-simple span6 pull-left">
                                                        <div class="image">
                                                            <a>
                                                                <img src="./img/${item.image}">
                                                            </a>
                                                        </div>
                                                    </div>
                                                </c:if>
                                                <p><span>${item.content}</span></p>    
                                            </div>
                                        </div>
                                    </c:forEach>
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
                                                <li><a id="share-facebook" href="#"><i class="icon-facebook-sign"></i><span>Share on Facebook</span></a></li>
                                                <li><a id="share-twitter" href="#"><i class="icon-twitter-sign"></i><span>Share on Twitter</span></a></li>
                                                <li><a id="share-google-plus" href="#"><i class="icon-google-plus-sign"></i><span>Share on Google+</span></a></li>    
                                            </ul></span></div>
                                </div>
                                <div class="wrapper viral-box">
                                    <div class="heading">
                                        <h4>Create a website</h4>
                                    </div>

                                    <div class="content">
                                        <p>Everybody can create a website, it's easy.</p>
                                        <div class="bottom">
                                            <a rel="nofollow" href="#" class="btn btn-block">Try it for FREE now</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>        
                </div>
            </div> 

            <div class="container-fluid footer-wrapper" id="footer">
                <div class="container">
                    <div class="footer-info">
                        <div class="footer-info-text">
                            This website was created with SimpleSite
                        </div>
                        <div class="footer-powered-by">
                            <a rel="nofollow" href="http://www.simplesite.com/">Get Your own FREE website. Click here!</a>
                        </div>
                    </div>
                    <div class="footer-page-counter" style="display: block;">
                        <span class="footer-page-counter-item">0</span>

                        <span class="footer-page-counter-item">0</span>

                        <span class="footer-page-counter-item">1</span>

                        <span class="footer-page-counter-item">8</span>

                        <span class="footer-page-counter-item">3</span>

                        <span class="footer-page-counter-item">5</span>
                    </div>
                    <div id="css_simplesite_com_fallback" class="hide"></div>
                </div>
            </div> 
        </div>
        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5b6CXlwwKB4XHI71fpze3SskIWgiB2+IyvXBDMM6UQ5OMxaRiAJaTPrB5QXmjkT3SpqWIiBlnToVI/fMzFvYjBHMizxqOOuGb93UPh1nwZXhei3XUFJDv0ia52U4Xu/A6oeoHJC2PM8g56TbQSk+pW25a+gFe5zcKehEwImVwGo4vLlAjMzsIA/hWN2YKGqffzf45q3F1AJuXEqxf68d/jDi6usjpMN+2eHFIp3kyNhSW8ygkDwi+Qb/vmio6WbWrEXonfHhFvXOAraRTjjpj+y9d8hvNOs6opkKTCROGUnC6xPE9+9u0vN9+gw+2MtGlJyo5cndMvA+z8pYga9QFLuWw/1huXwaIZmKOv01El3Zh55OmM6+FJ3hdPN3g9wWuQ==">
        <div id="sm2-container" class="movieContainer high_performance" style="z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden; visibility: hidden;"><embed name="sm2movie" id="sm2movie" src="/Images/sm297/soundmanager2_flash9.swf" quality="high" allowscriptaccess="always" bgcolor="#ffffff" pluginspage="www.macromedia.com/go/getflashplayer" title="JS/Flash audio component (SoundManager 2)" type="application/x-shockwave-flash" wmode="transparent" haspriority="true"></div>
    </body>
</html>