<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="DisplayData.jsp">
    <table>
        <tr>
            <td>EmpId:</td>
            <td><input type="text" name="empId"></td>
        </tr>

        <tr>
            <td>Employee Name:</td>
            <td><input type="text" name="empname"></td>
        </tr>

        <tr>
            <td>Email ID:</td>
            <td><input type="text" name="emailId"></td>
        </tr>

        <tr>
            <td>Mobile Number:</td>
            <td><input type="text" name="mobileNo"></td>
        </tr>

        <tr>
            <td>City</td>
            <td>
                <select name="city">
                    <option>Nagpur</option>
                    <option>Pune</option>
                    <option>Nashik</option>
                    <option>Mumbai</option>
                    <option>Hyderabad</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>Designation:</td>
            <td>
                <select name="desg">
                    <option>President</option>
                    <option>Manager</option>
                    <option>Analyst</option>
                    <option>Clerk</option>
                    <option>SalesMan</option>
                </select>
            </td>
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