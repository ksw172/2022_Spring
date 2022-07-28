<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>

</script>
</head>
<body>
<h1>회원관리</h1>
<hr>
<form action="register.do">
	<!-- 회원정보 등록 폼 -->
	<input type="text" name="id">
	<input type="password" name="passwd">
	<input type="text" name="name">
	<input type="text" name="age">
	<input type="radio" name="gender" value="M"> 남
	<input type="radio" name="gender" value="F"> 여
	<input type="text" name="address">
	<button>추가</button>
</form>
<table>
<tr>
	<th>아이디</th>
	<th>암호</th>
	<th>이름</th>
	<th>나이</th>
	<th>성별</th>
	<th>주소</th>
	<th>비고</th>
</tr>
<c:forEach var="member" items="${requestScope.list }">
	<tr>
		<td>${member.id }</td>
		<td>${member.passwd }</td>
		<td>${member.name }</td>
		<td>${member.age }</td>
		<td>${member.gender }</td>
		<td>${member.address }</td>
		<td><a href="delete.do?id=${member.id }">삭제</a> / 
		<a href="updateView.do?id=${member.id }">수정</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>









