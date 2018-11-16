package com.example.media.repository;

import java.io.Serializable;
import java.util.List;

import com.example.media.domain.Orders;

public interface OrderBaseRepositoryCustom<T,PK extends Serializable> {

	//基于原生态的sql进行查询
    List<Object[]> groupByStudentAsSql();
    //基于Hibernate的HQL进行查询
    List<Object[]> groupByStudentAsHql();
    //基于Specification的方式进行查询，使用的是CriteriaQuery进行查询
    List<Orders> groupByStudentAsSpecification();
    
}
