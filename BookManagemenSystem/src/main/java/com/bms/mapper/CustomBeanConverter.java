package com.bms.mapper;

import javax.annotation.PostConstruct;
import javax.persistence.PostPersist;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomBeanConverter extends DozerBeanMapper {
	
	/** The custom bean mapping builder. */
	@Autowired
	private CustomBeanMappingBuilder customBeanMappingBuilder;

	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		this.addMapping(customBeanMappingBuilder);
	}
}