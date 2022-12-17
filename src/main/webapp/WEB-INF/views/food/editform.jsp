<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 <%@page import="com.mycom.myapp.food.FoodDAO, com.mycom.myapp.food.FoodVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<h1>음식 내용 수정</h1>
<form:form modelAttribute="u" action="../editok" method="POST">
<form:hidden path="seq"/>
<table id="edit">
	<tr><td>이름:</td><td><form:input path="fname" /></td></tr>
	<tr><td>상세내용:</td><td><form:input path="detail" /></td></tr>
	<tr><td>종류:</td><td><form:input path="kind" /></td></tr>
	<tr><td>점수:</td><td><form:input path="fpoint" /></td></tr>
	<tr><td>가격:</td><td><form:input path="price" /></td></tr>
	<tr><td>평가:</td><td><form:input path="customer" /></td></tr>
	<tr><td>가게명:</td><td><form:input path="brand" /></td></tr>
<tr><td colspan="2"><input type="submit" value="수정하기"/>
<input type="button" value="취소하기" onclick="history.back()"/></td></tr>
</table>
</form:form>

</body>
</html>