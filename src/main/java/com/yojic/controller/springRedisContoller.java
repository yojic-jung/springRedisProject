package com.yojic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springRedisContoller {
	
	@RequestMapping("login")
	public String login(HttpSession session) {
		System.out.println("세션:"+session.getAttribute("email"));
		return "login";
	}
	
	@RequestMapping("userOnly")
	public String userOnly(HttpSession session) {
		System.out.println("세션:"+session.getAttribute("email"));
		return "userOnly";
	}
}
