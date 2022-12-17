<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Page</title>
</head>
<body>

<h1>음식 내용 추가</h1>
<form action="addok" method="post">
<table id="edit">
<tr><td>이름:</td><td><input type="text" name="fname"/></td></tr>
<tr><td>상세내용:</td><td><textarea cols="50" rows="5" name="detail"></textarea></td></tr>
    <tr>
        <td>종류:</td>
        <td>
            <select id="kind" name="kind">
                <optgroup label="선택"></optgroup>
                <option value="한식">한식</option>
                <option value="일식">일식</option>
                <option value="양식">양식</option>
                <option value="중식">중식</option>
                <option value="기타">기타</option>
            </select>
        </td>
    </tr>
    <tr><td>점수:</td><td><input type="text" name="fpoint"/></td></tr>
    <tr>
        <td>가격:</td>
        <td>
            <select id="price" name="price">
                <optgroup label="선택"></optgroup>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>평가:</td>
        <td><input type="radio" name="customer" value="상"/>상
        <input type="radio" name="customer" value="중"/>중
        <input type="radio" name="customer" value="하"/>하</td>
    </tr>
    <tr><td>가게명:</td><td><input type="text" name="brand"/></td></tr>
    <tr><td></td><td></td><td></td><td><input type="button" value="취소하기" onclick="history.back()"/><input type="submit" value="추가하기"/></td></tr>
</table>
</form>

</body>
</html>