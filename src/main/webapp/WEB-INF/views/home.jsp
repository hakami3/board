<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<input type="button" id="btn1" onclick="btn1_click();" value="리스트로 이동" /> 
<P>  The time on the server is ${serverTime}. </P>
<script>
	function btn1_click() {
		location.href = "./board/list";
	}
</script>
</body>
</html>
