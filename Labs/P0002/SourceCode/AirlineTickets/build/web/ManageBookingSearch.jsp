<%-- 
    Document   : ManageBooking
    Created on : Sep 5, 2016, 2:10:36 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div align="center">
            <font color="orange"><h1>Search Bookings</h1></font>
            <form action="BookingController?service=search" method="post">
            <div style='margin-left: -25%'>
                <input type='radio' name='typeBooking' value='0' checked>Reservation code
                <input type='radio' name='typeBooking' value='1'>All Bookings
            </div>
            <div align='left' style='margin-left: 15%'>
                <table style='margin-top:20px'>
                    <tr>
                        <td>Enter reservation code 
                        <td><input type='text' name='reservationCode' style='width:300px'>
                    </trnh>
                    <tr>
                        <td>
                        <td> <button class="mbs1" type="submit"><font color="white"><b>Search</b></font></button>
                    </tr>
                </table>
                
            </div>
            </form>
        </div>
    </body>
</html>
