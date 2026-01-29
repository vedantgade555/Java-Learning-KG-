package com.doctor.servlet;

import java.io.IOException;

import com.dao.DoctorDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DoctorCountServlet")
public class DoctorCountServlet extends HttpServlet {
	

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        // 1. Create DAO object
        DoctorDao dao = new DoctorDao(DBConnect.getConn()); // Make sure conn is initialized inside DAO
        
        // 2. Call the method
        int totalDoctors = dao.doctorCount();
        
        // 3. Store in session or request
        HttpSession session = req.getSession();
        session.setAttribute("totalDoctors", totalDoctors);
        
        // 4. Redirect or forward to JSP
        resp.sendRedirect("/admin/index.jsp"); // or forward using RequestDispatcher
    }
}

