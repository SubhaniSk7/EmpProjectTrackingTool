package delegate;

import org.jboss.resteasy.logging.Logger;

import vo.RegisterVO;
import bo.RegisterBO;


public class RegisterDelegate {

	static Logger logger = Logger.getLogger(RegisterDelegate.class);
	
	RegisterBO registerBO = new RegisterBO();

	public RegisterVO addRegister(RegisterVO registerVO) {

		return registerBO.addRegister(registerVO);

	}
}
