package bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.logging.Logger;

import vo.RegisterVO;
import dao.RegisterDAO;


public class RegisterBO {

	static Logger logger = Logger.getLogger(RegisterBO.class);
	
	RegisterDAO registerDAO = new RegisterDAO();
	List<RegisterVO> registerList = new ArrayList<RegisterVO>();
	RegisterVO registerVO;
	Statement stmt;
	Connection myConn=null;
	
	public RegisterVO addRegister(RegisterVO registerVO) {

		logger.info("In BO..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://192.168.35.70:3306/epettool_dev","epettool_dev", "epettool_dev");
			stmt = myConn.createStatement();
			//
			logger.info("flow to DAO..");
			
			registerDAO.addRegister(myConn,stmt,registerVO);

			logger.info("flow to DAO successfully..");
			logger.info("done BO successfully..");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{

			try {
				stmt.close();
				myConn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		logger.info("sending registerList..");
		return registerVO;
	}

}
