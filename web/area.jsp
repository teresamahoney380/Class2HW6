<%-- 
    Document   : area
    Created on : Jan 29, 2014, 6:36:13 PM
    Author     : Teresa Mahoney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1>Rectangle Area</h1>
        <p>
            The Area is: <br>
            <% out.print(request.getAttribute("textArea"));
            %>
        </p>
    </body>
</html>