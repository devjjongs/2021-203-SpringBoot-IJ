package com.bit.x4.model.vo_dto_entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class MemberJpa {

    @Id
    private int memberId;
    private String email;
    private String password;

    @CreationTimestamp
    private @Column(name = "cdate")
    Timestamp cdate;
    @UpdateTimestamp
    private @Column(name = "udate")
    Timestamp udate;
}
