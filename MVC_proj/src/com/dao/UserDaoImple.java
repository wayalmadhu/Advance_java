package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conn.MyConn;
import com.dto.User;

public class UserDaoImple implements UserDao {
	
	
	private MyConn myConn;
	
	

	public UserDaoImple() {
		myConn = new MyConn();
	}

	@Override
	public int insertUser(User user) {
		int i =0;
		try {
		Connection con = myConn.getconn();
		PreparedStatement s = con.prepareStatement("insert into user1(full_name ,user_name, user_pass) values(?,?,?)");
		s.setString(1,user.getFullName());
		s.setString(2,user.getUserName());
		s.setString(3,user.getUserpass());
		
		i = s.executeUpdate();
		s.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean login(User user) {
		boolean flag = false;
		try {
		Connection con = myConn.getconn();
		PreparedStatement s = con.prepareStatement(
				"select * from user1 where user_name = ? and user_pass = ?");
		
		s.setString(1,user.getUserName());
		s.setString(2,user.getUserpass());
		ResultSet rs = s.executeQuery();
		
		if(rs.next()) {
			
			flag = true;
		}
		
		s.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
