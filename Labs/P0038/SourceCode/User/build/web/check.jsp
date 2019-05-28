<%-- 
    Document   : check
    Created on : Sep 9, 2016, 1:01:39 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.fpt.L231.controller.DAO_User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    String user = request.getParameter("UserName");
      String pass = request.getParameter("Password");
      DAO_User dao = new DAO_User();
      ServletContext sc = getServletContext();
      dao.connect(sc);

      ResultSet rs = dao.getUser();
      boolean succ = false;
      while (rs.next()) {
        String u = rs.getString(1);
        String p = rs.getString(6);

      if (u.equalsIgnoreCase(user) && p.equalsIgnoreCase(pass)) {
            succ = true;
            break;
        }
    }
      if (succ == true) {
%><h2>Login succesful</h2>
<h4>Redirect a home page in a few second.....</h4>
<%
      response.setHeader("Refresh", "2,URL=show.jsp");
} else {
%><h2>Login failed</h2>
<h4>Redirect again login page in a few second..... </h4>
<%
      response.setHeader("Refresh", "2,URL=login.jsp");
    }%>