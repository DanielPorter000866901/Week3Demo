<%-- 
    Document   : helloWorldForm
    Created on : 19-Sep-2022, 9:07:28 AM
    Author     : porte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="hello">
            First Name <input type="text" name="firstname" value="${firstname}"><br />
            Last Name <input type="text" name="lastname" value="${lastname}"><br />
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
