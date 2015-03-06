package com.mandrin.master.adapter;

import java.util.ArrayList;
import java.util.List;

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
		user.setUserId(dto.getUserId());
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setEmail(dto.getEmail());
		user.setPhoneNumber(dto.getPhoneNumber());
		user.setStatus(dto.getStatus());
		user.setUserName(dto.getUserName());
		user.setPassword(dto.getPassword());
		user.setComment(dto.getComment());
		user.setVersion(dto.getVersion());
		return user;
	}
	
	public UserDTO userToUserDto(User user){
		UserDTO dto = new UserDTO();
		dto.setUserId(user.getUserId());
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setPhoneNumber(user.getPhoneNumber());
		dto.setEmail(user.getEmail());
		dto.setStatus(user.getStatus());
		dto.setUserName(user.getUserName());
		dto.setPassword(user.getPassword());
		dto.setVersion(user.getVersion());
		dto.setComment(user.getComment());
		return dto;
	}
	
	public List<UserDTO> toUserDtoList(List<User> users){
		List<UserDTO> dtoList = new ArrayList<UserDTO>();
		if(users == null || users.size() == 0 ){
			return dtoList;
		}
		
		for (User usr : users) {
			dtoList.add(userToUserDto(usr));
		}
		
		return dtoList;
	}
	
	
}
