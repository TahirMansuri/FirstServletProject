<%--
  Created by IntelliJ IDEA.
  User: InfoGalaxy
  Date: 28-Mar-22
  Time: 10:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Hi <%= request.getAttribute("user") %>, Login Successful!</h3>
<a href="login.html">Login Again...</a>
</body>
</html>
