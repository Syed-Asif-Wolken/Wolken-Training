package com.wolken.syedasif.jdbc.dao;
import com.wolken.syedasif.jdbc.dto.MarketDetailsDTO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class MarketDetailsDAOImpl implements MarketDetailsDAO{
	boolean result = false;
	Connection conn = null;
	PreparedStatement stmt = null;
	
	public boolean save(MarketDetailsDTO dto) {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "asif123@A");
			stmt = conn.prepareStatement("insert into market_details value (?,?,?,?)");
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getName());
			stmt.setString(3, dto.getLocation());
			stmt.setInt(4, dto.getNoOfShops());
			result = stmt.execute();
			if(result)
				result = false;
			else
				result = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}
	
	public void getByLocation(MarketDetailsDTO dto) {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "asif123@A");
			stmt = conn.prepareStatement("select * from market_details where location = ?");
			stmt.setString(1, dto.getLocation());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
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
	
	public void getAll() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "asif123@A");
			stmt = conn.prepareStatement("select * from market_details");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
		} catch (SQLException e) {
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
	
	public boolean updateById(MarketDetailsDTO dto) {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "asif123@A");
			stmt = conn.prepareStatement("update market_details set market_name = ?, location = ?, no_of_shops = ? where id = ?");
			stmt.setString(1, dto.getName());
			stmt.setString(2, dto.getLocation());
			stmt.setInt(3, dto.getNoOfShops());
			stmt.setInt(4, dto.getId());
			result = stmt.execute();
			if(result)
				result = false;
			else
				result = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}
	
	public boolean delete(MarketDetailsDTO dto) {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "asif123@A");
			stmt = conn.prepareStatement("delete from market_details where id = ?");
			stmt.setInt(1, dto.getId());
			result = stmt.execute();
			if(result)
				result = false;
			else
				result = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}
}
