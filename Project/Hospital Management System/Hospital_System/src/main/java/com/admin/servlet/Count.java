package com.admin.servlet;

import java.io.IOException;

import com.dao.DoctorDao;
import com.dao.UserDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdminDashboard")
public class Count extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    	DoctorDao ddao = new DoctorDao(DBConnect.getConn());
        UserDao udao = new UserDao(DBConnect.getConn());

        int doctorCount = ddao.countDoctor();
        int userCount = udao.countUser();

        req.setAttribute("doctorCount", doctorCount);
        req.setAttribute("userCount", userCount);

        req.getRequestDispatcher("/admin/index.jsp")
           .forward(req, resp);
    }
}
