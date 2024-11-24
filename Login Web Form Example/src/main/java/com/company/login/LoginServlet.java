package com.company.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.company.userdao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		if(UserDao.isValidUser(username,password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("welcome.jsp");
		
		
		}else {
			response.sendRedirect("login.jsp?error=1");
			System.out.println("Error aa gya");
		
	}
	}
}
