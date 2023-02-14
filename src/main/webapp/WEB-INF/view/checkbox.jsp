<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>checkbox</title>
	</head>
	<body>
		<!-- checkbox -->
		취미
		<form action="${pageContext.request.contextPath}/checkbox" method="post">
			<input type="checkbox" name="hobby">야구
			<input type="checkbox" name="hobby">축구
			<input type="checkbox" name="hobby">클라이밍
			<button>등록</button>
		</form>
		<hr>
		
		별명
		<form action="${pageContext.request.contextPath}/inputName" method="post">
			nick 1 : <input type="text" name="nick">
			nick 2 :<input type="text" name="nick">
			<button>등록</button>
		</form>
		<hr>
		커맨드객체
		<form action="${pageContext.request.contextPath}/command" method="post">
			이름 : <input type="text" name="name">
			<br>
			취미 :
			<input type="checkbox" name="hobby">야구
			<input type="checkbox" name="hobby">축구
			<input type="checkbox" name="hobby">클라이밍
			<button>등록</button>
		</form>
	</body>
</html>