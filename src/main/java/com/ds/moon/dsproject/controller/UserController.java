package com.ds.moon.dsproject.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import com.ds.moon.dsproject.dto.UserDto;
import com.ds.moon.dsproject.entity.Dept;
import com.ds.moon.dsproject.entity.User;
import com.ds.moon.dsproject.service.UserService;
import com.ds.moon.dsproject.service.DeptService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;

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
		List<User> userlist = userService.getListUser();

		model.addAttribute("userlist", userlist);
		
		return "userlist";
	}

	@GetMapping(value = "/sign")
	public String UserSign(Model model) {
		List<Dept> deptlist = deptService.getListDept();
		model.addAttribute("deptlist", deptlist);
		return "usersign";
	}

	
	@PostMapping(value = "/user/sign")
	public String user_sign_proc(@Valid UserDto dto ) {
		User user = User.createUser(dto);
		
		userService.saveUser(user);
		return "redirect:/";
	}

}