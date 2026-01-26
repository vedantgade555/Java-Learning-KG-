package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    // Connection constants for easy maintenance ⚙️
    private static final String URL = "jdbc:mysql://localhost:3306/hospital";
    private static final String USER = "root";
    private static final String PASS = "vedant@555";

    /**
     * Provides a fresh connection to the database.
     * Remember to close this connection after use! 💡
     */
    public static Connection getConn() {
        Connection conn = null;
        try {
            // 1. Load the MySQL JDBC Driver 🏎️
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Open the connection 🔌
            conn = DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException e) {
            System.err.println("Driver Error: Check if MySQL Connector JAR is in your build path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection Error: Check your URL, username, or password.");
            e.printStackTrace();
        }
        return conn;
    }
}