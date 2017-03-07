package com.bms.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class BooksEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BOOK_ID")
	private Integer bookId;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "AVAILABLE")
	private String available;
	@Column(name = "PRICE")
	private String price;

	@ManyToOne(cascade=CascadeType.ALL)
	private PublisherEntity publisherEntity;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public PublisherEntity getPublisherEntity() {
		return publisherEntity;
	}

	public void setPublisherEntity(PublisherEntity publisherEntity) {
		this.publisherEntity = publisherEntity;
	}

	

}
