package com.bit.x4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bit.x4.model.dao.Member2Repository;
import com.bit.x4.model.dao.PhoneRepository;
import com.bit.x4.model.vo_dto_entity.Member2;
import com.bit.x4.model.vo_dto_entity.Phone;


@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
    @Autowired
    private Member2Repository member2Repository;
    @Autowired
    private PhoneRepository phoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
        org.hibernate.cfg.ImprovedNamingStrategy d;
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Member2 member2 = new Member2();
        member2.setName("min");


        member2.addPhone(new Phone("010-777-7777"));
        member2.addPhone(new Phone("010-888-7777"));
        member2.addPhone(new Phone("010-999-7777"));
        member2Repository.save(member2);
    }

}
