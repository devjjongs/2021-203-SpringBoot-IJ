package com.bit.x4;

import com.bit.x4.model.dao.MemberRepository;
import com.bit.x4.model.dao.PhoneRepository;
import com.bit.x4.model.vo_dto_entity.Member;
import com.bit.x4.model.vo_dto_entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Jpa3Application implements CommandLineRunner {
    @Autowired
    private MemberRepository mr;
    private PhoneRepository pr;

    public static void main(String[] args) {
        SpringApplication.run(Jpa3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Member first = new Member("jung");
//        first.addPhone(new Phone("010-xxxx-xxxx"));
//        first.addPhone(new Phone("010-yyyy-yyyy"));
//        Member second = new Member("Dong");
//        second.addPhone(new Phone("010-zzzz-zzzz"));
//        Member third = new Member("Min");
//        mr.save(first);
//        mr.save(second);
//        mr.save(third);
        List<Member> list = mr.findAll();
        for (Member m : list) {
            System.out.println(m.toString());
        }
        mr.deleteAll();
    }
}
