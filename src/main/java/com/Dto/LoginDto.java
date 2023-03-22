package com.Dto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Login;


public class LoginDto {

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root", "root");
		System.out.println("Mysql loaded successfully");
		return connection;
	}

	
	public boolean validate(Login login) throws ClassNotFoundException, SQLException {
		System.out.println("Checking Validation Start");
		boolean status = false;
		Connection connection = getConnection();
		String sql = "select * from login where uname = ? and password = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, login.getName());
		ps.setString(2, login.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		System.out.println("Checking Validation finish"+status);
		return status;
		
	}

}
