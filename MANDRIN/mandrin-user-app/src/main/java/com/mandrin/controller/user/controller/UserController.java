package com.mandrin.controller.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author HasankaMac
 *
 */

@Controller
@RequestMapping(name = "/controller")
public class UserController {

	
	@RequestMapping(value="/test",method =RequestMethod.GET)
	public String test(){
		System.out.println("sample app test \n");
		return "OK";
	}
	
}
