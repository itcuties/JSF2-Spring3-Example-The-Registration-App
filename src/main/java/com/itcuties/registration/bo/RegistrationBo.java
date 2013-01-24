package com.itcuties.registration.bo;

/**
 * Registration Business Object interface.
 * @author itcuties
 *
 */
public interface RegistrationBo {
	/**
	 * Register user method
	 * @param firstname
	 * @param lastname
	 * @param email
	 */
	public void registerUser(String firstname, String lastname, String email); 
}
