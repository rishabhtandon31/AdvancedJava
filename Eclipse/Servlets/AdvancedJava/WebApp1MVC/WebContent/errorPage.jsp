<html>
<head>
<title>Error Page Occurred</title>
</head>
<body>
	<%
		String errorMessage=(String)request.getAttribute("errorMessage");
	%>
	<div>
		<h1><font color="red"><%=errorMessage %></font></h1>
	</div>
</body>
</html>