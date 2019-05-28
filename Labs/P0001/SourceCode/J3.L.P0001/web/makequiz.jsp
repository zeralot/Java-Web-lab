<%-- 
    Document   : makequiz
    Created on : Sep 5, 2016, 3:15:22 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make Quiz Page</title>
    </head>
    <body>
        <form action="Controller?service=makequiz" method="POST">
            <table border="0">
                <tr>
                    <td>Question:</td>
                    <td>
                        <textarea name="question" rows="4" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Option 1:</td>
                    <td>
                        <textarea name="answer1" rows="2" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Option 2:</td>
                    <td>
                        <textarea name="answer2" rows="2" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Option 3:</td>
                    <td>
                        <textarea name="answer3" rows="2" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Option 4:</td>
                    <td>
                        <textarea name="answer4" rows="2" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Answer(s):</td>
                    <td>                        
                    <input type="checkbox" name="answerRight" value="1" />Option 1
                    <input type="checkbox" name="answerRight" value="2" />Option 2
                    <input type="checkbox" name="answerRight" value="3" />Option 3
                    <input type="checkbox" name="answerRight" value="4" />Option 4
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
