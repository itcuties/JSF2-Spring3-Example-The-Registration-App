package com.itcuties.registration.bo.impl;

import org.springframework.stereotype.Service;

import com.itcuties.registration.bo.RegistrationBo;

/**
 * Registration Business Object implementation. 
 * @author itcuties
 *
 */
@Service
public class RegistrationBoImpl implements RegistrationBo {

	public void registerUser(String firstname, String lastname, String email) {
		// Output some info
		System.out.println("RegistrationBoImpl:: Registering user " + firstname + " " + lastname + ", with email " + email);
		
		// TODO: Contact your database here
		// ...
	}
	
}
