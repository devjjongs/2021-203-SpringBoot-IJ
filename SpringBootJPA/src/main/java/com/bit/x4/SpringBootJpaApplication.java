package com.bit.x4;

import com.bit.x4.model.dao.Member2Repository;
import com.bit.x4.model.dao.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

    }
}
