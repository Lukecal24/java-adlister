<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/17/23
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="/register" method="post">
    <label type="text">enter username</label>
    <input type="text" name="username">

    <label type="text">enter email</label>
    <input type="text" name="email">

    <label type="text">enter password</label>
    <input type="text" name="password">
    <button>submit</button>

</form>
</body>
</html>
