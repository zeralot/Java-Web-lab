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
            <jsp:include page="IncludedPages/header.html" />
            
            
        <div id="wrapper" >

        <div class="main col-9">
            <controller:Controller className="com.controller.PagesController" methodName="getInfo" returnedAttribute="info" />
            <h2>Contact me</h2>
            <h3>Melanie's Day Care</h3>
            <div class="row borderBottom contact-info col-12">
                
                <p>Address: ${info.address}
                    </p>
                
                <p>Tel: ${info.tel}
                <br/>Email: ${info.email}</p>
                
            </div>
            
            <div class="col-12 marginTop contact-form">
                <p>Write your message here. Fill out the form:</p>
                <form action="ServletController?action=writeMessage" method="post">
                    <div class="col-6"><input type="text" name="name" placeholder="Write your name here" maxlength="30" required="true" /></div>
                    <div class="col-6"><input type="email" name="email" placeholder="Write your email here" maxlength="30" required="true" /></div>
                    <div class="col-12"><textarea name="message" placeholder="Write your message here" required="true"></textarea></div>
                <p class="text-alignright"><input type="submit" class="button" value="Send - Click here" /></p>
                </form>
            </div>
            
        </div>

        <jsp:include page="IncludedPages/RightPanel.jsp" />



        </div>
        </div>
        
        <!-- Scripts -->
                
        
    </body>
</html>
