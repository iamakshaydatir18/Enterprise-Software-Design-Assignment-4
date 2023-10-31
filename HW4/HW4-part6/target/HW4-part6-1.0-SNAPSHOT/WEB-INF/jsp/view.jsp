<%-- 
    Document   : view
    Created on : Oct 29, 2023, 10:50:32 PM
    Author     : akshaydatir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ExcelServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"/HW4/shop.htm\" method=\"POST\">");
            String[] comp = (String[]) session.getAttribute("comp");
            String[] music = (String[]) session.getAttribute("music");
            String[] book = (String[]) session.getAttribute("book");

            out.println("<h1>Cart Items!!!!</h1>");
            out.println("<br>");
            for (String a : comp) {
                out.println(a.toString());
                out.println("<br>");
            }
            for (String a : music) {
                out.println(a.toString());
                out.println("<br>");
            }
            for (String a : book) {
                out.println(a.toString());
                out.println("<br>");
            }
            out.println("<br>");
            out.println("<input type=\"hidden\" name=\"param\" value=\"\">");
            out.println("<input type=\"hidden\" name=\"input\" value=\"login\">");
            out.println("<input type=\"hidden\" name=\"username\" value=\"admin\">");
            out.println("<input type=\"hidden\" name=\"password\" value=\"admin\">");
            out.println(" <button type=\"Submit\">Shop Again</button>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        %>
    </body>
</html>
