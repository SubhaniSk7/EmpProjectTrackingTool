package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.EmployerVO;

public class EmployerDAO {

	List<EmployerVO> employersList = new ArrayList<EmployerVO>();
	EmployerVO employerVO;
	
	public List<EmployerVO> getAllEmployers(){
		try{
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("database");
			Connection myConn=DriverManager.getConnection("jdbc:mysql://192.168.35.103:3315/trainee_dev","trainee_dev","trainee_dev");
			Statement stmt = myConn.createStatement();
			String query = "SELECT * FROM 184_employer;";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				employersList.add(new EmployerVO(rs.getInt("sno"),rs.getString("employerid"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("department"),
			 			 rs.getString("role"), rs.getString("designation"),rs.getDate("dateofbirth"),rs.getString("gender"),rs.getLong("mobileno"),
			 			 rs.getString("address"),rs.getString("bloodgroup"),rs.getString("emailid"),rs.getString("panno"),rs.getString("aadharno"),rs.getString("pfno"),
			 			 rs.getString("skills"),rs.getString("password")));
			}
			stmt.close();
			rs.close();
			myConn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return employersList;
	}
	
	public EmployerVO getEmployer(long id){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn=DriverManager.getConnection("jdbc:mysql://192.168.35.103:3315/trainee_dev","trainee_dev","trainee_dev");
			Statement stmt = myConn.createStatement();
			String query = "SELECT * FROM 184_StudentApp where Id="+id+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				employerVO = new EmployerVO(rs.getInt("sno"),rs.getString("employerid"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("department"),
			 			 rs.getString("role"), rs.getString("designation"),rs.getDate("dateofbirth"),rs.getString("gender"),rs.getLong("mobileno"),
			 			 rs.getString("address"),rs.getString("bloodgroup"),rs.getString("emailid"),rs.getString("panno"),rs.getString("aadharno"),rs.getString("pfno"),
			 			 rs.getString("skills"),rs.getString("password"));
			}
			rs.close();
			stmt.close();
			myConn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return employerVO;
	}
	
	public EmployerVO addEmployer(EmployerVO employer){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn=DriverManager.getConnection("jdbc:mysql://192.168.35.103:3315/trainee_dev","trainee_dev","trainee_dev");
			Statement stmt = myConn.createStatement();
			PreparedStatement pstmt=myConn.prepareStatement("INSERT INTO 184_StudentApp values(?,?,?,?,?,?);");
			pstmt.setString(1,employer.getEmployerId());
			pstmt.setString(2,employer.getFirstName());
			pstmt.setString(3,employer.getEmailId());
			pstmt.setString(4,employer.getDesignation());
			pstmt.setString(5,employer.getGender());
			pstmt.setString(6,employer.getPassword());
			pstmt.executeUpdate();
			myConn.commit();
			stmt.close();
			myConn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return employerVO;
	}
}
