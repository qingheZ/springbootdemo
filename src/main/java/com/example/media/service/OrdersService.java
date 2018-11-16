package com.example.media.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.example.media.domain.Orders;

public interface OrdersService  {

	@Transactional
	public List<Orders> findOrdersAndUserByHQL(Long id);

	public List<Orders> findByNameLike(String str);
	
	public Orders findById(Long id);
	
	List<Orders> findAll();
}
