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
<a href="index.jsp"> go to start page</a>
<h1> Please, answer the questions </h1>
<br>
<h4> Java quiz</h4>
<form action="resultTestServlet" method="POST">
    Вопрос 1.
    Вставьте недостающее слово:  public static ... main
    <input name="Java1" type="text">
    <br>
    Вопрос 2.
    Вставьте недостающее слово: ...(int i=0; i<10; i++){}
    <input name="Java2" type="text">
    <br>
    Вопрос 3.
    Какой оператор используется вместо if-else, если нужно сделать выбор из нескольких значений?
    <input name="Java3" type="text">
    <br>
    Вопрос 4.
    Аннотация @... определяет интерфейс с одним методом.
    <input name="Java4" type="text">
    <br>
    Вопрос 5.
    Аннотация @... определяет устаревший метод.
    <input name="Java5" type="text">
    <br>

    <input type="submit" value="submit"/>

</form>
</body>
</html>
