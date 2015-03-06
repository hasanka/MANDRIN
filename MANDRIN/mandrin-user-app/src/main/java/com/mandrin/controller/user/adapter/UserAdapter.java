package com.mandrin.controller.user.adapter;

import java.util.ArrayList;
import java.util.List;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.controller.user.dto.UserFeto;

/**
 * 
 * @author HasankaMac
 * 
 */
public class UserAdapter {

	public List<UserFeto> toUserFetoList(List<UserDTO> users) {
		List<UserFeto> fetos = new ArrayList<>();
		if (users == null || users.size() == 0) {
			return fetos;
		}

		for (UserDTO user : users) {
			fetos.add(toUserFeto(user));
		}
		return fetos;

	}

	public UserFeto toUserFeto(UserDTO userDto) {
		UserFeto u = new UserFeto();
		u.setUserId(userDto.getUserId());
		u.setFirstName(userDto.getFirstName());
		u.setLastName(userDto.getLastName());
		u.setPhoneNumber(String.valueOf(userDto.getPhoneNumber()));
		u.setEmail(userDto.getEmail());
		u.setStatus(userDto.getStatus());
		u.setUserName(userDto.getUserName());
		u.setPassword(userDto.getPassword());
		u.setVersion(String.valueOf(userDto.getVersion()));
		u.setComment(userDto.getComment());
		return u;
	}

	public UserDTO toUserDto(UserFeto userFeto){
		UserDTO dto = new UserDTO();
		if(userFeto.getUserId() != null && !userFeto.getUserId().isEmpty()){
			dto.setUserId(userFeto.getUserId());
		}
		
		if(userFeto.getVersion() != null && !userFeto.getVersion().isEmpty()){
			dto.setVersion(Integer.valueOf(userFeto.getVersion()));
		}
		
		dto.setFirstName(userFeto.getFirstName());
		dto.setLastName(userFeto.getLastName());
		dto.setPhoneNumber(Long.valueOf(userFeto.getPhoneNumber()));
		dto.setEmail(userFeto.getEmail());
		dto.setStatus(userFeto.getStatus());
		dto.setUserName(userFeto.getUserName());
		dto.setPassword(userFeto.getPassword());
		dto.setComment(userFeto.getComment());
		return dto;
	}
	
}
