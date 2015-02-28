package com.mandrin.master.service;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.api.master.user.UserService;

/**
 * 
 * @author HasankaMac
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public void saveUser(UserDTO userDTO) {
		System.out.println(userDTO);
	}

}
