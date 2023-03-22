<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 20/03/2023
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<html>
<head>
    <title>Cadastro</title>
</head>
    <body>
            <core:if test="${not empty company}">
                Empresa ${ company } cadastrada com sucesso!
            </core:if>
            <core:if test="${empty company}">
                Nenhuma empresa cadastrada!
            </core:if>
    </body>
</html>
