package com.example.media.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.media.domain.Orders;
@Repository
@SuppressWarnings("unchecked")
public class OrderBaseRepositoryCustomImpl<T, PK extends Serializable> implements OrderBaseRepositoryCustom{

	@Autowired
    @PersistenceContext
    private EntityManager entityManager;
	
	public List<Object[]> groupByStudentAsSql() {
		 List<Object[]> list = entityManager
	                .createNativeQuery(" SELECT a.id,a.username,a.pass_word,a.email FROM  user a ")
	                .getResultList();
	 
	        return list;
	}

	public List<Object[]> groupByStudentAsHql() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Orders> groupByStudentAsSpecification() {
		List<Orders> list = entityManager
                .createNativeQuery(" SELECT  * FROM orders  ")
                .getResultList();
 
        return list;
	}
	
	

}
