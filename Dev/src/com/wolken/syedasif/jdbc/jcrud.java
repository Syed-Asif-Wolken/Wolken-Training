package com.wolken.syedasif.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jcrud {
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "asif123@A");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from airport_details");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			stmt.execute("insert into airport_details value (6, 'airport_new', 'place_new', 7)");
			stmt.execute("update airport_details set airport_name = 'Indira Gandhi Airport', location = 'Delhi' where id = 3");
			stmt.execute("delete from airport_details where id = 2");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
