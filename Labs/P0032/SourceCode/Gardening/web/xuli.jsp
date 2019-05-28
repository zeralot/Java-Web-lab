<%-- 
    Document   : xuli
    Created on : Sep 19, 2016, 2:43:17 PM
    Author     : Students
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.controller.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    DAO dao=new DAO();
    ServletContext sc=getServletContext();
dao.connect(sc);
  String name=request.getParameter("name");
String email=request.getParameter("email");
String messenger=request.getParameter("messenger");
   String sql="insert into feedback values(?,?,?)";
   PreparedStatement ps=dao.conn.prepareStatement(sql);
   ps.setString(1, name);
   ps.setString(2, email);
   ps.setString(3, messenger);
   
int z=ps.executeUpdate();
if (z!=0)
{
    response.sendRedirect("index.jsp");
}
else
{
    out.println("error");
}









%>
