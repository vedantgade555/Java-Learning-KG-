package com.user.servlet;

import java.io.IOException;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Login servlet called");

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();

		try {
			UserDao dao = new UserDao(DBConnect.getConn());
			User user = dao.login(email, password);

			if (user != null) {
				session.setAttribute("userObj", user);
				resp.sendRedirect(req.getContextPath() + "/userIndex.jsp");
			} else {
				session.setAttribute("msg", "Invalid Email or Password");
				resp.sendRedirect(req.getContextPath() + "/UserLogin.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
