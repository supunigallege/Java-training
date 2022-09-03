<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Home Go</h1>

<% String name=request.getAttribute("username").toString(); %>

<h1>Hello <%= name%></h1>

</body>
</html>
>