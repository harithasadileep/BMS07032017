package com.bms.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEMBER_ID")
	private Integer memberId;
	@Column(name = "MEMBER_DATE")
	private Date memmberdate;
	@Column(name = "MEMBER_TYPE")
	private String memberType;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "NAME")
	private String memberName;
	@Column(name = "EXP_DATE")
	private Date expDate;
	
	
	/*@OneToMany(mappedBy = "memberEntity")
	private List<BarrowDetailsEntity> barrowDetailsEntity = new ArrayList<BarrowDetailsEntity>();*/

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Date getMemmberdate() {
		return memmberdate;
	}

	public void setMemmberdate(Date memmberdate) {
		this.memmberdate = memmberdate;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	/*
	public List<BarrowDetailsEntity> getBarrowDetailsEntity() {
		return barrowDetailsEntity;
	}

	public void setBarrowDetailsEntity(List<BarrowDetailsEntity> barrowDetailsEntity) {
		this.barrowDetailsEntity = barrowDetailsEntity;
	}*/

	
	
	 
	 

	

	/*public List<BooksEntity> getBooksEntityList() {
		return booksEntityList;
	}

	public void setBooksEntityList(List<BooksEntity> booksEntityList) {
		this.booksEntityList = booksEntityList;
	}
	*/
	

}
