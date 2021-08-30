package com.bit.x4.model.vo_dto_entity;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class MemberJpa {
	@Id
	@GeneratedValue
	private int memberId;
	private String email;
	private String password;
	
	@CreationTimestamp
	private @Column(name = "cdate") Timestamp cdate;
	@UpdateTimestamp
	private @Column(name = "udate") Timestamp udate;
}
