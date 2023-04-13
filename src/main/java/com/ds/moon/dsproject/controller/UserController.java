package com.ds.moon.dsproject.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ds.moon.dsproject.dto.UserDto;
import com.ds.moon.dsproject.entity.User;
import com.ds.moon.dsproject.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/index")
	public String index() {
		return "/index";
	}

	@GetMapping(value = "/test")
	public String test(Model model) {
		model.addAttribute("test", "테스트중이용");
		return "/test";
	}

	@GetMapping(value = "/list")
	public String UserList(Model model) {

		return "userlist";
	}

	@GetMapping(value = "/sign")
	public String UserSign() {
		return "usersign";
	}

	@PostMapping(value = "/user/sign")
	public String user_sign_proc(UserDto dto) {
		User user = User.createMember(dto);
		
		service.saveUser(user);
		return "redirect:/";
	}

}