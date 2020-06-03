package com.laptrinhjavaweb.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ {

	public static volatile SingularAttribute<BaseEntity, Date> createdDate;
	public static volatile SingularAttribute<BaseEntity, String> createdBy;
	public static volatile SingularAttribute<BaseEntity, Date> modifiedDate;
	public static volatile SingularAttribute<BaseEntity, String> modifiedBy;
	public static volatile SingularAttribute<BaseEntity, Long> id;

	public static final String CREATED_DATE = "createdDate";
	public static final String CREATED_BY = "createdBy";
	public static final String MODIFIED_DATE = "modifiedDate";
	public static final String MODIFIED_BY = "modifiedBy";
	public static final String ID = "id";

}

