<%-- 
    Document   : RightBar
    Created on : Sep 9, 2016, 2:31:23 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.J3LP0004.dao.DAO_News"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Right bar</title>
    </head>
    <body>
        <%
            DAO_News dao = new DAO_News();
            ServletContext sc = getServletContext();
            dao.connection4(sc);
            ResultSet rss = dao.getData("select top 1 * from News order by newID desc");
            while (rss.next()) {
        %>
        <div class="newest">
            <div class="titleNews">
                <span> Digital News </span><br>
            </div>
            <div class="contentNews">
            <%
                /*int dotPosition = rss.getString(3).indexOf(".");
                int dotPosition2 = rss.getString(3).indexOf(".", dotPosition + 1);
                String shortText = rss.getString(3).substring(0, dotPosition2 + 1); */
                
                String shortText = rss.getString(3).substring(0, 250);
            %>
            <%= shortText %>
            ...
            </div>
        </div>
        <%
            }
        %>    
        
        <div class="newest">
            <div class="titleNews">
                <span> Search </span><br>
            </div>
            <form method="post" action="Home.jsp">
                <input type="text" name="search" value="" size="15" class="searchBox"/>
                <input type="submit" value="Go" name="submit" class="searchButton"/>
            </form>
            <%
                
            %>
        </div>
        <div class="newest">
            <div class="titleNews">
                <span> Last Articles </span><br>
            </div>
            <%
                ResultSet rss1 = dao.getData("select top 5 * from News order by newID desc");
                while (rss1.next()) {
            %>
            <div class="lastArticles">
                <a href="Home.jsp?idCheck=<%= rss1.getString(1) %>"><%= rss1.getString(2) %></a>
            </div>
            <%
                }
            %>
        </div>
    </body>
</html>
