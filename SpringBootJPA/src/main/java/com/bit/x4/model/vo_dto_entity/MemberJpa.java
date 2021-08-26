package com.bit.x4.model.vo_dto_entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MemberJpa {

    @Id
    private int memberId;
}
