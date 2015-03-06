package com.mandrin.api.master.user;

import java.util.List;

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
	
	/**
	 * Search all users from DB.
	 * @return
	 * @throws MandrinException
	 */
	public List<UserDTO> searchAllUsers() throws MandrinException;
	
}
