package com.bit.x4.controller;

import com.bit.x4.model.dao.MemberJpaRepository;
import com.bit.x4.model.vo_dto_entity.MemberJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/member")
public class JPAExamController {
    @Autowired
    private MemberJpaRepository dao;


    @RequestMapping("/hi")
    @ResponseBody
    public String hello() {

        return "Hello";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<MemberJpa> view() {
        List<MemberJpa> memberData = dao.findAll();
        return memberData;
    }
}
