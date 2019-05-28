<%-- 
    Document   : sendFeedBack
    Created on : Sep 19, 2016, 6:00:57 PM
    Author     : Students
--%>

<%@page import="com.fpt.lab221.DAO.DatabaseInvoke"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  String name = request.getParameter("name");
            String email = request.getParameter("email");
            String mess = request.getParameter("message");
            DatabaseInvoke db = new DatabaseInvoke();
            ServletContext sc = getServletContext();
            db.connectToDatabase(sc);
            db.insertIntoFeedBack(name, email, mess);
            response.sendRedirect("Contact Us.jsp");
        %>
    </body>
</html>
