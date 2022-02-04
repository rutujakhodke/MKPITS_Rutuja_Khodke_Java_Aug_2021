<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 04-02-2022
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--print the value--%>
<r:set var="num1" value="21" ></r:set>

<r:out value="${num1}"></r:out>

<%--if condition--%>
<r:if test="${num1>10}">
    <h1>Number is greater</h1>
</r:if>

<%--for each loop--%>
<r:forEach var="i" begin="1" end="10">
    <h1>JSTL Loop</h1>
</r:forEach>

<%--addition of 2 numbers--%>
<r:set var="num1" value="10" ></r:set>
<r:set var="num2" value="20" ></r:set>

<r:out value="${num1+num2}"></r:out>

<r:remove var="num2" ></r:remove>

<r:choose>
    <r:when test="${num1>20}">
        <h1>num1 greater than 20</h1>
    </r:when>

    <r:otherwise>
        <h1>num1 is not greater than 20</h1>
    </r:otherwise>
</r:choose>

<r:catch var="exobj">
    <%
        int a=5/0;
    %>
</r:catch>
<r:out value="${exobj}"></r:out>
</body>
</html>