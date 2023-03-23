<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 21/03/2023
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<core:url value="/newCompany" var="servletNewCompany"/>


<html>
    <head>
        <title>Cadastro</title>
        <link rel="stylesheet" type="text/css" href="styles.css">

    </head>
    <body>
        <form action="/manager_project_war/newCompany" method="post">
            <label for="name">Nome Da Empresa</label>
            <input type="text" name="name" id="name">
            <label for="date">Data Cadastro</label>
            <input type="date" name="date" id="date">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
