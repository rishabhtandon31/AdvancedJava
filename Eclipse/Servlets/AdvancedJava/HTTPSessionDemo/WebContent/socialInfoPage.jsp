<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
	<div>
		<%
			HttpSession session1 = request.getSession(false);
			UserBean userbean = null;
			if (session1 == null)
				response.sendRedirect("personalInfoPage.jsp");
		%>
		<font size=10>Welcome ${sessionScope.userBean.firstName}</font>
		<form name="socialInfoFrm" action="SocialInfoServlet" method="post">
			<table>
				<tr>
					<td>Enter fruitName</td>
					<td><input type="text" name="fruitName" /></td>
				</tr>
				<tr>
					<td>Enter movieName</td>
					<td><input type="text" name="movieName" /></td>
				</tr>
				<tr>
					<td>Enter bookName</td>
					<td><input type="text" name="bookName" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>