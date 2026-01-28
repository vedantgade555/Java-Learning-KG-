package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {
		this.conn = conn;
	}

	public boolean userRegister(User u) {
		boolean f = false;

		try {
			String sql = "INSERT INTO user_details(full_name, email, password) VALUES (?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmai());
			ps.setString(3, u.getPassword());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) { 
			e.printStackTrace();
		}

		return f;
	}

	public boolean isUserExists(String email) {
		boolean exists = false;
		try {
			String sql = "SELECT 1 FROM user_details WHERE email=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				exists = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exists;
	}

	public User login(String em, String psw) {
		User u = null;

		try {
			String sql = "SELECT * FROM user_details WHERE email=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, em);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setFullname(rs.getString(2));
				u.setEmai(rs.getString(3));
				u.setPassword(rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return u;
	}

}
