package com.admin.servlet;


import java.io.IOException;
import java.util.List;

import com.dao.DoctorDao;
import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.Doctor;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewUserServlet")
public class ViewUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        UserDao dao = new UserDao(DBConnect.getConn());
        List<User> list = dao.getAllUsers();

        req.setAttribute("userList", list);
        req.getRequestDispatcher("/admin/ViewUser.jsp").forward(req, resp);
    }
}
