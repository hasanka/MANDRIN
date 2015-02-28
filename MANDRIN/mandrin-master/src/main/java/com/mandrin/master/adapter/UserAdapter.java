package com.mandrin.master.adapter;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.master.domain.User;

/**
 * 
 * @author HasankaMac
 *
 */
public class UserAdapter {

	public User userDtoToUser(UserDTO dto){
		User user = new User();
		user.setFirstName("Hasanka");
		user.setLastName("Chandrasekaran");
		user.setEmail("hasanka.ch@gmail.com");
		user.setPhoneNumber(0713355402);
		user.setStatus("ACT");
		user.setUserName("hasanka");
		user.setPassword("123abc");
		return user;
	}
	
}
