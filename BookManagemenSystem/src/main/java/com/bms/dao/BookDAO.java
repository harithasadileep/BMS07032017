package com.bms.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.bms.Entities.BooksEntity;


public interface BookDAO extends  CrudRepository<BooksEntity, Serializable>{

}
