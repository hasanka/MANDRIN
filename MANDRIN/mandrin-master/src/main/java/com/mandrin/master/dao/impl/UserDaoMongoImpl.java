package com.mandrin.master.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.core.dao.BaseMongoDao;
import com.mandrin.api.exception.MandrinException;
import com.mandrin.master.adapter.UserAdapter;
import com.mandrin.master.dao.UserDao;
import com.mandrin.master.domain.User;

/**
 * 
 * @author HasankaMac
 * 
 */
public class UserDaoMongoImpl extends BaseMongoDao implements UserDao {

	@Autowired
	private UserAdapter userAdapter;

	@Override
	public void saveUser(UserDTO dto) throws MandrinException {
		try {
			User user = userAdapter.userDtoToUser(dto);
			getMongoOperation().save(user);
		} catch (Exception ex) {
			mandrinExceptionHandler(ex);
		}

	}

	@Override
	public List<UserDTO> searchAllUsers() throws MandrinException {
		List<User> users = getMongoOperation().findAll(User.class);
		return userAdapter.toUserDtoList(users);
	}

}
