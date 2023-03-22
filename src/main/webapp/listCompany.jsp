<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 20/03/2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="br.com.rafaelvieira.managerproject.model.Company" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista Empresas</title>
</head>
    <body>
        Lista de Empresas <br />
        <ul>
            <core:forEach items="${companies}" var="company">
                <li>${company.name} - <fmt:formatDate value="${company.initialDate}" pattern="dd/MM/yyyy" /> </li>
            </core:forEach>
        </ul>
    </body>
</html>
