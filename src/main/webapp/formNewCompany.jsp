<%--
  Created by IntelliJ IDEA.
  User: rafae
  Date: 21/03/2023
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<core:url value="/newCompany" var="newCompany"/>


<!DOCTYPE html>
<html lang="en">
    <head>
    <title>Cadastro</title>
    </head>
    <body>
        <form action="${ newCompany }" method="post">
            <label for="name">Nome Da Empresa</label>
            <input type="text" name="name" id="name">
            <label for="date">Data Cadastro</label>
            <input type="date" name="date" id="date">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
