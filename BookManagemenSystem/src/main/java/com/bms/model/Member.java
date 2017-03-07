package com.bms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {

	private Integer memberId;
	private Date memmberdate;
	private String memberType;
	private String address;
	private String memberName;
	private Date expDate;

	private List<Books> booksList;
	private List<BorrowDetails> barrowDetailsEntity = new ArrayList<BorrowDetails>();

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

	public List<Books> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Books> booksList) {
		this.booksList = booksList;
	}

	public List<BorrowDetails> getBarrowDetailsEntity() {
		return barrowDetailsEntity;
	}

	public void setBarrowDetailsEntity(List<BorrowDetails> barrowDetailsEntity) {
		this.barrowDetailsEntity = barrowDetailsEntity;
	}

}
