<%-- 
    Document   : index
    Created on : May 8, 2017, 9:20:57 PM
    Author     : Chuc Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="controller" uri="/WEB-INF/tlds/Controller"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="assets/css/main.css"> 	
    </head>
    
    <body onload="loadImage('loadNextImage', 0)">
        <div id="page-wrapper">
            <!-- Header -->
            <jsp:include page="IncludedPages/header.html" />
        <div id="wrapper" >
        <div class="main col-9">
            
            <h2>Photo Album</h2>
            <controller:Controller className="com.controller.PagesController" methodName="getPhotos" returnedAttribute="photos" />
            <div class="borderBottom album-selectedPicture">
                <div class="text-aligncenter marginBottom">
                    <a class="button cursorPointer" id="prevBtn" onclick="loadImage('loadPrevImage', currentId)"> <b> |< </b> </a>
                    <a class="button cursorPointer" id="nextBtn" onclick="loadImage('loadNextImage', currentId)"> <b> >| </b> </a>
                </div>
                <img id="selectedImage" src="" />
            </div>
            <div class="album-pictureList">
                <c:forEach var="i" items="${photos}">
                    <div class="col-3 item">
                        <div class="cursorPointer detail">
                            <a><img src="${i.smallImageUrl}" alt="${i.name}" onclick="loadImage('loadImage', ${i.id})" /></a>
                        </div>
                    </div>
                </c:forEach>
            </div>

        </div>
        <!-- RIght Panel -->
        <jsp:include page="IncludedPages/RightPanel.jsp" />   
        </div>
        </div>
                
        <!-- Message Snackbar -->
        <jsp:include page="IncludedPages/MessageSnackbar.jsp" />
                
        <!-- Script -->
        <script src="assets/js/main.js"></script>
        
    </body>
</html>
