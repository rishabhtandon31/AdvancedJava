package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "signup", urlPatterns = { "/signup" })
public class SignUpPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SignUpPage() {
		super();
	}
	public void init(ServletConfig config) throws ServletException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.print("<!DOCTYPE html><html><head><title>Employee Details</title></head><body><h1 style='text-align:center; color:blue;'>Sign Up Employee Details</h1>"
				+ "<form action='signup' method='post'><table align='center'><tr><th>Associate Id</th><td>	<input type='text' name='associateId' placeholder='Enter Id..' required>	</td>	</tr><tr><th>First Name</th><td><input type='text' name='firstName' placeholder='Enter First Name..' required></td></tr>	<tr><th>Last Name</th><td>	<input type='text' name='lastName' placeholder='Enter Last Name..' required></td></tr>	<tr><th>Department</th><td><input type='text' name='department' placeholder='Enter Department Name..' required>	</td>	</tr>	<tr><th>Designation</th><td><input type='text' name='designation' placeholder='Enter Designation..' required>	</td>	</tr>"
				+ "<tr><th>Date Of Birth</th><td>	<input type='date' name='dob' placeholder='Enter DOB' required></td></tr><tr><th>Username</th><td><input type='text' name='username' placeholder='Enter UserName..' required>	</td>	</tr><tr>	<th>Password</th><td>	<input type='password' name='password' pattern='(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}' title='Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters' placeholder='Enter Password' required>	</td></tr>		<tr>"
				+ "<th>Hobbies</th><td>	<input type='checkbox' name='hobbies' value='travelling'>Travelling	<br>	<input type='checkbox' name='hobbies' value='swimming'>Swimming	<br>	<input type='checkbox' name='hobbies' value='cricket'>Cricket	<br>	<input type='checkbox' name='hobbies' value='books'>Books	<br>	<input type='checkbox' name='hobbies' value='others'>Others	<br></td></tr><tr><th>Gender</th> <td>	<input type='radio' name='gender' value='male'>Male <br><input type='radio' name='gender' value='female'>Female	</td></tr>"
				+"<tr><th>Education</th><td><select name='education'><option value='graduation'>Graduation</option>	<option value='postgraduation'>Post Graduation</option>	</select>	</td>	</tr>	<tr><th>Email</th><td>	<input type='email' name='email' placeholder='Enter Email' required>	</td>	</tr>	<tr><th>Age</th><td>	<input type='number' name='age' min='21' placeholder='Enter Age' required >	</td></tr>	<tr><th>Address</th><td>	<textarea name='address' rows='4' cols='50' maxlength='250' >Address...</textarea></td></tr><tr>	<th>City</th><td><input type='text' name='city' placeholder='Enter City' required></td>	</tr><tr><th>State</th><td><input type='text' name='state' placeholder='Enter State' required></td>	</tr><tr>"
				+"<th>Country</th><td><input type='text' name='country' placeholder='Enter Country' required></td></tr><tr><th>Pincode</th><td><input type='text' pattern='[1-9]{1}[0-9]{5}' name='pincode' placeholder='Enter Pincode' required></td></tr><tr><th>Resume</th><td> <input type='file' name='resume'></td>	</tr>	<tr><td><input type='Submit' value='Submit'></td></tr>"
				+"</table></form></body></html>");

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String associateId= request.getParameter("associateId");
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		String department= request.getParameter("department");
		String designation= request.getParameter("designation");
		String dob= request.getParameter("dob");
		SimpleDateFormat simpledateFormat= new SimpleDateFormat(dob);
		String date=simpledateFormat.format(new Date());
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		String [] hobbies= request.getParameterValues("hobbies");
		String gender= request.getParameter("gender");
		String education= request.getParameter("education");
		String email= request.getParameter("email");
		String age= request.getParameter("age");
		String address= request.getParameter("address");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String country= request.getParameter("country");
		String pincode= request.getParameter("pincode");
		PrintWriter out= response.getWriter();
		out.print("<html><head></head><body><div align='center'><h1>Your Entered Details</h1>");
		out.print("<table> <tr><td>associateId: </td><td>"+associateId+"</td></tr>");
		out.print("<tr><td>firstName: </td><td>"+firstName+"</td></tr>");
		out.print("<tr><td>lastName: </td><td>"+lastName+"</td></tr>");
		out.print("<tr><td>department: </td><td>"+department+"</td></tr>");
		out.print("<tr><td>designation: </td><td>"+designation+"</td></tr>");
		out.print("<tr><td>dob: </td><td>"+date+"</td></tr>");
		out.print("<tr><td>username: </td><td>"+username+"</td></tr>");
		out.print("<tr><td>password: </td><td>"+password+"</td></tr>");
		out.print("<tr><td>hobbies: </td><td>");
		for(String x: hobbies){
			out.println(x +" "); }
		out.print("</td></tr>");
		out.print("<tr><td>gender: </td><td>"+gender+"</td></tr>");
		out.print("<tr><td>education: </td><td>"+education+"</td></tr>");
		out.print("<tr><td>email: </td><td>"+email+"</td></tr>");
		out.print("<tr><td>age: </td><td>"+age+"</td></tr>");
		out.print("<tr><td>address: </td><td>"+address+"</td></tr>");
		out.print("<tr><td>city: </td><td>"+city+"</td></tr>");
		out.print("<tr><td>state: </td><td>"+state+"</td></tr>");
		out.print("<tr><td>country: </td><td>"+country+"</td></tr>");
		out.print("<tr><td>pincode: </td><td>"+pincode+"</td></tr>");
		out.print("</table>"
				+ "<div align='center'><a href='login'><input type='button' value='Login Into Account'></a></div>"
				+ "</div><body></html>");
	}



}
