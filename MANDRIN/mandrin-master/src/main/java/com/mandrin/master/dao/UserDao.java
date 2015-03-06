package com.mandrin.master.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.api.exception.MandrinException;

/**
 * 
 * @author HasankaMac
 *
 */
@Transactional
public interface UserDao {

	public void saveUser(UserDTO dto) throws MandrinException;
	
	public List<UserDTO> searchAllUsers()throws MandrinException;
	
	
}
