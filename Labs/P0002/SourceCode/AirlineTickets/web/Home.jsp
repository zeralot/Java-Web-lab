<%-- 
    Document   : Home
    Created on : Sep 5, 2016, 2:10:17 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body  >
        <div class="bghome">
            <div class="btnfli">
                <button class="btnflight">Flight</button>
            </div>
            <form action="FlightController?service=search" method="post"> 
                <div class="fli">
                    <div class="fli1">
                        <input type="radio" name="trip" value="0" checked>  Roundtrip 
                        <input type="radio" name="trip" value="1"> One way
                        <table class="tblfli">

                            <tr><td>From  </td>
                                <td> <select name="from" width="500px">
                                        <option value="Ha Noi">Ha Noi</option>
                                        <option value="Da Nang">Da Nang</option>
                                        <option value="Ho Chi Minh">Ho Chi Minh</option>
                                        <option value="Hai Phong">Hai Phong</option>
                                    </select></td></tr>
                            <tr><td>To  </td>
                                <td> <select name="to" width="150px">
                                        <option value="Ha Noi">Ha Noi</option>
                                        <option value="Da Nang">Da Nang</option>
                                        <option value="Ho Chi Minh">Ho Chi Minh</option>
                                        <option value="Hai Phong">Hai Phong</option>
                                    </select></td></tr>
                            <tr><td>Depature </td>
                                <td><input type="date" name="depart">
                            </tr>
                            <tr><td>Return </td>
                                <td><input type="date" name="retur">
                            <br></tr>

                        </table>
                    </div>
                </div>
                <div class="fli2">
                    <button type="submit" class="btnfli2"><font color="white"><b>Search</b></font></button>
                </div>
            </form>

        </div>
    </body>
</html>
