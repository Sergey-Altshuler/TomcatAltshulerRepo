<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 26.06.2021
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Java Quiz</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<a href="index.jsp" class="link"> go to start page</a>
<h1> Please, answer the questions </h1>
<br>
<h2 align="center"> Java quiz</h2>
<form action="resultTestServlet" method="POST" align="center">
    <h3 align="center">
    Вопрос 1. <br>
    Вставьте недостающее слово:  public static ... main <br>
    <input name="Java1" type="text" size="50px">
    <br>
    Вопрос 2.  <br>
    Вставьте недостающее слово: ...(int i=0; i<10; i++){}  <br>
    <input name="Java2" type="text" size="50px">
    <br>
    Вопрос 3.   <br>
    Какой оператор используется вместо if-else, если нужно сделать выбор из нескольких значений?  <br>
    <input name="Java3" type="text" size="50px">
    <br>
    Вопрос 4.  <br>
    Аннотация @... определяет интерфейс с одним методом.  <br>
    <input name="Java4" type="text" size="50px">
    <br>
    Вопрос 5.  <br>
    Аннотация @... определяет устаревший метод.  <br>
        <input name="Java5" type="text" size="50px">
    <br>

    <input type="submit" value="submit" size="150px"/>
    </h3>
</form>
</body>
</html>
