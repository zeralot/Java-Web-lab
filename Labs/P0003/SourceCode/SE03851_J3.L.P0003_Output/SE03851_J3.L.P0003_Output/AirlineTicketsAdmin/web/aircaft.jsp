<%-- 
    Document   : aircaft
    Created on : Sep 21, 2016, 2:23:42 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<%
    ListPlane listPlane = new ListPlane(getServletContext());
    ArrayList<Plane> planes = listPlane.getListPlane();
%>
<div class="col-md-2">
    <%@include file="./common/navbar.jsp" %>
</div>
<div class="col-md-10 row-right">
    <h4> Aircraft Management </h4>
    <div class="row text-center">
        <form>
            <div class="col-md-6">
                <label>
                    Plane Name: 
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
                <th class="sorting" >Plane Name</th>
                <th class="all sorting">Plane Number</th>
                <th class="all nowrap sorting_disabled">Plane Status</th>
                <th class="all sorting" >Status</th>
            </tr>
        </thead>
        <tbody>
            <%
                if(planes != null)
                for (int i = 0; i < planes.size(); i++) {
            %>
            <tr>
                <td><%= planes.get(i).getName()%></td>
                <td><%= planes.get(i).getNumber()%></td>
                <td><%= planes.get(i).isStatuss()%></td>
                <td>
                    <a href="<%= planes.get(i).getPid()%>">Edit</a>
                    <input type="checkbox">
                </td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
    <div class="text-right">
        <a href="./" class="btn btn-primary">Insert Plane</a>
        <a href="./" class="btn btn-danger">X</a>
    </div>
</div>
            <%
            listPlane.close();
            %>
<%@include file="./common/footer.jsp" %>