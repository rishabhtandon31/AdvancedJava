<%@page import="com.cg.project.beans.Associate"%>
<html>
<head>
<title>Login Success page</title>
</head>
<body>

	<div align="center">
		<%
			Associate associate = (Associate) request.getAttribute("associate");
		%>
		<%-- <h1>
			<font color="green">
				<%
					out.print("Congratulations!!! Associate Id :" + associate.getAssociateId()
							+ " successfully logged in.");
				%>
			</font>
		</h1> --%>

		<%-- <h1><font color="green">Congratulations!!! Associate Id : <%=associate.getAssociateId() %> successfully logged in.</font></h1>
 --%>

		<h1>
			<font color="green">Welcome
				${requestScope.associate.associateId}</font>
		</h1>

	</div>
</body>
</html>