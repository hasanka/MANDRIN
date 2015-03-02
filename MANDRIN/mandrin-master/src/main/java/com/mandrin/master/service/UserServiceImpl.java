package com.mandrin.master.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mandrin.api.exception.MandrinException;
import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.api.master.user.UserService;
import com.mandrin.master.dao.UserDao;

/**
 * 
 * @author HasankaMac
 *
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void saveUser(UserDTO userDTO) throws MandrinException{
		userDao.saveUser(userDTO);
	}

}
