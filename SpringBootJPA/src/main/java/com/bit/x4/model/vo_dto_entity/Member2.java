package com.bit.x4.model.vo_dto_entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Member2 {
    @Id
    @Column(name = "MEMBERID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER2_SEQ")
    @SequenceGenerator(name = "MEMBER2_SEQ", sequenceName = "MEMBER2_SEQ", allocationSize = 1)
    private int memberId;

    @Column(name = "name")
    private String name;

    public Collection<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Collection<Phone> phones) {
        this.phones = phones;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "memberId")
    private Collection<Phone> phones;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPhone(Phone phone) {
        Phone.add(phone);
    }

    @Override
    public String toString() {
        return "Member2{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
