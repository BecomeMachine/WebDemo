<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.println(basePath);
%>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=TF-8">-->
<meta http-equiv="Access-Control-Allow-Origin" content="*">
<title>FCS</title>
<script type="text/javascript" src="<%=basePath%>JS/dispatchTest.js"></script>
<script type="text/javascript" src="<%=basePath%>JS/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>JS/jquery.json-2.4.js"></script>
<script>
	$(document).ready(function() {
		startTestInterface();
		//startTestView();
	});
	$(window).keydown(function(e) {
		if (e.which == 69) {
			startTestInterface();
		}
	});
	$(window).keydown(function(e) {
		if (e.which == 70) {
			startTestView();
		}
	});
</script>
</head>
<body>
	Start execute dispatchTest.JS .
	<P>
	<div id="show">
		<b> return content:</b>
		<p>
	</div>
</body>
</html>