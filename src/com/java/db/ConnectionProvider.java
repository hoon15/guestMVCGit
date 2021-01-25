package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider { // 데베 연결하는 부분 설정 
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
