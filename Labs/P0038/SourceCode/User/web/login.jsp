<%-- 
    Document   : login
    Created on : Sep 7, 2016, 1:26:55 PM
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
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style=" background-color: #ccccff" >

        <form class="login" action="check.jsp">

            <div class="title"><h1> LOG IN</h1></div>

            <div  >
                <input class="ip1" placeholder="User Name" name="UserName">

                <input class="ip1" placeholder="PassWord" name="Password">

            </div>
            <div>
                <input class="submit" type="submit" value="Log In">
                <a class="link" href="add.jsp">Register</a>
                <a class="link1" href="#">Forgot the password?</a>
            </div>











        </form>


















    </div

</body>
</html>
