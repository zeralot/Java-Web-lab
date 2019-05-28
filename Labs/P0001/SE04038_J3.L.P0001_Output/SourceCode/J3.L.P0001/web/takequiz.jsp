<%-- 
    Document   : takequiz
    Created on : Sep 5, 2016, 2:39:37 PM
    Author     : Students
--%>

<%@page import="com.fpt.J3.L.P0001.entity.Quiz"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Take Quiz Page</title>
        <script>
            var deadline = new Date(Date.parse(new Date()) + <%= session.getAttribute("timeRemain")%>);
            function countTime() {
                var today = new Date();
                var remain = new Date(deadline - today - 7 * 3600 * 1000);
                var h = remain.getHours();
                var m = remain.getMinutes();
                var s = remain.getSeconds();
                if (h == 0 && m == 0 && s == 0) {
                    window.location = "Controller?service=finishTest";
                }
                m = checkTime(m);
                s = checkTime(s);
                document.getElementById('clock').innerHTML = h + ":" + m + ":" + s;
                document.getElementById('timeRemain').value = (h * 3600 + m * 60 + s) * 1000;
                setTimeout(countTime, 1000);
            }

            function checkTime(i) {
                if (i < 10) {
                    i = "0" + i;
                }
                ;  // add zero
                return i;
            }
        </script>
        <jsp:useBean id="loginBean" scope="session" class="com.fpt.J3.L.P0001.entity.Users"/>
    </head>
    <body onload="countTime()">       
        <p>Welcome <font style="color: blue"> <%= loginBean.getUserName()%> </font> </p>
            <%
                ArrayList<Quiz> listTakeQuiz = (ArrayList<Quiz>) session.getAttribute("listTakeQuiz");
                if (loginBean.getTestState() == -1) { %>
        <div class="pre-test">
            <form action="Controller?service=getQuiz" method="POST">
                Enter the number question: <br>
                <input type="number" name="numQuestion" value="" required /><br>
                <input type="submit" value="Start" style="margin-left: 300px" />
            </form>
        </div>
        <% } else if (loginBean.getTestState() == -2) { %>
        <%
            int score = (int) session.getAttribute("score");
            double percent = score * 1.0 / (listTakeQuiz.size());
        %>
        <div class="info-test">
            <p>Your score <font style="<%= percent >= 0.5 ? "color: blue" : "color: red"%>"> <%= score%> (<%= String.format("%.2f", percent * 100)%>%) - <%= percent >= 0.5 ? "Passed" : "Failed"%></font> </p>
            Take another test <a href="Controller?service=newTakeQuiz"><input type="button" value="Start" /></a>
        </div>
        <% } else {%>
        <div class="quiz">
            <form method="POST" action="Controller?service=nextQuiz" id="testsubmit" name="testsubmit">
                <p style="margin-left: 200px">Time remaining <font style="color: red"><span id="clock"></span></font></p>
                    <%= listTakeQuiz.get(loginBean.getTestState()).getQuestion()%>
                <div class="answer">
                    <input type="checkbox" name="answer" value="1" /><%= listTakeQuiz.get(loginBean.getTestState()).getAnswer1()%><br>
                    <input type="checkbox" name="answer" value="2" /><%= listTakeQuiz.get(loginBean.getTestState()).getAnswer2()%><br>
                    <input type="checkbox" name="answer" value="3" /><%= listTakeQuiz.get(loginBean.getTestState()).getAnswer3()%><br>
                    <input type="checkbox" name="answer" value="4" /><%= listTakeQuiz.get(loginBean.getTestState()).getAnswer4()%>
                </div>
                <input type="hidden" value="" name="timeRemain" id="timeRemain">
                <input type="submit" value="Next" style="float: right"/>
            </form>
        </div>
        <% }%>
    </body>
</html>
