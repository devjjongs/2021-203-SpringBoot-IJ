package com.bit.x3.controller;


import com.bit.x3.model.vo.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberManagementController {
    private static final Logger log = LoggerFactory.getLogger(MemberManagementController.class);

    //index
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    //로그인
    @RequestMapping("/login")
    public void memberLogin() {
        log.info("Login");
    }

    //회원가입을 위한 form call
    @GetMapping("/memberNew")
    public String memberNewFormCall(Member member) {
        log.info("memberNewFormCall()");
        return "/member/joinForm";
    }

    //회원가입 데이터 저장
    @PostMapping("/memberNew")
    public String memberNew(Member member) {
//		암호에 대해서 암호화시킨다
//        dao 의 insert 담당하는 메소드 호출
//        결과를 받아서
        log.info("/memberNew() return 전");
        return "redirect:/login";
    }
}
