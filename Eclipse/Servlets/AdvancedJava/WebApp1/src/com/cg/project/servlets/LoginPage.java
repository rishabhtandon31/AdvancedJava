package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginPage() {
		super();
	}
	public void init(ServletConfig config) throws ServletException {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html><html><head><meta charset='ISO-8859-1'><title>Login Page</title></head>"+
				"<body align='center'><h1>Login To your Acount</h1><form name='loginForm' action='login' method='post'><table align='center'>"+
				"<tr><th>UserName</th>	<td><input type='text' id='username' name='username' placeholder='associate Id or emailId'></td></tr>"+
				"<tr><th>Password</th><td>	<input type='password' name='password' "+
				"placeholder='Enter Password' required>"+
				"</td></tr><tr><td><input type='Submit' value='Login'></td><td><input type='reset' value='Reset'></td></tr></table></form></body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String associateId= request.getParameter("username");
		String password= request.getParameter("password");
		PrintWriter out= response.getWriter();
		out.print("<html><body><div align='center'>");
		if(associateId.equals("12345") && password.equals("Rishabh123"))
			out.print("<font color='green'> Welcome Associate "+associateId+"</font>");

		else
			out.print("<font color='red'>AssociateId or password is Wrong</font>");
		out.println("</div></body></html>");
			
		
	}
	
	
}
