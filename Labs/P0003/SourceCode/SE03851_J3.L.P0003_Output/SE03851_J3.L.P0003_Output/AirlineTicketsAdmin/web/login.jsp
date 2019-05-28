<%-- 
    Document   : login
    Created on : Sep 19, 2016, 1:09:59 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("UserName") != null){
                response.sendRedirect("./index.jsp");
                return;
            }
        %>
        <div class="container">
            <div class="row col-center">
                <div class="col-md-3"></div>
                <div class="col-md-6 col-background-login">
                    <fieldset>
                        <legend>Login</legend>
                        <form action="LoginController" method="post">
                            <div class="form-group col-md-6">
                                <label class="control-label" for="UserName">Username</label>
                                <input class="form-control" data-val="true"   name="UserName" type="text" required="">
                            </div>
                            <div class="form-group col-md-6">
                                <label class="control-label" for="Password">Password</label>
                                <input class="form-control" name="Password" type="password" required="">
                            </div>
                            <div class="form-group col-md-6">
                                <div class="checkbox">
                                    <label>
                                        <input id="RememberMe" name="RememberMe" type="checkbox" value="true">
                                        <label for="RememberMe">Remember Me</label>
                                    </label>
                                </div>
                            </div>
                            <div class="form-group col-md-6">
                                <input type="submit" value="Login" class="btn btn-success">
                            </div>
                        </form>
                    </fieldset>

                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>
