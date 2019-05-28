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
    
    <body <c:if test = "${message != null}">
            onload="showSnackbar('${message}')"
            <c:set var="message" value = "" scope="session"/>
        </c:if>>
        <div id="page-wrapper">
            <!-- Header -->
            <jsp:include page="IncludedPages/header.html" />
        <div id="wrapper" >
        <div class="main col-9">
            <controller:Controller className="com.controller.PagesController" methodName="getIntroImage" returnedAttribute="introImage" />
            <div class="col-12 borderBottom index-introduction-img">
                <img src="${introImage.imageUrl}" alt="" />
                <small>${introImage.caption}</small>
            </div>
            
            <div class="col-12 borderBottom index-introduction-paragraph">
                <controller:Controller className="com.controller.PagesController" methodName="getIntro" params="ShortAbout" returnedAttribute="shortAbout" />
                <div class="paragraph col-6">
                    <h3><a href="About.jsp">${shortAbout.title}</a></h3>
                    <p>${shortAbout.content}</p>
                </div>
                <controller:Controller className="com.controller.PagesController" methodName="getIntro" params="ShortContact" returnedAttribute="shortContact" />
                <div class="paragraph col-6">
                    <h3><a href="Contact.jsp">${shortContact.title}</a></h3>
                    <p>${shortContact.content}</p>
                </div>
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
