package com.bit.x4.model.vo_dto_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member2 {
    @Id
    @Column(name = "MEMBERID")
    @GeneratedValue()
    private int memberId;
    private String name;
}
