package com.bit.x4.model.vo_dto_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PHONE_SEQ")
    @SequenceGenerator(name = "PHONE_SEQ", sequenceName = "PHONE_SEQ", allocationSize = 1)
    private int seq;

    private int memberId;
    private String phoneNo;


    public Phone() {
        // TODO Auto-generated constructor stub
    }

    public Phone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Phone [seq=" + seq + ", memberId=" + memberId + ", phoneNo=" + phoneNo + "]";
    }

}
