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

@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("userObj");

        UserDao dao = new UserDao(DBConnect.getConn());

        if (!newPassword.equals(confirmPassword)) {
            session.setAttribute("msg", "New password and confirm password do not match");
            response.sendRedirect("ChangePassword.jsp");
            return;
        }

        boolean check = dao.checkOldPassword(user.getId(), oldPassword);

        if (check) {
            boolean updated = dao.updatePassword(user.getId(), newPassword);
            if (updated) {
                session.setAttribute("msg", "Password updated successfully");
            } else {
                session.setAttribute("msg", "Something went wrong");
            }
        } else {
            session.setAttribute("msg", "Old password is incorrect");
        }

        response.sendRedirect("ChangePassword.jsp");
    }
}

