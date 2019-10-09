<%--
    Document   : Usuario
    Created on : 09/10/2019, 16:08:15
    Author     : Desenvolvimento
--%>

<%@page import="modelos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
      <link rel="stylesheet" href="css/bootstrap.min.css">
   </head>
   <body>
      <%
 boolean logado = false;
 if(session != null &&
    session.getAttribute("logado") !=null ){
    logado = (boolean) session.getAttribute ("logado");
 }

if (!logado) {
   %>
   <jsp:forward page="login.jsp"/>
<%
}
%>

      <h1>Lista de Usuario do Sistema</h1>
        <table class="table table-striped">

           <thead>
              <tr>
                 <th>#</th>
                 <th>Usuario</th>
                  <th>Email</th>
                 <th>Senha</th>
              </tr>

           </thead>

           <tbody>

        <%
            for(int i=0; i<Usuario.getLista().size(); i++){

                Usuario p =Usuario.getLista().get(i);
                out.println("<tr>");
                out.println("<td>"+ (i+1) +"</td>");
                out.println("<td>"+ p.getNome() +"</td>");
                out.println("<td> "+ p.getEmail() +" </td>");
                out.println("<td> "+ p.getSenha() +" </td>");
                out.println("</tr");

            }

        %>
           </tbody>
        </table>

      <h3>...</h3>
   </body>
</html>
