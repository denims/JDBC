package com.deni.test.Application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
	
	public static void main(String[] args) throws SQLException {
		final String userName = "test";
		final String password = "testpass";
		
		String sql = "select * from Allocation";
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Deni?useSSL=false",userName,password);
		Statement st = con.createStatement();
		
		ResultSet result = st.executeQuery(sql);
		
		while(result.next()){
			System.out.println(result.getString("comments"));
		}
		
		/*sql = "insert into Account values (?,?,?,?)";
		
		PreparedStatement st2=con.prepareStatement(sql);
		Date dt = new Date(20170202);
		st2.setInt(1, 4);
		st2.setString(2, "Axis");
		st2.setString(3, "Axis01");
		st2.setInt(4, 800000);
		
		
		int affectedRow = st2.executeUpdate();
		System.out.println(affectedRow + " affected rows");*/
			
	}

}
