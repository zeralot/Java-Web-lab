<%-- 
    Document   : gallery
    Created on : Sep 16, 2016, 3:36:21 PM
    Author     : Students
--%>

<%@page import="com.fpt.P0028.MODEL.Entry"%>
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
                <div class="wrapper photo-album photo-album-compact">
                    <div class="heading">
                        <h1 class="page-title">Projects</h1>
                    </div>

                    <div class="content"> <!-- Slideshow -->
                        <div class="section">
                            <div class="content">
                                <div class="slideshow" data-ss="albumslideshow"><div class="slideshow" data-ss="albumslideshow" id="flash-3388"><object width="100%" height="425px" id="flash-152" type="application/x-shockwave-flash" data="img/loadimg.swf" style="visibility: visible;"><param name="wmode" value="transparent"><param name="allowfullscreen" value="true"><param name="quality" value="best"><param name="allowscriptaccess" value="always"><param name="flashvars" value="mode=normal&amp;xmlurl=http%3A%2F%2Fwww.simplesite.com%2Fuserpages%2Fpages%2FPhotoAlbumSlideShowXml.aspy%3Fid%3D423585806%26cid%3D16328039&amp;imageid=114265288"></object></div></div>                    </div>
                        </div>
                        <div class="section"> 
                            <div class="content">
                                <ul class="thumbnails" data-ss="">
                                    <%
                                     for (int i = 0; i < list.size(); i++) {
                                        %>
                                     <li class="span3">
                                        <div>
                                            <div class="thumbnail">
                                                <a rel="nofollow" href="#"><img src="./img/<%= list.get(i).getIcon()%>.jpg"></a>
                                            </div>
                                        </div>
                                    </li>
                                    <% 
                                     }
                                    %>
                                   
                                    <li class="span3">
                                        <div>
                                            <div class="thumbnail">
                                                <a rel="nofollow" href="http://us-123-architect.simplesite.com/423585806?i=114265289"><img src="img/sli2.jpg"></a>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="span3">
                                        <div>
                                            <div class="thumbnail">
                                                <a rel="nofollow" href="http://us-123-architect.simplesite.com/423585806?i=114265290"><img src="img/sli3.jpg"></a>
                                            </div>
                                        </div>
                                    </li>

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>
                                <ul class="thumbnails" data-ss="">

                                </ul>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <%@include  file="./common/sbleft.jsp"%>
        </div>        
    </div>
</div>
            <% listE.close(); %>
<%@include file="./common/footer.jsp" %>