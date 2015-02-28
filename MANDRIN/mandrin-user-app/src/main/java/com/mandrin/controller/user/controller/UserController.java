package com.mandrin.controller.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.api.master.user.UserService;

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
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		userService.saveUser(new UserDTO());
		return "success";
	}

}
