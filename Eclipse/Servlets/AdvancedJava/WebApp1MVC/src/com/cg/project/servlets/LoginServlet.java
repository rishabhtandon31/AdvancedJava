package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginServlet() {
		super();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int associateId= Integer.parseInt(request.getParameter("associateId"));
		String password= request.getParameter("password");
		
		Associate associate= new Associate(associateId, password);
		RequestDispatcher dispatcher;
		if(associate.getAssociateId()==1111 && associate.getPassword().equals("rtrtrt")){
			dispatcher= request.getRequestDispatcher("loginSuccessPage.jsp");
			request.setAttribute("associate", associate);
			dispatcher.forward(request, response);
		}
		else{
			/*dispatcher= request.getRequestDispatcher("errorPage.jsp");*/
			dispatcher= request.getRequestDispatcher("loginPage.jsp");
			request.setAttribute("errorMessage", "associateId or password is wrong");
			dispatcher.forward(request, response);
		}
	}
	
	
}
