<%-- 
    Document   : Login
    Created on : Sep 5, 2016, 2:53:43 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <form action="CustomerController?service=login" method="post">
        <div align="center" style="margin-top: 60px; margin-bottom: 50px">
            <font color="orange" size="+2"><b>Login</b></font>
            <table class="login1" style="margin-top:10px">
                <tr>
                    <td style="width: 20%">Email</td>
                    <td  style="width:40%"><input type="email" name="email" style="width:200px">
                </tr>
                <tr>
                    <td>Password</td>
                    <td ><input type="password" name="password" style="width:200px">
                </tr>
                <tr style="line-height: 60px">
                    <td> </td>
                    <td>
                        <button class="login2" type="submit"><font color="white">Login</font></button>
                        <a href="index.jsp?service=preregister"><button class="login2" type="button"><font color="white">Register</font></button></a>
                </tr>
            </table>
        </div>
        </form>
    </body>
</html>
