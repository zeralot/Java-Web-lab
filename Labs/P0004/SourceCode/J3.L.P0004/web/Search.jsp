<%-- 
    Document   : Search
    Created on : Sep 14, 2016, 1:31:08 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.J3LP0004.dao.DAO_News"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Search</title>
    </head>
    <body>
        <%
            DAO_News dao = new DAO_News();
            ServletContext sc = getServletContext();
            dao.connection4(sc);
            String str = request.getParameter("search");
            ResultSet res = dao.getData("select * from News where title like '%" + str + "%'");
            if (res.next() == false) {
        %>
            No data(s) found.
        <%
            } else {
                res.beforeFirst();
                while (res.next()) {
        %>
        <a href="Home.jsp?idCheck=<%= res.getString(1)%>"><%= res.getString(2)%> </a>
        <br> <br>
        <%
                }
            }
        %>
    </body>
</html>
