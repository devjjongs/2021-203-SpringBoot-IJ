package com.bit.x4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.x4.model.dao.MemberJpaRepository;
import com.bit.x4.model.vo_dto_entity.MemberJpa;

@Controller
@RequestMapping("/member")
public class JPAExamController {
    @Autowired
    private MemberJpaRepository dao;

    @RequestMapping("/hi")
    @ResponseBody
    public String hello() {

        return "Hellodvfdgdfjdfg76458043580438543~~~~~";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<MemberJpa> view() {
        List<MemberJpa> memberData = dao.findAll();
        return memberData;
    }

    @RequestMapping("/idInput")
    public String idInput() {

        return "idInput";
    }


    // http://localhost:9089/member/test1?memberId=1234
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(int memberId) {

        return "memberId=" + memberId;
    }

    // http://localhost:9089/member/test2/1234
    @RequestMapping("/test2/{memberId}")
    @ResponseBody
    public String test2(@PathVariable int memberId) {

        return "memberId=" + memberId;
    }

    @ResponseBody
    @GetMapping("/add")
    public MemberJpa add(MemberJpa entity) {
        return dao.save(entity);
    }

    @RequestMapping("/del/{id}")
    public String delete(@PathVariable int id) {
        System.out.println("id=" + id);
        dao.deleteById(id);
        return "redirect:/member/list";
    }
}
