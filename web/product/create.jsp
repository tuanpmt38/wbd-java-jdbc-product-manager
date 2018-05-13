<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 5/11/18
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Insert new product</title>
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<body>
<h1>Insert new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Code: </td>
                <td><input type="text" name="code" id="code"></td>
            </tr>

            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>Category id: </td>
                <td><input type="text" name="category_id" id="category_id"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Insert Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>