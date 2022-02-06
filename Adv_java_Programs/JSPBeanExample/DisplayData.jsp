<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 04-02-2022
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Display Employee Information</title>
</head>
<body>
<h1 style="color: darkgreen">Employee Information</h1>
<jsp:useBean id="emp" class="com.example.jspjavabeanex.EmployeeBean"></jsp:useBean>
<%--* means it take all data values in getproperty--%>
<jsp:setProperty name="emp" property="*"></jsp:setProperty>

<font color="#20b2aa" ><h2>Welcome Employee:<jsp:getProperty property="empname" name="emp"></jsp:getProperty> </h2></font>

<jsp:getProperty property="empId" name="emp"></jsp:getProperty> <br>
<jsp:getProperty property="emailId" name="emp"></jsp:getProperty> <br>
<jsp:getProperty property="mobileNo" name="emp"></jsp:getProperty> <br>
<jsp:getProperty property="city" name="emp"></jsp:getProperty> <br>
<jsp:getProperty property="desg" name="emp"></jsp:getProperty> <br>
<jsp:getProperty property="dob" name="emp"></jsp:getProperty>  <br>

</body>
</html>
