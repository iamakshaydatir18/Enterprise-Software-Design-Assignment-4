<%-- 
    Document   : user
    Created on : Oct 30, 2023, 12:42:48 AM
    Author     : akshaydatir
--%>

<%@page import="com.mycompany.hw4.part7.utility.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            User user1 = (User) request.getAttribute("user1");
            User user2 = (User) request.getAttribute("user2");
            
            int code1 = user1.hashCode();
            int code2 = user2.hashCode();
            
        %>
        Code is : <%= code1%> 
        <br>
        Message from First Object : ${user1.name}
        <br>
        Code is : <%= code2%>
        <br>
        Message from Second Object : ${user2.name}
    </body>
</html>
