package com.mandrin.controller.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mandrin.api.exception.MandrinException;
import com.mandrin.api.master.dto.UserDTO;
import com.mandrin.api.master.user.UserService;
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

	@ResponseBody
	@RequestMapping(value = "/searchGridData", method = RequestMethod.GET)
	public ModelMap searchGridData() throws MandrinException {
		
		ModelMap mp = new ModelMap();
		
		List<UserFeto> userData = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			UserFeto u = new UserFeto();
//			u.setUserId(0);
			u.setFirstName("Hasanka"+i);
			u.setLastName("Ch ");
			u.setPhoneNumber("0713355402");
			u.setEmail("hasanka.ch@gmail.com");
			u.setStatus("Active");
			u.setUserName("ChUserName");
			userData.add(u);
		}
		mp.addAttribute("data", userData);
		mp.addAttribute("draw", 1);
		mp.addAttribute("recordsTotal", 100);
		mp.addAttribute("recordsFiltered", 100);
		return mp;
//		userService.saveUser(new UserDTO());
	}

	
	
}
