<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% int a=12,b=3;
%>
<% if (a>b)
{
    %>
<font color="red"><h1>a is greater</h1></font>
<%
}
else{
    %>
<font color="red"><h1>b is greater</h1></font>
<%
}
%>
<%--using for loop--%>
<%
    for(int i=0;i<=5;i++)
    {
     %>
<font color="green" size="12">b is greater</font> <br>
<%
    }
%>
</body>
</html>