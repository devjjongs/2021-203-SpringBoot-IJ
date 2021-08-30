package com.bit.x4.model.vo_dto_entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Member2 {
	@Id
	@Column(name="MEMBERID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "MEMBER2_SEQ")
	@SequenceGenerator( name = "MEMBER2_SEQ" ,  sequenceName ="MEMBER2_SEQ" ,allocationSize = 1)
	private int memberId;
	
	
	@Column(name="name")
	private String name;

	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name ="memberId" )		
	private Collection<Phone>  phones = new ArrayList<Phone>();
	
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


	public Collection<Phone> getPhones() {
		return phones;
	}


	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}


	public void addPhone(Phone phone) {
		phones.add(phone);
	}
	
	
	@Override
	public String toString() {
		return "Member2 [memberId=" + memberId + ", name=" + name + "]";
	}
	
}
