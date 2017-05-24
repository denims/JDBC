package com.deni.test.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ApplicationJDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		final String userName = "root";
		final String password = "deni123$";
		final String url = "jdbc:mysql://localhost:3306/Deni?useSSL=false";
		Connection connection;
		
		String query = "select * from Account";
		//Class.forName("com.mysql.jdbc.Driver");
		
	   connection = DriverManager.getConnection(url, userName, password);

		Statement st = connection.createStatement();
		ResultSet resultSet = st.executeQuery(query);
		while(resultSet.next()){
			System.out.println(resultSet.getString("account_name"));
		}
		st.close();
		connection.close();

	}

}
