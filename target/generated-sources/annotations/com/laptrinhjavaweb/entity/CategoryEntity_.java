package com.laptrinhjavaweb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CategoryEntity.class)
public abstract class CategoryEntity_ extends com.laptrinhjavaweb.entity.BaseEntity_ {

	public static volatile ListAttribute<CategoryEntity, NewEntity> news;
	public static volatile SingularAttribute<CategoryEntity, String> code;
	public static volatile ListAttribute<CategoryEntity, ProductEntity> productEntities;
	public static volatile SingularAttribute<CategoryEntity, String> name;

	public static final String NEWS = "news";
	public static final String CODE = "code";
	public static final String PRODUCT_ENTITIES = "productEntities";
	public static final String NAME = "name";

}

