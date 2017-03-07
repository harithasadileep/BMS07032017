package com.bms.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PUBLISHER")
public class PublisherEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PUBLISHER_ID")
	private Integer publisherId;
	@Column(name = "PUBLISHER_NAME")
	private String publisherName;
	@Column(name = "PUBLISHER_ADDESS")
	private String address;
	
	/* @OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="PUBLISHER_BOOK",
	 joinColumns={@JoinColumn(name="PUBLISHER_ID",referencedColumnName="PUBLISHER_ID")},
	 inverseJoinColumns={@JoinColumn(name="BOOK_ID",referencedColumnName="BOOK_ID",unique=false)})
	 
	 private List<BooksEntity> booksEntityList;*/

	 
	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*public List<BooksEntity> getBooksEntityList() {
		return booksEntityList;
	}

	public void setBooksEntityList(List<BooksEntity> booksEntityList) {
		this.booksEntityList = booksEntityList;
	}*/


	

}
