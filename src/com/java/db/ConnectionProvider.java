package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider { // ���� �����ϴ� �κ� ���� 
	private static Connection conn = null;
	
	public static Connection getConnection() { // Connection conn = ConnectionProvider.getConnection();
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "c##dog";
			String pass = "dog";
			conn = DriverManager.getConnection(url, id, pass);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
