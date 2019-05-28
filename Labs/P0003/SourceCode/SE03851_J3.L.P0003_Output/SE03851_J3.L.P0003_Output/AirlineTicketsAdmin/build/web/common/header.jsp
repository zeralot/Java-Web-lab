<%-- 
    Document   : header
    Created on : Sep 19, 2016, 1:03:25 PM
    Author     : Students
--%>

<%@page import="java.util.*"%>
<%@page import="com.fpt.edu.vn.P0003.Model.*"%>
<%@page import="com.fpt.edu.vn.P0003.BAO.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Admin page booking ticket</title>
        <link rel="stylesheet" href="./css/bootstrap.min.css"/>
        <link rel="stylesheet" href="./css/styleall.css"
    </head>
    <body>
        <%
            Cookie cookie[] = request.getCookies();
            Cookie get = null;
            if (cookie != null) {
                for (int i = 0; i < cookie.length; i++) {
                    if (cookie[i].getName().equals("user")) {
                        get = cookie[i];
                    }
                }
            }
            if (get == null) {
                if (session.getAttribute("UserName") == null) {
                    response.sendRedirect("./login.jsp");
                    return;
                }
            }


        %>
        <header class="main-header">
            <nav class="navbar navbar-static-top navbar-inverse" role="navigation">
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="./index.jsp"> <i class="fa fa-question-circle"></i> Admin</a>
                        </li>
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                Hello : <span class="text-green"><%                                    
                                    if (cookie != null && get != null) {
                                       out.print(get.getValue());
                                        
                                    }else
                                    if(session.getAttribute("UserName") != null){
                                        out.print(session.getAttribute("UserName"));
                                    }
                                    %></span>
                            </a>
                        </li>
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <span class="hidden-xs text-bold text-lime">Setting</span>
                            </a>
                        </li>
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <span class="hidden-xs text-bold text-lime">Logout</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="container">