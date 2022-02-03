<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 03-02-2022
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginProcess Page</title>
</head>
<body>
<%
String name = request.getParameter("uname");
String password=request.getParameter("password");
String emailId = request.getParameter("email");
String city=request.getParameter("city");
String address = request.getParameter("addr");
String mobileNo=request.getParameter("mobno");
String dob = request.getParameter("dob");




%>
<%
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
//out.println("Successfully Database Connected");
Statement stmt=con.createStatement();
String query=("insert into reguser values ('"+name+"','"+password+"','"+emailId+"','"+city+"','"+address+"','"+mobileNo+"','"+dob+"')");
stmt.executeUpdate(query);
//out.println("Record inserted Successfully");
}catch(Exception ee){
out.println(ee);
}
%>
<font color="#dc143c" size="4">Your Account created Successfully..Please Login!</font>
<a href="Login.jsp">Login</a>
</body>
</html>
