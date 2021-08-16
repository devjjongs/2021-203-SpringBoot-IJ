package com.bit.x3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberManagementController {
	@GetMapping("/memberNew")
	public String memberNewFormCall() {
		return "/member/joinForm";
	}
	
	@PostMapping("/memberNew")
	public String memberNew() {
//		암호에 대해서 암호화시킨다
//        dao 의 insert 담당하는 메소드 호출
//        결과를 받아서 
		return "redirect:/login";
	}
}
