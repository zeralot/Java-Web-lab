<%-- 
    Document   : account
    Created on : Sep 21, 2016, 3:32:06 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<!-- Navigation -->
<%    ListUser list = new ListUser(getServletContext());
    ArrayList<User> users = list.getListUser();
%>
<div class="row">
    <div class="col-md-2">
        <%@include file="./common/navbar.jsp" %>
    </div>
    <div class="col-md-10 row-right">
        <h4> Account Management </h4>
        <div class="row text-center">
            <form>
                <div class="col-md-6">
                    <label>
                        Management Account: 
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
                    <th class="sorting" >Account</th>
                    <th class="all sorting">Firstname</th>
                    <th class="all nowrap sorting_disabled">Lastname</th>
                    <th class="never sorting" >Email</th>
                    <th class="all sorting" >Status</th>
                    <th class="all sorting" >#</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (int i = 0; i < users.size(); i++) {
                %>
                <tr>
                    <td><%= users.get(i).getUsername()%></td>
                    <td><%= users.get(i).getFirstname()%></td>
                    <td><%= users.get(i).getLastname()%></td>
                    <td><%= users.get(i).getEmail()%></td>
                    <td><%= users.get(i).isStatus()%></td>
                    <td>
                        <a href="<%= users.get(i).getUid()%>">Edit</a>
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