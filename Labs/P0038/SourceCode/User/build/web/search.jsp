<%-- 
    Document   : show
    Created on : Sep 7, 2016, 2:56:05 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.L231.controller.DAO_User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/show.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="content">
            <div class="gioithieu">  <p><span style="padding-top: 10px;padding-left: 30px;font-size: 20px;font-family: Arial;">User</span></p>
                <form class="ll" action="add.jsp"><input class="submit" type="submit" value="Add new"></form>
            </div>
        </p>  
        <%  DAO_User dao = new DAO_User();

            ServletContext sc = getServletContext();
            dao.connect(sc);
            int h = 0;
            ResultSet rs3 = dao.getCount();
            if (rs3.next()) {
                h = rs3.getInt(1);
            }

            ResultSet rs1 = dao.getCount1();
            int k = 0;
            if (rs1.next()) {
                k = rs1.getInt(1);
            }

            ResultSet rs2 = dao.getCount2();
            int z = 0;
            if (rs2.next()) {
                z = rs2.getInt(1);
            }

        %>
        <div class="i"> <a href="show.jsp">All(<%=h%>)  <span> |</span></a>
            <a href="subcriber.jsp">Subscriber(<%=k%>)  | </a>
            <a href="Admin.jsp">Administrator(<%=z%>)</a></div>
        <form action="search.jsp" style="padding-left:700px;">
            <input class="search" type="text" name="search" size="20px"/>
            <input  class="button" type="submit" value="Search User"/>

        </form>
        <br>
        <br>


        <table style="margin-left: 37px;border:1px solid #bbb ">
            <tr><td class="td1"><input type="checkbox"><a href=#>UserName</a></td>
                <td class="td1"><a href="#">Name</a></td>
                <td class="td1"><a href=#>Email</a></td>
                <td class="td1">Role</td>
                <td class="td1">Post</td>
            </tr>
            <%
                String search1 = request.getParameter("search");
                ResultSet rs = null;

                rs = dao.search(search1);
                int dem1 = 0;
                if (rs != null) {
                    dem1++;
                }
                if (dem1 == 1) {
                    while (rs.next()) {

            %>
            <tr><td class="td1"><input type="checkbox"><a href="#"><%=rs.getString(1)%></a></td>
                <td class="td1"><a href="#"><%=rs.getString(3)%></a></td>
                <td class="td1"><a href="#"><%=rs.getString(2)%></a></td>
                <td class="td1"><%=rs.getString(7)%></td>
                <td class="td1"><%=rs.getString(8)%></td>
            </tr>
            <% }
            } else {
            %>
            <h3> Not found</h3>
            <%
                }
                dao.closeDB();
            %>
            <tr><td class="td1"><input type="checkbox"><a href=#>UserName</a></td>
                <td class="td1"><a>Name</a></td>
                <td class="td1"><a>Email</a></td>
                <td class="td1">Role</td>
                <td class="td1">Post</td>
            </tr>
        </table>
    </div>
</body>
</html>
