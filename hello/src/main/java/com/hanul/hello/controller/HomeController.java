package com.hanul.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("myInfo")
	public String myInfo(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("gender", "<b>남성</b>");
		return "member/myInfo";
	}
}
