package com.admin.servlet;

import java.io.IOException;

import com.dao.DoctorDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AddDoctor")
public class AddDoctor extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String specialist = req.getParameter("specialist");

        DoctorDao dao = new DoctorDao(DBConnect.getConn());

        boolean check = dao.addDoctor(name, email, password, specialist);

        HttpSession session = req.getSession();
        if (check) {
            session.setAttribute("msg", "Doctor added successfully");
            resp.sendRedirect(req.getContextPath() + "/doctor/addDoctor.jsp");
        } else {
            session.setAttribute("msg", "Doctor already exists");
        }

       
    }
}
