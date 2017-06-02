<%--
  Created by IntelliJ IDEA.
  User: Draper_HXY
  Date: 2017/6/2
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>
<center>
    <% int x = 3; %>
    <% int y = 5 + x;%>

    <%! int a = 42;%>
    <% int a = 22;%>
    <%
        System.out.println("x" + x);
        System.out.println("y" + y);
        System.out.println(a);
        System.out.println(this.a);
    %>
</center>
</body>
</html>
