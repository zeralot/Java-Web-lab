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
    
    <body>
        <div id="page-wrapper">
            <!-- Header -->
            <jsp:include page="IncludedPages/header.html" />
        <div id="wrapper" >
        <div class="main col-9">
            
            <controller:Controller className="com.controller.PagesController" methodName="getIntro" params="About" returnedAttribute="about" />
            <h2>${about.title}</h2>
            
            <div class="about-detail">
                <img class="col-3" src="${about.imageUrl}" alt="" />
                <p>${about.content}</p>
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
