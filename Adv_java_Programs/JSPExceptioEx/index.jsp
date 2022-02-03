<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
Welcome to Jsp page
<%
 //response.sendRedirect("https://www.google.com");
 %>
<jsp:forward page="success.jsp"></jsp:forward>
</body>
</html>