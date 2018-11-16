package com.example.media.repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.example.media.domain.Orders;
import com.example.media.domain.User;
public interface OrdersRepository extends JpaRepository<Orders, Long> ,JpaSpecificationExecutor<Orders>{

	 List<Orders> findByNameLike(String username);

	 List<Orders> findAll();
	 
	 @Query(nativeQuery = true, value = "SELECT a.*,b.* FROM orders a LEFT  JOIN  user b  ON a.uid= b.id ")
	 List<Orders> findAllasd();
	 
	 @Query(nativeQuery = true, value = "SELECT a.*,b.* FROM orders a LEFT  JOIN  user b  ON a.uid= b.id where b.id =:id")
	 List<Orders> findOrdersAndUserByHQL(@Param("id") Long id);
	
	
}