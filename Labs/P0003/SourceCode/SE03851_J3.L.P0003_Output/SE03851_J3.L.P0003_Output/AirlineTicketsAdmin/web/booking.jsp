<%-- 
    Document   : booking
    Created on : Sep 21, 2016, 3:31:45 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<!-- Navigation -->
<%
    ListBooking list = new ListBooking(getServletContext());
    ArrayList<Booking> bookings = list.getBookings();
%>
<div class="row">
    <div class="col-md-2">
        <%@include file="./common/navbar.jsp" %>
    </div>
    <div class="col-md-10 row-right">
        <h4> Booking Management </h4>
        <div class="row text-center">
            <form>
                <div class="col-md-6">
                    <label>
                        Customer name: 
                    </label>
                    <input class="form-control" type="number">
                </div>
                <div class="col-md-6">
                    <input type="submit" class="btn" value="Search">
                </div>
            </form>
        </div>
        <table class="table table-striped table-bordered table-hover dataTable no-footer dtr-inline">
            <thead>
                <tr role="row">
                    <th class="sorting" >Booking  ID</th>
                    <th class="all sorting">Customer name</th>
                    <th class="all nowrap sorting_disabled">Phone</th>
                    <th class="never sorting" >Date</th>
                    <th class="all sorting" >Seat</th>
                    <th class="all sorting" >Booking number</th>
                    <th class="all sorting" >Status Ticked</th>
                     <th class="all sorting" >Status</th>
                      <th class="all sorting" >#</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (int i = 0; i < bookings.size(); i++) {
                %>
                <tr>
                    <td><%= bookings.get(i).getBid()%></td>
                    <td><%= bookings.get(i).getUsername()%></td>
                    <td><%= bookings.get(i).getPhone()%></td>
                    <td><%= bookings.get(i).getDate()%></td>
                    <td><%= bookings.get(i).getSeat()%></td>
                    <td><%= bookings.get(i).getBookingnumber()%></td>
                    <td><%= bookings.get(i).getStatus_ticket()%></td>
                    <td><%= bookings.get(i).isStatuss()%></td>
                    <td>
                        <a href="<%= bookings.get(i).getBid() %>">Edit</a>
                        <input type="checkbox">
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <div class="text-right">
            <a href="./" class="btn btn-primary">Add new Booking</a>
            <a href="./" class="btn btn-danger">X</a>
        </div>
    </div>
</div>
                <%
                    list.close();
                %>
<%@include file="./common/footer.jsp" %>