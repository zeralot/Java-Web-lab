<%-- 
    Document   : Register
    Created on : Sep 7, 2016, 10:02:49 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div align="center" style="margin-top: 60px; margin-bottom: 100px">
            <font color="orange" size="+3">  Register </font>
        
        <form action="CustomerController?service=register" method="post" style="margin-top: 20px">
        <table style="line-height: 30px">
            <tr>
                <td><font color="orange" size="+1"> New Account</font>
            </tr>
            <tr>
                <td>Email
                <td><input type="email" name="email">
            </tr>
            <tr>
                <td>Password
                <td><input type="password" name="pass">
            </tr>
            <tr>
                <td>Verify Password
                <td><input type="password" name="repass">
            </tr>
            <tr>
                <td><font color="orange" size="+1">Contact Information</font>
            </tr>
            <tr>
                <td>First name
                <td><input type ="text" name="firstname">
            </tr>
            <tr>
                <td>Last name
                <td><input type="text" name="lastname">
            </tr>
            <tr>
                <td>Address
                <td><input type="text" name="address">
            </tr>
            <tr>
                <td>Phone Number
                <td><input type="text" name="phonenumber">
            </tr>
            <tr>
                <td>Sex
                <td><select name="sex">
                        <option value="0">Male</option>
                        <option value="1">Female</option>
                    </select>
            </tr>
            <tr>
                <td>Age
                <td><input type="text" name="age">
            </tr>
            <tr>
                <td>Card Number
                <td><input type="text" name="card">
            </tr>
            <tr style="height:50px">
                <td>
                <td> <button type="submit" class="reg1"><font color="white">Register</font></button>
            </tr>

        </table>
        </form>
            </div>
    </body>
</html>
