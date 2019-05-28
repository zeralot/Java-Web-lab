<%-- 
    Document   : inex
    Created on : Sep 16, 2016, 3:16:00 PM
    Author     : Students
--%>

<%@page import="com.fpt.P0028.MODEL.Entry"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.fpt.P0030.BAO.ListEntry"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="./common/header.jsp" %>
<%
    ListEntry listE = new ListEntry(serContext);
    ArrayList<Entry> list = listE.getListEntry();
%>
<div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
    <div class="container">
        <div class="row-fluid content-inner">
            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                <div class="wrapper ">
                    <div class="content">
                        <div class="section article">
                            <div class="content">
                                <div class="img-simple span12 ">
                                    <div class="image">
                                        <a rel="nofollow" data-ss="imagemodal" ><img src="img/1.jpg"></a>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <% for (int i = 0; i < list.size(); i++) {
                                if (i == 0) {
                        %>
                        <div class="section article">
                            <div class="heading">
                                <h3><%= list.get(i).getName()%></h3>
                            </div>

                            <div class="content">
                                <p><span><%= list.get(i).getDescription_entry()%></span></p>    </div>
                        </div>
                        <%
                            }else
                            if (i == 1) {
                        %>

                        <div class="section article">
                            <div class="heading">
                                <h3><%= list.get(i).getName()%></h3>
                            </div>

                            <div class="content">
                                <div class="img-simple span6 pull-right">
                                    <div class="image">
                                        <a rel="nofollow" data-ss="imagemodal" data-href="http://cdn.simplesite.com/i/ad/23/283163831105823661/i283163839570120340._szw1280h1280_.jpg"><img src="./img/<%= list.get(i).getIcon()%>.jpg"></a>
                                    </div>
                                </div>
                               <p><span><%= list.get(i).getDescription_entry()%></span></p>     </div>
                        </div>
                        <%
                            }
                        %>
                        <%
                            }%>



                        <div class="section">
                            <div class="content">
                                <ul class="thumbnails column-article-section">
                                    <%
                                     for (int i = 2; i < list.size(); i++){
                                         %>
                                    <li class="span4">
                                        <div class="img-simple span12 ">
                                            <div class="image">
                                                <a rel="nofollow" data-ss="imagemodal" data-href="http://cdn.simplesite.com/i/ad/23/283163831105823661/i283163839570120380._szw1280h1280_.jpg"><img src="./img/<%= list.get(i).getIcon()%>.jpg"></a>
                                            </div>
                                        </div>

                                        <h4>
                                            <%= list.get(i).getName()%></h4>

                                        <p><%= list.get(i).getDescription_entry()%></p>
                                    </li>
                                    <%
                                     } 
                                    %>
                                </ul>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
            <%@include  file="./common/sbleft.jsp"%>
        </div>        
    </div>
</div>  <!-- the controller has determined which view to be shown in the content -->
<% listE.close(); %>
<%@include file="./common/footer.jsp" %>