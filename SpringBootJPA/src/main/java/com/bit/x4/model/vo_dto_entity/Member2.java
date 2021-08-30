package com.bit.x4.model.vo_dto_entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member2 {
    @Id
    @Column(name = "MEMBERID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER2_SEQ")
    @SequenceGenerator(name = "MEMBER2_SEQ", sequenceName = "MEMBER2_SEQ", allocationSize = 1)
    private int memberId;

    @Column(name = "name")
    private String name;
}
