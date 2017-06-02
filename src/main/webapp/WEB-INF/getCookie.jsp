<%--
  Created by IntelliJ IDEA.
  User: Draper_HXY
  Date: 2017/6/2
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++) {
        response.getWriter().print(cookies[i].getValue() + "欢迎你");
        System.out.println(cookies[i].getValue());

    }
%>
</body>
</html>
