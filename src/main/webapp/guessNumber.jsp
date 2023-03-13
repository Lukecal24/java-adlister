<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/13/23
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Guess the Number</title>
</head>
<body>
<h1>Guess a Number between 1 and 3</h1>
<form action="/guess" method="post">
    <label for="guess">Your guess:</label>
    <input type="number" name="guess" min="1" max="3">
    <button type="submit">Submit</button>
</form>
</body>
</html>

