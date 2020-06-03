package com.laptrinhjavaweb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserEntity.class)
public abstract class UserEntity_ extends com.laptrinhjavaweb.entity.BaseEntity_ {

	public static volatile ListAttribute<UserEntity, CartEntity> cartEntities;
	public static volatile SingularAttribute<UserEntity, String> password;
	public static volatile ListAttribute<UserEntity, RoleEntity> roles;
	public static volatile SingularAttribute<UserEntity, String> fullName;
	public static volatile SingularAttribute<UserEntity, String> userName;
	public static volatile SingularAttribute<UserEntity, Integer> status;

	public static final String CART_ENTITIES = "cartEntities";
	public static final String PASSWORD = "password";
	public static final String ROLES = "roles";
	public static final String FULL_NAME = "fullName";
	public static final String USER_NAME = "userName";
	public static final String STATUS = "status";

}

