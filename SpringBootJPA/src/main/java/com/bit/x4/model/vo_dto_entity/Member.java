package com.bit.x4.model.vo_dto_entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Member {
    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Collection<Phone> phone;
}
