package com.bms.Entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER_BOOK_BARROW")
public class BorrowDetailsEntity {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BOOK_ID")
	private BooksEntity booksEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MEMBER_ID")
	private MemberEntity memberEntity;

	@Column(name = "RETURN_DATE")
	private Date returnDate;
	@Column(name = "DUE_DATE")
	private Date dueDate;
	@Column(name = "ISSUE")
	private String issue;

	@Id
	@GeneratedValue
	@Column(name = "BARROW_BOOK_MEMBER_ID")
	private int bookBorrowMemberId;

	public BooksEntity getBooksEntity() {
		return booksEntity;
	}

	public void setBooksEntity(BooksEntity booksEntity) {
		this.booksEntity = booksEntity;
	}

	public MemberEntity getMemberEntity() {
		return memberEntity;
	}

	public void setMemberEntity(MemberEntity memberEntity) {
		this.memberEntity = memberEntity;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public int getBookBorrowMemberId() {
		return bookBorrowMemberId;
	}

	public void setBookBorrowMemberId(int bookBorrowMemberId) {
		this.bookBorrowMemberId = bookBorrowMemberId;
	}

	
}
