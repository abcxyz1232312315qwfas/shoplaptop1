package com.laptrinhjavaweb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(NewEntity.class)
public abstract class NewEntity_ extends com.laptrinhjavaweb.entity.BaseEntity_ {

	public static volatile SingularAttribute<NewEntity, String> thumbnail;
	public static volatile SingularAttribute<NewEntity, String> shortDescription;
	public static volatile SingularAttribute<NewEntity, String> title;
	public static volatile SingularAttribute<NewEntity, CategoryEntity> category;
	public static volatile SingularAttribute<NewEntity, String> content;

	public static final String THUMBNAIL = "thumbnail";
	public static final String SHORT_DESCRIPTION = "shortDescription";
	public static final String TITLE = "title";
	public static final String CATEGORY = "category";
	public static final String CONTENT = "content";

}

