<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 21/03/2023
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<core:url value="/updateCompany" var="servletUpdateCompany"/>


<html>
    <head>
        <title>Atualizar EMpresa</title>
        <link rel="stylesheet" type="text/css" href="styles.css">

    </head>
    <body>
        <form action="${servletUpdateCompany}" method="post">
            <label for="id">Código</label>
            <input type="hidden" disabled name="id" id="id" value="${company.id}">
            <label for="name">Nome Da Empresa</label>
            <input type="text" name="name" id="name" value="${company.name}">
            <label for="date">Data Cadastro</label>
            <input type="date" name="date" id="date" value="<fmt:formatDate value="${company.initialDate}" pattern="dd/MM/yyyy">
            <input type="submit" />
        </form>
    </body>
</html>
