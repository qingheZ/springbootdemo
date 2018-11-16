package com.example.media.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.media.domain.Orders;
import com.example.media.domain.User;
import com.example.media.repository.OrdersRepository;
import com.example.media.service.OrdersService;
@Service
public  class OrdersServiceImpl implements   OrdersService {
	@Autowired
	private OrdersRepository ordersRepository;
	 
	public List<Orders> findOrdersAndUserByHQL(Long id) {
		List<Orders> findUserAndOrdersByHQL = ordersRepository.findOrdersAndUserByHQL(id);
		return findUserAndOrdersByHQL;
	}
	
	public List<Orders> findByNameLike(String str) {
		List<Orders> findByNameLike = ordersRepository.findByNameLike(str);
	return findByNameLike;
	}

	public Orders findById(Long id) {
		Optional<Orders> order = ordersRepository.findById(id);
		Orders order1 = order.get();
		return order1;
	}

	public List<Orders> findAll() {
		 
		  List<Orders> findAll = this.ordersRepository.findAll();
		  return findAll;
	}

	 
}
