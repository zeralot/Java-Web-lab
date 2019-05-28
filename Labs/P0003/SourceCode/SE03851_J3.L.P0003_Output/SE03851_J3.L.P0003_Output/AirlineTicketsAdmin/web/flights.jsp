<%-- 
    Document   : flights
    Created on : Sep 21, 2016, 2:44:58 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<!-- Navigation -->
<%    ListFlights list = new ListFlights(getServletContext());
    ArrayList<Flights> flightses = list.getFlightses();
%>
<div class="row">
    <div class="col-md-2">
        <%@include file="./common/navbar.jsp" %>
    </div>
    <div class="col-md-10 row-right">
        <h4> Flights Management </h4>
        <div class="row text-center">
            <form>
                <div class="col-md-3">
                    <label>
                        Origin: 
                    </label>
                    <input class="form-control" type="number">
                </div>
                <div class="col-md-3">
                    <label>
                        Destination: 
                    </label>
                    <input class="form-control" type="number">
                </div>
                <div class="col-md-3">
                    <label>
                        Date: 
                    </label>
                    <input class="form-control" type="number">
                </div>

                <div class="col-md-3">
                    <input type="submit" class="btn" value="Search">
                    <a href="./addnewflight.jsp" class="btn btn-primary">Add</a>
                    <a href="./" class="btn btn-danger">X</a>
                </div>
            </form>
        </div>
        <table class="table table-striped table-bordered table-hover dataTable no-footer dtr-inline">
            <thead>
                <tr role="row">
                    <th class="sorting" >ID</th>
                    <th class="all sorting">Date</th>
                    <th class="all nowrap sorting_disabled">Time Start</th>
                    <th class="never sorting" >Time End</th>
                    <th class="all sorting" >Origin</th>
                    <th class="all sorting" >Destination</th>
                    <th class="all sorting" >Unit Price</th>
                    <th class="all sorting" >Empty Seat</th>
                    <th class="all sorting" >Status</th>
                    <th class="all sorting" >#</th>
                </tr>
            </thead>
            <tbody>
                <%
                    if (flightses != null)
                        for (int i = 0; i < flightses.size(); i++) {
                %>
                <tr>
                    <td><%= flightses.get(i).getFid()%></td>
                    <td><%= flightses.get(i).getDate()%></td>
                    <td><%= flightses.get(i).getTime()%></td>
                    <td><%= flightses.get(i).getTimes_end()%></td>
                    <td><%= flightses.get(i).getOren()%></td>
                    <td><%= flightses.get(i).getDes()%></td>
                    <td><%= flightses.get(i).getPrice()%></td>
                    <td><%= flightses.get(i).getSlot()%></td>
                    <td><%= flightses.get(i).isStatus()%></td>
                    <td>
                        <a href="<%= flightses.get(i).getFid()%>">Edit</a>
                        <input type="checkbox">
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>

        </table>
    </div>
</div>
                <%
                list.close();
                %>
<%@include file="./common/footer.jsp" %>