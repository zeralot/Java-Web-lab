<%-- 
    Document   : home
    Created on : Sep 5, 2016, 1:32:23 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.J3.L.P0001.model.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:useBean id="loginBean" scope="session" class="com.fpt.J3.L.P0001.entity.Users"/>
        <%-- set account to bean --%>
        <jsp:setProperty name="loginBean"  property="*" />
        <%
            String sql = "select * from Users where userName = '" + loginBean.getUserName() + "' and password ='" + loginBean.getPassword() + "'";
            ServletContext sc = getServletContext();
            DAO dao = new DAO(sc);
            ResultSet rs = dao.getData(sql);
            if (rs.next()) {
                loginBean.setUserID(rs.getInt(1));
                loginBean.setUserType(rs.getInt(4));
            }
        %>
        <div class="container" >
            <div class="nav">
                <ul class ="menu" data-submenu="horizontal">
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="home.jsp?goPage=takequiz">Take Quiz</a></li>
                        <% if (loginBean.getUserType() == 1) { %>
                    <li><a href="home.jsp?goPage=makequiz">Make Quiz</a></li>
                    <li><a href="Controller?service=managequiz">Manage Quiz</a></li>
                        <% }
                            if (loginBean.getUserType() != 0) { %>
                    <li><a href="Controller?service=logout">Logout</a></li>
                        <% } %>
                </ul>
            </div>
            <div class="main">
                <%
                String goPage = (String) request.getParameter("goPage");
                if (goPage == null || loginBean.getUserType() == 0) { %>

                    <%  if (goPage != null && goPage.equals("register")) {%>
                    <jsp:include page="register.jsp"></jsp:include>
                    <% } else {%>
                    <jsp:include page="login.jsp"></jsp:include>
                    <% }
                } else if (goPage.equals("takequiz")) {%>
                <jsp:include page="takequiz.jsp"></jsp:include>
                <% } else if (goPage.equals("makequiz")) {%>
                <jsp:include page="makequiz.jsp"></jsp:include>
                <% } else if (goPage.equals("managequiz")) {%>
                <jsp:include page="managequiz.jsp"></jsp:include>
                <% }%> 
            </div>
        </div>
    </body>
</html>
