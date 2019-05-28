<%-- 
    Document   : add
    Created on : Sep 5, 2016, 2:41:46 PM
    Author     : Students
--%>

<%@page import="com.fpt.lab231.BO.User"%>
<%@page import="com.fpt.L231.controller.DAO_User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="css/add.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">
            function checkU()
            {
                var x = document.all.UserName.value;
                var k = x.length;
                if (x <= 0)
                {
                    alert("Username must be fill full");
                    return false;
                }

                return true;



            }
            function checkE()
            {
                var x = document.all.Email.value;
                var k = x.length;
                if (x <= 0)
                {
                    alert("Email must be fill full");
                    return false;
                }

                return true;



            }
            function checkF()
            {
                var x = document.all.FirstName.value;
                var k = x.length;
                if (x <= 0)
                {
                    alert("FirstName must be fill full");
                    return false;
                }

                return true;



            }
            function checkL()
            {
                var x = document.all.LastName.value;
                var k = x.length;
                if (x <= 0)
                {
                    alert("LastName must be fill full");
                    return false;
                }

                return true;



            }
            function checkW()
            {
                var x = document.all.Website.value;
                var k = x.length;
                if (x <= 0)
                {
                    alert("Website must be fill full");
                    return false;
                }

                return true;



            }
            function checkP()
            {
                var x = document.all.Password.value;
                var k = x.length;
                if (x <= 0)
                {
                    alert("Password must be fill full");
                    return false;
                }

                return true;



            }
            function checkR()
            {
                var x = document.all.Role.value;
                var k = x.length;
                if (x <= 0)
                {
                    return false;
                }

                return true;



            }
            function checkEmail()
            {

                var m = document.all.Email.value;
                var a = m.indexOf("@");
                var l = m.length - 1;
                var d = m.lastIndexOf('.');
                var s = m.lastIndexOf(' ');
                if ((l <= 0) || (a < 1) || (d <= a + 1) || (s !== -1)) {
                    alert("Email must be right format");
                    return false;
                }
                return true;
            }

            function valid()
            {
                if (!checkU() || !checkF() || !checkL() || !checkW() || !checkP())
                {
                    alert('Form must be full fill');
                    return false;
                } else
                if
                        (!checkEmail())
                {
                    alert('Email not be right format');
                    return false;
                } else
                {
                    alert('Moi thu oke');
                    return true;}
            }




        </script>
    </head>
    <body>

        <form action="insert.jsp" > 
            <div border="0" class="content">
                <h1>Add new user</h1>
                <table>

                    <tr>
                        <td class="td1"> <b> User</b>
                        </td>
                        <td class="local">
                            <input type="text" name="UserName" onkeyup="return checkU(this)" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"> <b> Email</b>
                        </td>
                        <td class="local">
                            <input type="text" name="Email" onclick="return checkEmail(this)" />
                        </td>
                    </tr>

                    <tr>
                        <td class="td1"> <b> FirstName</b>
                        </td>
                        <td class="local">
                            <input type="text"  name="FirstName" onkeyup="return checkF(this)" />
                        </td>
                    </tr>


                    <tr>
                        <td class="td1"> <b> LastName</b>
                        </td>
                        <td class="local">
                            <input type="text"  name="LastName" onkeyup="return checkL(this)" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"> <b> Website</b>
                        </td>
                        <td class="local">
                            <input type="text"  name="Website" onkeyup="return checkW(this)" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"> <b> Password</b>
                        </td>
                        <td class="local">
                            <input type="text" placeholder="Show password" size="10px" onkeyup="return checkP(this)"  name="Password" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"><b>Sent User Notification</b>
                        </td>
                        <td class="local">
                            <input type="checkbox"><b>Send the user new email</b></input> 
                        </td>


                    </tr>

                    <tr>

                        <td class="td1"><b>Role </b></td>
                        <td class="local"> <select  name="Role">
                                <option value="Subscriber">Subscriber</option>
                                <option value="Administrator">Administrator</option>
                            </select>
                        </td>             
                    </tr>
                    <tr>
                        <td><input type="submit" class="button" value="Add new user"  /></td>
                    </tr>
                </table> 
        </form>

    </div>
</body>
</html>
