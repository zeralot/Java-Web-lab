<%-- 
    Document   : ManageBookingResult
    Created on : Sep 5, 2016, 3:56:01 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div class="mbr1" class='index1'>
            <%

                String msg2 = null;
                msg2 = (String) session.getAttribute("msg");
                if (msg2 != null) {
            %>
            <script>
            alert("<%=msg2%>");
            </script>
            <%
                    session.removeAttribute("msg");
                }
            %>
            <% ResultSet rs = (ResultSet) session.getAttribute("rsbooking");

                while (rs.next()) {%>
            <font color='orange' size='+2'><b>eTicket Receipt</b></font><br>
            Prepared For<br>
            <%=rs.getString(16)%>,<%=rs.getString(17)%><br>
            RESERVATION CODE <b><%=rs.getInt(1)%></b><br>
            TICKET ISSUE DATE <%=rs.getString(4)%>
            <br>
            <br>
            <font color='orange' size='+2'><b>Itinerary Details</b></font>
            <table style='line-height:20px'>
                <tr>
                    <td width='20%'>TRAVEL DATE
                    <td width='20%'>DEPARTURE
                    <td width='20%'>ARRIVAL
                </tr>
                <tr>
                    <td><%=rs.getString(8)%>
                    <td><%=rs.getString(6)%><br>
                        Time <%=rs.getString(9)%>
                    <td><%=rs.getString(7)%>
                        <br>Time <%=rs.getString(10)%>
                </tr>

            </table>
            <% if (!rs.isLast()) {%>
            <hr align='center' width='80%' class='hr1'>
            <%}%>
            <%}%>


        </div>
    </body>
</html>
