package com.laptrinhjavaweb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductEntity.class)
public abstract class ProductEntity_ extends com.laptrinhjavaweb.entity.BaseEntity_ {

	public static volatile SingularAttribute<ProductEntity, String> amount;
	public static volatile ListAttribute<ProductEntity, CartEntity> carts;
	public static volatile SingularAttribute<ProductEntity, String> color;
	public static volatile SingularAttribute<ProductEntity, String> os;
	public static volatile SingularAttribute<ProductEntity, String> price;
	public static volatile SingularAttribute<ProductEntity, String> name;
	public static volatile SingularAttribute<ProductEntity, Double> weight;
	public static volatile SingularAttribute<ProductEntity, String> shortDescription;
	public static volatile SingularAttribute<ProductEntity, CategoryEntity> category;
	public static volatile SingularAttribute<ProductEntity, String> picture;

	public static final String AMOUNT = "amount";
	public static final String CARTS = "carts";
	public static final String COLOR = "color";
	public static final String OS = "os";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String WEIGHT = "weight";
	public static final String SHORT_DESCRIPTION = "shortDescription";
	public static final String CATEGORY = "category";
	public static final String PICTURE = "picture";

}

