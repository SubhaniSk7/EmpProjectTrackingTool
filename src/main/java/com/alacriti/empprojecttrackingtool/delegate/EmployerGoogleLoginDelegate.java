package com.alacriti.empprojecttrackingtool.delegate;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

import org.jboss.resteasy.logging.Logger;

import com.alacriti.empprojecttrackingtool.bo.EmployerGoogleLoginBO;
import com.alacriti.empprojecttrackingtool.vo.ProjectAssignmentVO;
import com.alacriti.empprojecttrackingtool.vo.RegisterVO;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public class EmployerGoogleLoginDelegate {

	static Logger logger = Logger.getLogger(EmployerGoogleLoginDelegate.class);

	EmployerGoogleLoginBO employerGoogleLoginBO = new EmployerGoogleLoginBO();
	ProjectAssignmentVO projectAssignmentVO = new ProjectAssignmentVO();
	
	RegisterVO registerVO;

	public RegisterVO empGoogleLogin(String tokenId) throws GeneralSecurityException, IOException {

		HttpTransport transport = GoogleNetHttpTransport.newTrustedTransport();
		JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();
		
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
												.setAudience(Arrays.asList("785033293568-794t5nnjqgp7lutnalpulifrhc0ciftd.apps.googleusercontent.com"))
												.setIssuer("accounts.google.com").build();


		GoogleIdToken idToken = verifier.verify(tokenId);
		if (idToken != null) {
			Payload payload = idToken.getPayload();

			String userId = payload.getSubject();
			System.out.println("User ID: " + userId);

			String email = payload.getEmail();
//			String firstName = (String) payload.get("name");
			String firstName = (String) payload.get("family_name");
			String lastName = (String) payload.get("given_name");
			
			logger.info(email+"\n"+firstName+"\n"+lastName);
			
			registerVO=new RegisterVO(firstName,lastName,email);
			
			employerGoogleLoginBO.empGoogleLogin(registerVO);
			
		} else {
			logger.info("Invalid ID token.");
		}
		return registerVO;
	}
}
