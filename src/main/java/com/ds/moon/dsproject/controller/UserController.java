package com.ds.moon.dsproject.controller;

import java.lang.ProcessBuilder.Redirect;
import java.security.Provider.Service;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import com.ds.moon.dsproject.dto.UserDto;
import com.ds.moon.dsproject.entity.Dept;
import com.ds.moon.dsproject.entity.Hb;
import com.ds.moon.dsproject.entity.User;
import com.ds.moon.dsproject.service.UserService;
import com.ds.moon.dsproject.service.DeptService;
import com.ds.moon.dsproject.service.HbService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private HbService hbService;

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
	public String UserList(Model model, String searchKeyword, String userNm) {
		List<User> userlist = userService.getListUser();
		List<Dept> deptlist = deptService.getListDept();
		List<Hb> hblist = hbService.getListHb();
		User user = new User();
		System.out.println("우ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ"+userNm);
		System.out.println("우ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ"+searchKeyword);
		if (searchKeyword == null) {
			userlist = userService.getListUser();
			if (userNm == null) {
				userNm = "";
			} else {
				user = userService.getUserInfo(userNm);
				System.out.println("컨유오컹커너언ㄹ머" + user);
			}
		} else {
			userlist = userService.getListUserNm(searchKeyword);
			if (userNm == null) {
				userNm = "";
			} else {
				user = userService.getUserInfo(userNm);
				System.out.println("컨유오컹커너언ㄹ머" + user);
			}
		}

		// System.out.println("userurrrrrrrrrrrrrrrr"+user);
		model.addAttribute("userinfo", user);
		model.addAttribute("deptlist", deptlist);
		model.addAttribute("hblist", hblist);
		model.addAttribute("userlist", userlist);

		return "userlist";
	}

	@GetMapping(value = "/sign")
	public String UserSign(Model model) {
		List<Dept> deptlist = deptService.getListDept();
		List<Hb> hblist = hbService.getListHb();
		model.addAttribute("deptlist", deptlist);
		model.addAttribute("hblist", hblist);
		return "usersign";
	}

	@PostMapping(value = "/user/sign")
	public String user_sign_proc(UserDto userdto) {
		User user = User.createUser(userdto);
		// Dept dept = new Dept();
		// dept.setDeptCd(userdto.getDeptCd());
		userService.saveUser(user);

		return "redirect:/list";
	}

}