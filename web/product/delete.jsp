<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 5/13/18
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>ID: </td>
                <td>${product.getId()}</td>
            </tr>
            <tr>
                <td>Code: </td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${product.getCode()}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td>Category_id: </td>
                <td>${product.getCategory_id()}</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="delete Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
