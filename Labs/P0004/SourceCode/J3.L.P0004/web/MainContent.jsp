<%-- 
    Document   : MainContent
    Created on : Sep 9, 2016, 2:23:52 PM
    Author     : Students
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.J3LP0004.dao.DAO_News"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Main</title>
    </head>
    <body>
        <%
            SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd YYYY - ");
            SimpleDateFormat sdf2 = new SimpleDateFormat("h:mm a");
            DAO_News dao = new DAO_News();
            ServletContext sc = getServletContext();
            dao.connection4(sc);
            String idCheck = request.getParameter("idCheck");
            ResultSet rs = null;
            if (idCheck == null) {
                rs = dao.getData("select top 1 * from News");
            } else {
                rs = dao.getData("select * from News where newID=" + idCheck);
            }
            while (rs.next()) {
        %>
        <div class="title">
            <%= rs.getString(2)%>
        </div> 
        <div class="image">
            <img src="<%= rs.getString(6)%>"/>
        </div>
        <div class="text">
            <%= rs.getString(3)%>
        </div>
        <div class="signature">
            <img src="Pictures/comment.gif">
            <img src="Pictures/timeicon.gif">
            <%
                String date = sdf1.format(rs.getDate(5)); //set date 
                String hour = sdf2.format(rs.getTime(5)); //set time
            %>
            By <%= rs.getString(4)%> | <%= date %><%= hour %>
        </div>
        <%
            }
        %>
    </body>
</html>
