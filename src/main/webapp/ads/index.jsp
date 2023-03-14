<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/14/23
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of Ads</title>
</head>
<body>
<h1>List of Ads</h1>
    <ul>
        <c:forEach items="${ads}" var="ad">
            <li>
                <h2>${ad.title}</h2>
                <p>${ad.description}</p>
            </li>
        </c:forEach>
    </ul>
</body>
</html>


