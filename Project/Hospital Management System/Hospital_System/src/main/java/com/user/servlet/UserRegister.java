package com.user.servlet;

import java.io.IOException;
import java.sql.Connection;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "UserRegister", urlPatterns = { "/UserRegister" })
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 1️⃣ Get parameters from SignUp form
		String fullName = req.getParameter("fullname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		// 2️⃣ Create user object
		User user = new User(fullName, email, password);
		HttpSession session = req.getSession();
		// 3️⃣ Get database connection
		Connection conn = DBConnect.getConn();
		if (conn == null) {
			resp.sendRedirect("error.jsp");
			return;
		}

		UserDao dao = new UserDao(conn);

		// ✅ Check if user already exists
		if (dao.isUserExists(email)) {
			// If exists, redirect back with message
			session.setAttribute("msg", "User already exists");
			resp.sendRedirect("SignUp.jsp");
			return;
		}

		// 4️⃣ Insert user into database
		boolean success = dao.userRegister(user);

		// 5️⃣ Redirect based on success

		if (success) {
		    session.setAttribute("msg", "Registration successful");
		    resp.sendRedirect("UserLogin.jsp");
		} else {
		    session.setAttribute("msg", "Not Register Sucessfully");
		    resp.sendRedirect("SignUp.jsp");
		}
 
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Redirect GET requests to SignUp.jsp
		resp.sendRedirect("SignUp.jsp");
	}
}
