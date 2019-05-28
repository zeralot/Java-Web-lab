<%-- 
    Document   : index
    Created on : Sep 19, 2016, 1:04:26 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<!-- Navigation -->
<%
    ListLocation list = new ListLocation(getServletContext());
    ArrayList<Location> ListLocation = list.getListLocation();
%>
<div class="row">
    <div class="col-md-2">
        <%@include file="./common/navbar.jsp" %>
    </div>
    <div class="col-md-10 row-right">
        <h4> Location Management </h4>
        <div class="row text-center">
            <form>
                <div class="col-md-6">
                    <label>
                        Location ID: 
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
                    <th class="sorting" >Local ID</th>
                    <th class="all sorting">Country</th>
                    <th class="all nowrap sorting_disabled">City</th>
                    <th class="never sorting" >Symbol</th>
                    <th class="all sorting" >Status</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (int i = 0; i < ListLocation.size(); i++) {
                %>
                <tr>
                    <td><%= ListLocation.get(i).getLid() %></td>
                    <td><%= ListLocation.get(i).getCountry()%></td>
                    <td><%= ListLocation.get(i).getSymbol()%></td>
                    <td><%= ListLocation.get(i).isStatuss()%></td>
                    <td>
                        <a href="<%= ListLocation.get(i).getLid() %>">Edit</a>
                        <input type="checkbox">
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <div class="text-right">
            <a href="./" class="btn btn-primary">Add new Location</a>
            <a href="./" class="btn btn-danger">X</a>
        </div>
    </div>
</div>
                <%
                list.close();
                %>
<%@include file="./common/footer.jsp" %>