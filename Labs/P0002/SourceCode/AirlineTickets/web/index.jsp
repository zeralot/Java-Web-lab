<%-- 
    Document   : index
    Created on : Sep 7, 2016, 10:14:49 PM
    Author     : Students
--%>




<%@page import="com.fpt.J3.L.P0002.Model.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Airline Tickets</title>
    </head>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    
        <%

            String msg = null;
            msg = (String) session.getAttribute("msg");
            if (msg != null) {
        %>
        <script>
            alert("<%=msg%>");
        </script>
        <%
                session.removeAttribute("msg");
            }
        %>

        <%@include file="Header.jsp" %>
        <div class='index2'>
        <%
            String service = request.getParameter("service");
            if (service == null) {
                service = "home";
            }
            if (service.equals("home")) {
        %>
        <%@include file="Home.jsp"%>
        <%}
            if (service.equals("prelogin") && session.getAttribute("cus") == null) {
        %>
        <%@ include file="Login.jsp"%>
        <%} else  if (service.equals("prelogin") && session.getAttribute("cus") != null){ %>
        <%@include file="Home.jsp"%>
        <%}
            if (service.equals("preregister") && session.getAttribute("cus") == null) {
        %>
        <%@ include file="Register.jsp"%>
        <%} else  if (service.equals("preregister") && session.getAttribute("cus") != null){ %>
        <%@include file="Home.jsp"%>
        <%}
            if (service.equals("list")) {
        %>
        <%@ include file="Booking.jsp"%>
        <%}
            if (service.equals("managebookingsearch")) {
        %>
        <%@ include file="ManageBookingSearch.jsp"%>
        <%}
            if (service.equals("managebookingresult")) {
        %>
        <%@ include file="ManageBookingResult.jsp"%>
        <%}%>
        <%
            DBConnect dao = new DBConnect(getServletContext());
            if (dao.getConnect()!=null) dao.close();
            %>
        </div>
    </body>
</html>
