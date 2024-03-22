package com.registrationapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registrationapp.model.DAOService;
import com.registrationapp.model.DAOServiceimpl;
@WebServlet("/registrationcontroller")
public class Registrationcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Registrationcontroller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		Object attribute = session.getAttribute("emailId");
		if(attribute!=null) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
		rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Object attribute = session.getAttribute("emailId");
		if(attribute!=null) {
			String name = request.getParameter("name");
			String city = request.getParameter("city");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			
			
			DAOService dao=new DAOServiceimpl();
			dao.connectDB();
			dao.saveRegistration(name,city,email,mobile);
			
			request.setAttribute("msg","REGISTRATION SUCESSFULL!!!");
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
			rd.include(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	
	}

}
