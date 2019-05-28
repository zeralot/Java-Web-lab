<%-- 
    Document   : Home
    Created on : Sep 9, 2016, 1:04:02 PM
    Author     : Students
--%>

<%@page import="java.util.Properties"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.J3LP0004.dao.DAO_News"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>My Digital News</title>
    </head>
    <body>
        <div class="container">
            <div class="preheader">
                <% 
                    ServletContext sc = getServletContext()   ;
                    DAO_News dao = new DAO_News();
                    dao.connection4(sc);
                %>
            </div>
            <div class="header">
                <h3> My Digital News </h3>
            </div>
            <div class="menu">
                <p> News </p>
            </div>
            <div class="content">
                <div class="main">
                    <%
                        String xPage = request.getParameter("search");
                        if (xPage == null || xPage.isEmpty()) {
                    %>
                    <jsp:include page="MainContent.jsp"></jsp:include>
                    <%
                        } else {
                    %>
                        <jsp:include page="Search.jsp"></jsp:include>
                    <%
                        }
                    %>    
                </div>   
                <div class="right">
                    <jsp:include page="RightBar.jsp"></jsp:include>
                </div>
                <div class="footer">

                </div> 
            </div>
        </div>
    </body>
</html>
