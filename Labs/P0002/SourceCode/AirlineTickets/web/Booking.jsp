<%-- 
    Document   : Book
    Created on : Sep 5, 2016, 2:10:25 PM
    Author     : Students
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        <%
            ResultSet rs = (ResultSet) session.getAttribute("rsflight");

        %>
        <div class="booking1">
            <div align="right"><b>Deparure: </b><%=(String) session.getAttribute("from")%> <b>Return: </b><%=(String) session.getAttribute("to")%></div>
            <h1>1. Select Departing Flight</h1>
            <% while (rs.next()) {%>
            <div class="booking2">
                <font  size = "+1" > <b> <%=rs.getString(2)%></b> </font><font color="gray">to </font><font size="+1"><b><%=rs.getString(3)%></b></font>
                <div style="margin-left: 20px; margin-top: 10px">
                    <font size='+1' color='orange'><b><%=rs.getString(4)%></b></font>
                    <table class="booking3">
                        <tr>
                            <td width='20%'>Departs
                            <td width='20%'>Arrives
                            <td width='20%'>Flight Detail
                        </tr>
                        <tr>
                            <td><%=rs.getString(5)%>
                            <td><%=rs.getString(6)%>
                            <td><%=rs.getString(7)%>
                            <td class="booking4" width="250px"><font color="orange"><input type="radio">$<%=rs.getInt(8)%>.00</font>
                        </tr>
                    </table>

                    Note: Prices quoted are per adult passenger in USD. Unless otherwise stated fares are non refundable, limited changes are permitted changes apply<br>
                    Please note that this amount excludes fees and taxes.
                </div>
            </div>
            <div align='right' style='margin-top:10px'>
                <a href="BookingController?service=add&fid=<%=rs.getInt(1)%>"> <button class="booking5"><font color="white">Save</font></button></a>
            </div>
            <%}%>
        </div>

    </body>
</html>
