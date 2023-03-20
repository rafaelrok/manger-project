<%@ page import="java.util.List" %>
<%@ page import="br.com.rafaelvieira.managerproject.model.Company" %>

<%--- No IDEA IntelliJ  a lib jstl que contem no projeto deve ser importado na lib global pela estrutura do projeto---%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 20/03/2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Empresas</title>
</head>
    <body>
        Lista de Empresas <br />
        <ul>
            <core:forEach items="${companies}" var="company">
                <li>${company.name}</li>
            </core:forEach>
        </ul>
    </body>
</html>
