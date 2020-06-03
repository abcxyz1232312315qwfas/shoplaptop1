package com.laptrinhjavaweb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RoleEntity.class)
public abstract class RoleEntity_ extends com.laptrinhjavaweb.entity.BaseEntity_ {

	public static volatile SingularAttribute<RoleEntity, String> code;
	public static volatile SingularAttribute<RoleEntity, String> name;
	public static volatile ListAttribute<RoleEntity, UserEntity> users;

	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String USERS = "users";

}

