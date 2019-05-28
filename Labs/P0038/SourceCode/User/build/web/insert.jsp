<%-- 
    Document   : insert
    Created on : Sep 9, 2016, 1:20:04 PM
    Author     : Students
--%>

<%@page import="com.fpt.lab231.BO.User"%>
<%@page import="com.fpt.L231.controller.DAO_User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<  <%
    DAO_User dao = new DAO_User();
    ServletContext sc = getServletContext();
    dao.connect(sc);

    String UserName = request.getParameter("UserName");
    String Email = request.getParameter("Email");
    String FirstName = request.getParameter("FirstName");
    String LastName = request.getParameter("LastName");
    String Website = request.getParameter("Website");
    String Password = request.getParameter("Password");
    String Role = request.getParameter("Role");

    User u = new User(UserName, Email, FirstName, LastName, Website, Password, Role);
    int k = dao.addUser(u);
    if (k != 0) {
%>
<h2>Add succesful</h2>
<%
    response.setHeader("Refresh", "3, URL=login.jsp");
} else {
%>


<h2>Add error</h2>

<%}


%>