<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 03-02-2022
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String uname=request.getParameter("uname");
    String password=request.getParameter("pass");
%>
<%
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
        out.println("Successfully Database Connected");
        PreparedStatement ps=con.prepareStatement("select * from reguser where uname=? and password=?");
        ps.setString(1,uname);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
           response.sendRedirect("LoginSuccess.jsp");

            //out.println("Successful");
        }else{
            response.sendRedirect("LoginFail.jsp");
            //out.println("Error");
        }
    }catch(Exception e){
        out.println(e);
    }
%>
</body>
</html>
