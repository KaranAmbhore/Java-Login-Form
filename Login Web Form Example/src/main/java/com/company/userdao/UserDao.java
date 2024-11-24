package com.company.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.db.DBUtil;

public interface UserDao {

	public static  boolean isValidUser(String username, String password) {
		String query = "SELECT * FROM users WHERE username = ? and password = ?";
		try (Connection con = DBUtil.getConnection();
				PreparedStatement pstm = con.prepareStatement(query)) {

			pstm.setString(1, username);
			pstm.setString(2, password);

			ResultSet rs = pstm.executeQuery();

			System.out.println("Query run ho gyi..");
			return rs.next();

		} catch (SQLException e) {

			e.printStackTrace();
			return false;
		}

	}
	
	public static boolean registerUser(User user) {
			
		String query = "INSERT INTO users values (? ,? ,?)";
		
		try (Connection con = DBUtil.getConnection();
				PreparedStatement pstm = con.prepareStatement(query)) {

			pstm.setString(1, user.getUsername());
			pstm.setString(2, user.getEmail());
			pstm.setString(3, user.getPassword());
			

		int rows= pstm.executeUpdate();
		System.out.println("Registration success");
		return rows>0;
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
		
	}	
	}
	



