package com.bms.model;

import java.util.Date;

public class BorrowDetails {

	private Books books;
	private Member member;

	private int bookBorrowMemberId;
	private Date returnDate;
	private Date dueDate;
	private String issue;

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
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
