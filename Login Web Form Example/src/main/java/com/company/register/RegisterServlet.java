package com.company.register;

import java.io.IOException;

import com.company.userdao.User;
import com.company.userdao.UserDao;
import com.company.userdao.UserDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet 
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static UserDao userDao = new UserDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		
		User user = new User();
		
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		if(UserDao.registerUser(user)) {
			response.sendRedirect("login.jsp?registration=success");
		}else {
			response.sendRedirect("register.jsp?error=1");
		}
	}

}