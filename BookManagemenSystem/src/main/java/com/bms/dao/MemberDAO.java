package com.bms.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.Entities.MemberEntity;

public interface MemberDAO extends JpaRepository<MemberEntity, Serializable>{

}
