package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;

import jakarta.servlet.http.HttpSession;

public class DoctorDao {
    private Connection conn;

    public DoctorDao(Connection conn) {
        super();
        this.conn = conn;
    }

    public boolean addDoctor(String name, String email, String password, String specialist) {
        boolean f = false;
        try {
            String sql = "insert into doctor(name,email,password,specialist) values(?,?,?,?)";
            
            // This method is part of java.sql.Connection
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, specialist);

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public Doctor loginDoctor(String email, String password) {
        Doctor d = null;
        try {
            String sql = "select * from doctor where email=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                d = new Doctor();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
      
    
    public List<Doctor> getAllDoctors() {
        List<Doctor> list = new ArrayList<>();

        try {
            String sql = "select * from doctor";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Doctor d = new Doctor();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email"));
                d.setPassword(rs.getString("password"));
                d.setSpecialist(rs.getString("specialist"));
                d.setStatus(rs.getString("status"));

                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public int doctorCount() {
        int count = 0; // Initialize count
        try {
            String sql = "SELECT COUNT(id) FROM doctor";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) { // Move to the first (and only) row
                count = rs.getInt(1); // Get the first column value
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

}