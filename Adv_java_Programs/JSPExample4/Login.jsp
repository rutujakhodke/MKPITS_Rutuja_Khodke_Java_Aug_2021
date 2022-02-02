<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
Welcome to JSP <br>
<%
    String name = request.getParameter("uname");
    String password = request.getParameter("pass");

    out.println(name);
    out.println(password);
%>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
    %>
<font color="green" size="5">Successfully Database Connected</font> <br>

<%
    //out.println("Successfully Database Connected");
Statement stmt=con.createStatement();
String query=("insert into logint values ('"+name+"','"+password+"')");
stmt.executeUpdate(query);
%>
<font color="red" size="5">Record inserted successfully</font>

<%
        //out.println("Record inserted Successfully");
}catch(Exception ee){
out.println(ee);
}
%>

</body>
</html>