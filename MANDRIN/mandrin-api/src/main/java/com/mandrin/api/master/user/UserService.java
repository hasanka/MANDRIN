package com.mandrin.api.master.user;

import com.mandrin.api.exception.MandrinException;
import com.mandrin.api.master.dto.UserDTO;


/**
 * 
 * @author HasankaMac
 *
 */
public interface UserService {

	/**
	 * Insert new user or update existing user.
	 * @param userDTO
	 */
	public void saveUser(UserDTO userDTO) throws MandrinException;
	
}
