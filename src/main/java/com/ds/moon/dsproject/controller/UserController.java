package com.ds.moon.dsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController{
   
    @GetMapping(value="/index")
	public String index() {
		return "index.html";
	}
}