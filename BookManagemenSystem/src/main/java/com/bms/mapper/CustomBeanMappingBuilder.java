package com.bms.mapper;

import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingBuilder;
import org.springframework.stereotype.Component;

import com.bms.Entities.BorrowDetailsEntity;
import com.bms.Entities.BooksEntity;
import com.bms.Entities.MemberEntity;
import com.bms.Entities.PublisherEntity;
import com.bms.model.BorrowDetails;
import com.bms.model.Books;
import com.bms.model.Member;
import com.bms.model.Publisher;

@Component
public class CustomBeanMappingBuilder extends BeanMappingBuilder {

	@SuppressWarnings("unused")
	@Override
	protected void configure() {

		TypeMappingBuilder bookBuilder = mapping(BooksEntity.class, Books.class);
		bookBuilder.fields("publisherEntity", "publisher");

		TypeMappingBuilder memberBuilder = mapping(MemberEntity.class, Member.class);
		//memberBuilder.fields("booksEntityList", "booksList");

		TypeMappingBuilder publisherBuilder = mapping(PublisherEntity.class, Publisher.class);
		//publisherBuilder.fields("booksEntityList", "booksList");
		
		TypeMappingBuilder barrowDetailsBuilder = mapping(BorrowDetailsEntity.class, BorrowDetails.class);
		barrowDetailsBuilder.fields("booksEntity", "books");
		barrowDetailsBuilder.fields("memberEntity", "member");

		// String dateFormat = "MM-dd-yyyy HH:mm:ssZ";

		/*
		 * TypeMappingBuilder getMapListBuilder = mapping(BooksEntity.class,
		 * Books.class, TypeMappingOptions.wildcard(true),
		 * TypeMappingOptions.dateFormat(dateFormat),
		 * TypeMappingOptions.trimStrings(true));
		 */
		/*
		 * getMapListBuilder.fields("mapEntityKey.mapId", "mapId");
		 * getMapListBuilder.fields("mapEntityKey.versionId", "versionId");
		 * getMapListBuilder.fields("mapEntityKey.sectorId", "sectorId");
		 * getMapListBuilder.fields("createDt", "createDt");
		 * getMapListBuilder.fields("lastUpdateDt", "lastUpdateDt");
		 */

	}
}