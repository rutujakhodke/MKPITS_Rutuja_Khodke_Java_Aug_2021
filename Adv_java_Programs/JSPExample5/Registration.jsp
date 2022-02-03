<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 03-02-2022
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<form action="LoginProcess.jsp">
    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="uname"></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td>EmailId:</td>
            <td><input type="text" name="email"></td>
        </tr>

        <tr>
            <td>City:</td>
            <td><select name="city">
                <option>Nagpur</option>
                <option>Pune</option>
                <option>Mumbai</option>
                <option>Nashik</option>
            </select></td>
        </tr>

        <tr>
            <td>Address:</td>
            <td><input type="text" name="addr"></td>
        </tr>

        <tr>
            <td>Mobile No:</td>
            <td><input type="text" name="mobno"></td>
        </tr>

        <tr>
            <td>DOB:</td>
            <td><input type="date" name="dob"></td>
        </tr>

        <tr>
            <td><input type="submit"></td>
        </tr>


    </table>
</form>
</body>
</html>
