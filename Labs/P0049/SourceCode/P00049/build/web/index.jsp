<%-- 
    Document   : index
    Created on : Sep 23, 2016, 12:43:32 PM
    Author     : Students
--%>

<%@page import="com.fpt.P0049.DAO.control"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cssP0049.css">
 
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <% Calendar theCal = Calendar.getInstance();
            int currYear = theCal.get(Calendar.YEAR);
            int currMonth = theCal.get(Calendar.MONTH);
            int currDay = theCal.get(Calendar.DATE);
            String currYearString = new Integer(currYear).toString();
            String currMonthString = new Integer(currMonth).toString();
            String newMonth = request.getParameter("month");
            String newYear = request.getParameter("year");

            if (newMonth != null) {
                currMonthString = newMonth;
            }
            if (newYear != null) {
                currYearString = newYear;
            }
            int Month = new Integer(currMonthString).intValue();
            int Year = new Integer(currYearString).intValue();
            String monthNames[] = {"Jan", "Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
            String monthName = monthNames[Month];
            int nextMonth = Month + 1;
            int nextYear = Year;
            int prevMonth = Month - 1;
            int prevYear = Year;
            if (prevMonth == -1) {
                prevMonth = 11;
                prevYear--;
            }
            if (nextMonth == 12) {
                nextMonth = 0;
                nextYear++;
            }

        %>
        <table>
            <tr> 
                <td>
                    <form method="POST">
                        <input type="submit" value="<<" name="prev"  class = "button" />
                        <input type="hidden" name="month" value="<%=prevMonth%>" />
                        <input type="hidden" name="year" value="<%=prevYear%>" />
                    </form>
                </td>
                <td></td>
                <td><b><%=monthName%></b></td>
                <td>
                    <form method="POST">
                        <input type="submit" value="==" name="curr" class = "button"/>
                        <input type="hidden" name="month" value="<%=currMonth%>" />
                        <input type="hidden" name="year" value="<%=currYear%>" />
                    </form>
                </td>
                <td><b><%= Year%></b></td>
                <td></td>
                <td>
                    <form method="POST">
                        <input type="submit" value=">>" name="curr"  class = "button" />
                        <input type="hidden" name="month" value="<%=nextMonth%>" />
                        <input type="hidden" name="year" value="<%=nextYear%>" />
                    </form>
                </td>
            
            </tr>
            <tr> 
                <th>Sun</th>
                <th>Mon</th>
                <th>Tue</th>
                <th>Wed</th>
                <th>Thu</th>
                <th>Fri</th>
                <th>Sat</th>
            </tr>
            <% control aMonth = control.getMonth(Integer.parseInt(currMonthString), Integer.parseInt(currYearString));
                int[][] days = aMonth.getDays();
                for (int i = 0; i < aMonth.getNumOfWeek(); i++) { %>
                <tr>
                    <% for (int j = 0; j<7; j++) { 
                    if (days[i][j]==0){ %>
                    <td class="empty">&nbsp;</td>
                <%   } else if(currDay == days[i][j] && currMonth==aMonth.getMonth() && currYear == aMonth.getYear()){ %>
                    <td class = "currday"> <%=days[i][j]%></td>
                    <% } else if(j == 0){ %>
                    <td class="sunday" >  <%=days[i][j]%></td>
                    <% } else { %> 
                    <td class = "normal"> <%=days[i][j]%></td>
                    <% } //end normal
} // end for j
%>
                </tr>
                <% } //end for i 
%>
                    

               


        </table>     
    </center>
    </body>
</html>
