<%-- 
    Document   : footer
    Created on : Sep 16, 2016, 3:15:09 PM
    Author     : Students
--%>

<%@page import="com.fpt.P0030.BAO.PageViews"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    PageViews pages = new PageViews(getServletContext());
    if (session.getAttribute("view") == null) {
        pages.upViews();
        session.setAttribute("view", 0);
    }
    String views_number = pages.getViews();
%>

<div class="container-fluid footer-wrapper" id="footer"> <!-- this is the Footer Wrapper -->
    <div class="container">
        <div class="footer-info">
            <div class="footer-info-text">
                This website was created with SimpleSite
            </div>
            <div class="footer-powered-by">
                <a rel="nofollow" href="http://www.simplesite.com/">Get Your own FREE website. Click here!</a>
            </div>
        </div>
       <div class="footer-page-counter" >
            <%
                char a[] = views_number.toCharArray();
                for (int i = 0; i < a.length; i++) {
            %>
            <span class="footer-page-counter-item"><%=a[i]%></span>
            <%
                }

            %>
        </div>

        <div id="css_simplesite_com_fallback" class="hide"></div>
    </div>
</div>  <!-- this is the Footer content -->
</div>
</body></html>