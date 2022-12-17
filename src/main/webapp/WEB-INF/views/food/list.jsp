<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false"%>
<%@page import="com.mycom.myapp.food.FoodDAO,com.mycom.myapp.food.FoodVO,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
	<title>음식 게시판</title>
	<input type="button" value="로그아웃" onclick="history.back()"/>
	<style>
		#list {
			font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
			border-collapse: collapse;
			width: 100%;
		}
		#list td, #list th {
			border: 1px solid #ddd;
			padding: 8px;
			text-align:center;
		}
		#list tr:nth-child(even){background-color: #f2f2f2;}
		#list tr:hover {background-color: #ddd;}
		#list th {
			padding-top: 12px;
			padding-bottom: 12px;
			text-align: center;
			background-color: #006bb3;
			color: white;
		}
	</style>
	<script>
		function delete_ok(id){
			var a = confirm("정말로 삭제하겠습니까?");
			if(a) location.href='deleteok/' + id;
		}
	</script>
</head>
<body>
<h1 align="center">좋아하는 음식 리스트</h1>
<table class = "table" >
	<thead class="table-info">
	<tr>
		<th>No</th>
		<th>이름</th>
		<th>상세내용</th>
		<th>종류</th>
		<th>점수</th>
		<th>가격</th>
		<th>평가</th>
		<th>가계명</th>
		<th><button class="btn btn-success" onclick="location.href='add'">추가</button></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${list}" var="u">

		<tr>
			<td>${u.seq}</td>
			<td>${u.fname}</td>
			<td>${u.detail}</td>
			<td>${u.kind}</td>
			<td>${u.fpoint}</td>
			<td>${u.price}</td>
			<td>${u.customer}</td>
			<td>${u.regdate}</td>
			<td><button class="btn btn-primary" onclick="location.href='editform/${u.seq}'">수정</button>
				<button class="btn btn-danger" onclick="location.href='javascript:delete_ok(${u.seq})'">삭제</button></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>