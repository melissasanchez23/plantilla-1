<%-- 
    Document   : FormJsp
    Created on : 30/10/2018, 10:53:43 AM
    Author     : alex_
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
          String nombre= request.getParameter("nombre");
          String apellido= request.getParameter("apellido");
          String email= request.getParameter("email");
          String contrasena= request.getParameter("contrasena");
          
          out.println("<h1>Nombre: "+nombre+"<br>Apellido: "+apellido+"<br>Correo: "+email+"<br>Contraseña: "+contrasena+"</h1>");
         %>
    </body>
</html>
