<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="listPersonne" type="java.util.List<com.example.exo_2.Personne>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file ="./bootStrapimport.html"%>
    <title>Titre</title>
</head>
<body>
<main>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">NOM</th>
            <th scope="col">Prénom</th>
            <th scope="col">Age</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i=0; i<listPersonne.size(); i++) { %>
        <tr>

            <td><%=listPersonne.get(i).getNom() %></td>
            <td><%=listPersonne.get(i).getPrenom() %></td>
            <td><%=listPersonne.get(i).getAge() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</main>
</body>
</html>
