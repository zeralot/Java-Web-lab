<%-- 
    Document   : contact
    Created on : Sep 7, 2016, 3:47:37 PM
    Author     : Students
--%>

<%@page import="com.fpt.P0030.BAO.ListContact"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./common/header.jsp" %>
<%    // isset request form 
    String errors = "";
    ListContact listC = new ListContact(getServletContext());
    if (request.getParameter("submit") != null) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String text = request.getParameter("text");
        if (name == null || name.equals("")) {
            errors += "Name must be contain <br>";
        }
        if (email == null || email.equals("") || !email.matches("^.[0-9a-zA-Z]*+@+.[.a-zA-Z]*$")) {
            errors += "Email must be xxx@xxx <br>";
        }
        if (text == null || text.equals("")) {
            errors += "Text must be contain";
        }
        if (errors.equals("")) {
            boolean resutls = listC.addContact(name, email, text);
            if (resutls) {
                response.sendRedirect("./");
                return;
            } else {
                out.print("errors");
            }
        }
    }
%>
<div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
    <div class="container">
        <div class="row-fluid content-inner">
            <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                <div class="wrapper contact">
                    <div class="heading">
                        <h1 class="page-title">Contact me</h1>
                    </div>

                    <div class="content">
                        <div class="section">
                            <div class="content">
                                <div class="span12 contact-text">
                                    <h4>Send your message</h4>

                                </div>
                            </div>
                        </div>

                        <div class="section contact-form"><div class="content"><div class="alert alert-success hide">
                                    Thank you for your message.
                                </div>
                                <div class="alert alert-error hide">
                                    <button type="button" class="close">Ã—</button>
                                </div>
                                <p>Write your message here. Fill out the form:</p>
                                <form action="./contact.jsp" method="POST">
                                    <fieldset>
                                        <div class="row-fluid">
                                            <div class="span6">
                                                <input type="text" name="name" placeholder="Write your name here" required="">
                                                <span class="help-block"></span>
                                            </div>
                                            <div class="span6">
                                                <input type="text" name="email" placeholder="Write your email here" required="">
                                                <span class="help-block"></span>
                                            </div>
                                        </div>
                                        <div class="row-fluid">
                                            <div class="span12">
                                                <textarea name="text" placeholder="Write your message here" required=""></textarea>
                                                <span class="help-block"></span>
                                            </div>
                                        </div>
                                        <div id="recaptcha" class="row-fluid"></div>       
                                        <div class="row-fluid">
                                            <div class="span12">
                                                <button class="btn btn-primary pull-right" type="submit" name="submit">Send - Click here</button>
                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                                <div style="color: red; font-weight: bold">
                                    <%
                                        if (!errors.equals("")) {
                                            out.print(errors);
                                        }
                                    %>

                                </div>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
           
                <%@include file="./common/sbleft.jsp" %>
        </div>        
    </div>
</div>
                <% listC.close(); %>
<%@include file="./common/footer.jsp" %>