package com.mandrin.controller.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mandrin.api.exception.MandrinException;
import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.api.master.user.UserService;
import com.mandrin.controller.user.adapter.UserAdapter;
import com.mandrin.controller.user.dto.UserFeto;

/**
 * 
 * @author HasankaMac
 * 
 */

@Controller
@RequestMapping(name = "/controller")
public class UserController {

	@Autowired
	private UserService userService;

	private UserAdapter adapter = new UserAdapter();
	
	@ResponseBody
	@RequestMapping(value = "/searchGridData", method = RequestMethod.GET)
	public ModelMap searchGridData() throws MandrinException {
		ModelMap mp = new ModelMap();
		List<UserDTO> userList = userService.searchAllUsers();
		mp.addAttribute("data", adapter.toUserFetoList(userList));
		return mp;
	}

	@ResponseBody
	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	public void saveUser(@ModelAttribute UserFeto feto) throws MandrinException {
		UserDTO dto = adapter.toUserDto(feto);
		userService.saveUser(dto);
	}
	
}
