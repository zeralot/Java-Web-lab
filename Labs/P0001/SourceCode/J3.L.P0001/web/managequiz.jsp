<%-- 
    Document   : managequiz
    Created on : Sep 5, 2016, 3:23:13 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Quiz Page</title>
    </head>
    <body>
        <%
            ResultSet rsManage = (ResultSet) request.getAttribute("rsManage");
            int cntManage = (int) request.getAttribute("cnt");
        %>
        <p>Number of questions:  <font style="color: blue"> <%= cntManage %> </font> </p>
        <table border="0" style="width: 100%">
                <tr>
                    <td style="width: 80%"><font style="color: blue"> Question </font></td>
                    <td><font style="color: blue"> DateCreated </font></td>
                </tr>
                <% while(rsManage.next()) { %>
                <tr>
                    <td><%= rsManage.getString(2) %></td>
                    <td><%= rsManage.getDate(3) %></td>
                </tr>
                <% } %>
        </table>

        
    </body>
</html>
