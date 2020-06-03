package com.laptrinhjavaweb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CartEntity.class)
public abstract class CartEntity_ extends com.laptrinhjavaweb.entity.BaseEntity_ {

	public static volatile SingularAttribute<CartEntity, UserEntity> userEntity;
	public static volatile SingularAttribute<CartEntity, Integer> quantity;
	public static volatile ListAttribute<CartEntity, ProductEntity> products;

	public static final String USER_ENTITY = "userEntity";
	public static final String QUANTITY = "quantity";
	public static final String PRODUCTS = "products";

}

