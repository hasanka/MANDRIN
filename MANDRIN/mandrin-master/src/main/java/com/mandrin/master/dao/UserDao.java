package com.mandrin.master.dao;

import org.springframework.transaction.annotation.Transactional;

import com.mandrin.api.master.dto.UserDTO;

/**
 * 
 * @author HasankaMac
 *
 */
@Transactional
public interface UserDao {

	public void saveUser(UserDTO dto);
	
}
