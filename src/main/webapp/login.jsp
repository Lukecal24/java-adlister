<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/9/23
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
    This will normally go in servlets
--%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null && username.equals("admin") && password.equals("password")) {
        response.sendRedirect("profile.jsp");
    } else if (username != null || password != null) {
        out.println("<p style=\"color:red;\">Invalid username or password. Please try again.</p>");
    }
%>

<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%@ include file="/partials/navbar.jsp" %>
<%@ include file="/partials/head.jsp"%>
<h1>Login</h1>
<form method="post" action="login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>







