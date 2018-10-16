<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body align="center">
	<h1>Login To your Account</h1>
	<form name='loginForm' action="login" method="post">
		<table align="center">
			<tr>
				<th>UserName</th>
				<td><input type="text" id="associateId" name="associateId"
					placeholder="associate Id or emailId"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password"
					placeholder="Enter Password" required></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Login"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
		<div><font color="red">
			${requestScope.errorMessage }
		</font></div>
	</form>
</body>
</html>