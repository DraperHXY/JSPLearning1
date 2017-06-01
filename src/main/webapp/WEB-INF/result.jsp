<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Draper_HXY
  Date: 2017/6/1
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>

<%
    List list = (List) request.getAttribute("languageList");
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
        response.getWriter().print(iterator.next() + "<br>");
    }
    response.getWriter().print(request.getAttribute("email"));
%>

</body>
</html>
