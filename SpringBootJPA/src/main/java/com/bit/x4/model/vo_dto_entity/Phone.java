package com.bit.x4.model.vo_dto_entity;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    @Column(name = "member_id")
    private int memberId;

    @Column(name = "no")
    private String no;
}
