package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;
@WebServlet(name = "signup", urlPatterns = { "/signup" })
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public RegistrationServlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int associateId= Integer.parseInt(request.getParameter("associateId"));
		String firstName= request.getParameter("firstName");
		String lastName= request.getParameter("lastName");
		String department= request.getParameter("department");
		String designation= request.getParameter("designation");
		String dob= request.getParameter("dob");
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
		Associate associate= new Associate(associateId, password, firstName, lastName, department, designation, dob, username, gender, education, email, age, address, city, state, country, pincode, hobbies);
		RequestDispatcher dispatcher;
		dispatcher= request.getRequestDispatcher("registrationSuccessPage.jsp");
		request.setAttribute("associate", associate);
		dispatcher.forward(request, response);
	}
}




