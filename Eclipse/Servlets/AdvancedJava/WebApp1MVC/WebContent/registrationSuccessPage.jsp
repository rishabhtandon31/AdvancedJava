<%@page import="com.cg.project.beans.Associate"%>
<%@taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Registration Success page</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<td>AssociateId</td>
				<td>${requestScope.associate.associateId }</td>
			</tr>
			<tr>
				<td>FirstName</td>
				<td>${requestScope.associate.firstName }</td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td>
					<%-- <e:forEach var="hobby"
							items="${requestScope.associate.hobbies}">
			hobby
		</e:forEach>  --%>
					<e:forEach var="hobby" items="${requestScope.associate.hobbies}">
						<td><e:out value="${hobby}" /></td>
					</e:forEach>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>