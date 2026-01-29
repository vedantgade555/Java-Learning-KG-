package com.admin.servlet;

import java.io.IOException;
import java.util.List;

import com.dao.DoctorDao;
import com.db.DBConnect;
import com.entity.Doctor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewDoctorServlet")
public class ViewDoctor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        DoctorDao dao = new DoctorDao(DBConnect.getConn());
        List<Doctor> list = dao.getAllDoctors();

        req.setAttribute("doctorList", list);
        req.getRequestDispatcher("/admin/ViewDoctor.jsp").forward(req, resp);
    }
}
