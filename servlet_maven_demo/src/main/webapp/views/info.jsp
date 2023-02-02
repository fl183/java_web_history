<%--
  Created by IntelliJ IDEA.
  User: yuancongzhou
  Date: 2020/9/16
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<%
    String infoToShow = (String) (request.getAttribute("mess"));
    out.println(infoToShow);
%>

</body>
</html>
