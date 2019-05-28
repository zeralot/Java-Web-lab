<%-- 
    Document   : login
    Created on : Sep 5, 2016, 2:31:12 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <jsp:useBean id="loginBean" scope="session" class="com.fpt.J3.L.P0001.entity.Users"/>
        <%-- set account to bean --%>
        <% if (loginBean.getUserType() == 0) { %>
        <form action="home.jsp" method="POST">
            <h3 style="color: blue">Login Form</h3>
            <table border="0">
                <tr>
                    <td>User Name:</td>
                    <td><input name="userName" type="text"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Sign in">
                        <a href="home.jsp?goPage=register" style="margin-left: 20px; text-decoration: none">Register</a>
                    </td>
                </tr>
            </table>
        </form>
        <% } else {%>            
        <p>Welcome <font style="color: blue"> <%= loginBean.getUserName()%> </font> </p>
            <% }%>
    </body>
</html>
