package com.bms.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.Entities.PublisherEntity;

public interface PublisherDAO extends JpaRepository<PublisherEntity, Serializable>{

}
