<!DOCTYPE html>
<html>
<head>
	<title>Employee Details</title>
</head>
<body>
	<h1 style="text-align:center; color:blue;">Sign Up Employee Details</h1>
	<form action="signup" method="post">
		<table align="center">
			<tr>
				<th>Associate Id</th>
				<td>	<input type="text" name="associateId" placeholder="Enter Id.." required>	</td>
			</tr>
			<tr>	
				<th>First Name</th>
				<td>	<input type="text" name="firstName" placeholder="Enter First Name.." required>	</td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td>	<input type="text" name="lastName" placeholder="Enter Last Name.." required>	</td>
			</tr>
			<tr>
				<th>Department</th>
				<td>	<input type="text" name="department" placeholder="Enter Department Name.." required>	</td>
			</tr>
			<tr>
				<th>Designation</th>
				<td>	<input type="text" name="designation" placeholder="Enter Designation.." required>	</td>
			</tr>
			<tr>
				<th>Date Of Birth</th>
				<td>	<input type="date" name="dob" placeholder="Enter DOB" required>	</td>
			</tr>
			<tr>
				<th>Username</th>
				<td>	<input type="text" name="username" placeholder="Enter UserName.." required>	</td>
			</tr>
			<tr>
				<th>Password</th>
				<td>	<input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="Enter Password" required>	
				</td>
			</tr>
			<tr>
				<th>Hobbies</th>
				<td>	<input type="checkbox" name="hobby1" value="travelling">Travelling	<br>
						<input type="checkbox" name="hobby2" value="swimming">Swimming	<br>
						<input type="checkbox" name="hobby3" value="cricket">Cricket	<br>
						<input type="checkbox" name="hobby4" value="books">Books	<br>
						<input type="checkbox" name="hobby5" value="others">Others	<br>
				</td>
				
			</tr>
			
			<tr>
				<th>Gender</th>
				<td>	<input type="radio" name="gender" value="male">Male	
						<br><input type="radio" name="gender" value="female">Female	
						
				</td>
			</tr>
			
			<tr>
				<th>Education</th>
				<td>	
						<select name="education">
						<option value="graduation">Graduation</option>
						<option value="postgraduation">Post Graduation</option>
						</select>
				</td>
			</tr>
			
			
			<tr>
				<th>Email</th>
				<td>	<input type="email" name="email" placeholder="Enter Email" required>	</td>
			</tr>
			
			<tr>
				<th>Age</th>
				<td>	<input type="number" name="age" min="21" placeholder="Enter Age" required >	</td>
			</tr>
			
			<tr>
				<th>Address</th>
				<td>	<textarea rows="4" cols="50" maxlength="250" >Address...</textarea></td>
			</tr>
			<tr>
			<th>City</th><td><input type="text" name="city" placeholder="Enter City" required></td>
			</tr>
			<tr>
			<th>State</th><td><input type="text" name="state" placeholder="Enter State" required></td>
			</tr>
			<tr>
			<th>Country</th><td><input type="text" name="country" placeholder="Enter Country" required></td>
			</tr>
			<tr>
			<th>Pincode</th><td><input type="text" pattern="[1-9]{1}[0-9]{5}" name="pincode" placeholder="Enter Pincode" required></td>
			</tr>
			<tr>
			<th>Resume</th>
			<td> <input type="file" name="resume"></td>
			</tr>
			<tr><td><input type="Submit" value="Submit"></td></tr>
		</table>
	</form>
</body>
</html>