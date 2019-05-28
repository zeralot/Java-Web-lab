<%-- 
    Document   : register
    Created on : Sep 5, 2016, 3:29:10 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>        
        <h3 style="color: blue">Registration Form</h3>
        <form action="Controller?service=register" method="POST">
            <table border="0">
                <tr>
                    <td>User Name:</td>
                    <td><input name="userName" type="text"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input name="password" type="password"></td>
                </tr>
                <tr>
                    <td>User Type:</td>
                    <td>
                        <select name="type">
                            <option>Teacher</option>
                            <option>Normal User</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input name="email" type="email"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Register">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
