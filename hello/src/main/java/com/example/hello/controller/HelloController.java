package com.example.hello.controller;

import com.example.hello.model.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("foo", "hi^^");
        Member member = new Member();
        member.setAttribute();
        return "index";//index.html
    }
}
