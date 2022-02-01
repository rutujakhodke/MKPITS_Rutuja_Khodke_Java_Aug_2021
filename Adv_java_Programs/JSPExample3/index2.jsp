<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%--using for loop--%>
<%
   String[] Colors={"green","blue","orange","pink","red","violet","black","yellow","lightblue","grey"};

%>
<%
    for(int i=0;i<10;i++)
    {
  %>
<font color="<%=""+Colors[i]%>" size="12"><%=""+i%></font> <br>
   <%
       }
%>

</body>
</html>