package com.alacriti.empprojecttrackingtool.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	Connection myConn=null;
	public Connection getConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myConn;
	}
}
