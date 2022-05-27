<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cc.shinbi.shindan.model.Shindan"%>
<%@ page import="cc.shinbi.shindan.model.Question"%>
<%@ page import="cc.shinbi.shindan.model.Item"%>

<%
String message = (String) request.getAttribute("message");
Shindan shindan = (Shindan) request.getAttribute("shindan");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クイズわくわく</title>
<link rel="stylesheet" type="text/css"

	href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class=wakuwaku>
	<h1>~ クイズわくわく ~</h1>

	<%
	if (message != null) {
	%>
	<div id="error"><%=message%></div>
	<%
	}
	%>

	<form method="post" action="${pageContext.request.contextPath}/area1">
		<h3>あなたのお名前は?</h3>
		<input id="buttons" type="text" name="name">
		<div id="faa">
			<input id="botan" type="submit" value="クイズに挑戦する">
		</div>
		</form>
		
		<img class="neko" src="cat_nekoko.png" alt="neko" title="neko1">
		<img class="neko1" src="cat_tomomo.png" alt="neko2" title="neko2">
		<div class=box16>
		<p>クイズわくわくへようこそ！</p>
		<p> 全てのステージクリアを目指して頑張ろう！</p>
		</div>
</div>
</body>
</html>