package com.school.manage;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
	static Connection con;
	public static Connection createConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management","root", "tiger");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
