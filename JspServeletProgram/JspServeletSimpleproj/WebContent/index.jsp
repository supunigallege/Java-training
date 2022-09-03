<%@ page import="controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%
if(application.getAttribute("db")==null){

    DB db=new DB();
    application.setAttribute("db",db);
}

%>

<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Welcome User!" %>
</h1>
<br/>


   <form method="post" action="SignIn">

       <span>Email</span>
       <input type="text" name="email" placeholder="Email"/>
       <br/>
       <span>User Name</span>
       <input type="text" name="uname" placeholder="Username" />
       <br/>
        <span>Password</span>
       <input type="password" name="password" placeholder="Password" />
       <br/>
       <input type="submit" value="SignIn"/>




   </form>



</body>
</html>