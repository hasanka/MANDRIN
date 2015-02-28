package com.mandrin.master.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.core.dao.BaseMongoDao;
import com.mandrin.master.adapter.UserAdapter;
import com.mandrin.master.dao.UserDao;
import com.mandrin.master.domain.User;

/**
 * 
 * @author HasankaMac
 *
 */
public class UserDaoMongoImpl extends BaseMongoDao implements UserDao{

	@Autowired
	private UserAdapter userAdapter; 
	
	@Override
	public void saveUser(UserDTO dto) {
		User user = userAdapter.userDtoToUser(dto);
		getMongoOperation().save(user);
	}
	
	
}
