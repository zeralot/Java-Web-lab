<%-- 
    Document   : Header
    Created on : Sep 5, 2016, 1:02:16 PM
    Author     : Students
--%>

<%@page import="com.fpt.J3.L.P0002.Entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body style='margin:0px'>
        <div class="bg1">
            <div class="logoheader">
                <img src="pic/logo.png" style="width:90%; margin-top: 30px">
            </div>
            <div class="textheader">
                <font color="white" size="+2">  Fast, Frequent & Safe Flights </font>
            </div>
            <% Customer cus = (Customer)session.getAttribute("cus");  %>
            <div class="buttonheader">
            <% if (cus == null) {%>
                <a href="index.jsp?service=prelogin"><img src="pic/home.png" width="20%"></a>
                <a href="index.jsp?service=preregister"><img src="pic/register_t.png" width="20%"></a>
                <br>
                <font color="white" size="-1">
                <span style="margin-left: 10px">Login</span> 
                <span style="margin-left: 15px">Register</span>
                </font>
            <%} else {%>
            
            <div class="hed">
                Hello, <%=cus.getFirstname()%>.
                <a href="CustomerController?service=logout">Logout</a> 
            </div>
            <%}%>
            </div>
            <% String service1 = request.getParameter("service");
             if (service1==null) service1="home";%>
            <div style="margin-top: 3% ">       
                <a href="index.jsp?service=home"><button class=" menu <%if(service1.equals("home") || service1.equals("prelogin") || service1.equals("preregister")){%> active <%}%>"><font size="+2">Home</font></button></a>
                <a href="FlightController?service=book"><button class="menu  <% if (service1.equals("list")){ %> active <%}%> "><font size="+2">Book</font></button></a>
                <a href="index.jsp?service=managebookingsearch"><button class="menu  <% if (service1.equals("managebookingsearch") || service1.equals("managebookingresult")){ %> active <%}%> " style="width:20%"><font size="+2">Manage Booking</font></button></a>
            </div>
        </div>
    </body>
</html>
