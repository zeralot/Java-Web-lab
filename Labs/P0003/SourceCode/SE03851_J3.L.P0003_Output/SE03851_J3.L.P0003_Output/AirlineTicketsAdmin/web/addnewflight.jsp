<%-- 
    Document   : addnewflight
    Created on : Sep 23, 2016, 2:42:44 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<%    ListPlane listPlane = new ListPlane(getServletContext());
    ArrayList<Plane> planes = listPlane.getListPlane();
    ListLocation listLocation = new ListLocation(getServletContext());
    ArrayList<Location> ListLocation = listLocation.getListLocation();
%>
<div class="row">
    <div class="col-md-2">
        <%@include file="./common/navbar.jsp" %>
    </div>
    <div class="col-md-10 row-right">
        <h4> Flights Management </h4>
        <% if (session.getAttribute("error")!= null) {
                out.print(session.getAttribute("error")) ;
            }%>
        <hr>

        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-10">
                <form action="./AddFlightController" method="post">
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Plane: </label>
                        <select name="pid" class="form-control col-md-10">
                            <%
                                if (planes != null)
                                    for (int i = 0; i < planes.size(); i++) {
                            %>
                            <option value="<%= planes.get(i).getPid()%>"><%= planes.get(i).getNumber()%></option>    
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Date: </label>
                        <input class="form-control col-md-10" id="UserName" name="dates" type="date" value="">
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Time Start: </label>
                        <input class="form-control col-md-10" type="time" value=""name="times">
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Time End: </label>
                        <input class="form-control col-md-10" name="times_end" type="time" value="">
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Origin: </label>
                        <select name="oid" class="form-control col-md-10">

                            <%
                                for (int i = 0; i < ListLocation.size(); i++) {
                            %>
                            <option value="<%= ListLocation.get(i).getLid()%>"><%= ListLocation.get(i).getCity()%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Destination: </label>
                        <select name="did" class="form-control col-md-10">

                            <%
                                for (int i = 0; i < ListLocation.size(); i++) {
                            %>
                            <option value="<%= ListLocation.get(i).getLid()%>"><%= ListLocation.get(i).getCity()%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Unit Price: </label>
                        <input class="form-control col-md-10" name="price" type="number" value="">
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="UserName">Slot Seat: </label>
                        <input class="form-control col-md-10" name="slot" type="number" value="">
                    </div>
                    <div class="form-group row">
                        <label class="control-label col-md-2" for="Password">Status: </label>
                        <select name="statuss" class="form-control col-md-10">
                            <option value="1">True</option>
                            <option value="2">False</option>
                        </select>
                    </div>
                    <div class="form-group row">
                        <input type="submit" value="Addnew" name="submit" class="btn btn-success">
                        <input type="submit" value="Canncel" name="cancel" class="btn btn-warning">
                    </div>
                </form>
            </div>
        </div>

    </div>
</div>
<%
    listLocation.close();
    listPlane.close();
%>
<%@include file="./common/footer.jsp" %>
