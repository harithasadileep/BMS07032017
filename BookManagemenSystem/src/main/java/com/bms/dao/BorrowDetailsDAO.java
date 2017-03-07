package com.bms.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.Entities.BorrowDetailsEntity;

public interface BorrowDetailsDAO extends JpaRepository<BorrowDetailsEntity, Serializable>{

}
