<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 20/03/2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="br.com.rafaelvieira.managerproject.model.Company" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<html>
    <head>
        <meta charset="UTF-8">
        <title>Lista Empresas</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>
        <core:if test="${not empty company}">
            Empresa ${ company } cadastrada com sucesso!
        </core:if>

        Lista de Empresas <br />
        <ul>
            <core:forEach items="${companies}" var="company">
                <li>
                        ${company.name} - <fmt:formatDate value="${company.initialDate}" pattern="dd/MM/yyyy" />
                        <a href="/manager_project_war/updateCompany?id=${company.id}">Editar</a>
                        <a href="/manager_project_war/deleteCompany?id=${company.id}">Excluir</a>
                </li>
            </core:forEach>
        </ul>
    </body>
</html>
