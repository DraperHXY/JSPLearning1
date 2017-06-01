<%--
  Created by IntelliJ IDEA.
  User: Draper_HXY
  Date: 2017/6/1
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<center>
    <h1 align="center">欢迎来到语言乐园</h1>
    <form action="Hello.do" method="post">
        <h2 align="center">你最喜欢的语言是？</h2>
        <select name="language" size="1">
            <option value="C">C</option>
            <option value="C++">C++</option>
            <option value="Java">Java</option>
            <option value="Swift">Swift</option>
            <option value="Go">Go</option>
        </select>
        <input type="submit">
    </form>
</center>
</body>
</html>
