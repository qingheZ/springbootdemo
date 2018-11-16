package com.example.media.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.media.domain.Orders;
import com.example.media.domain.User;
import com.example.media.repository.OrdersRepository;
import com.example.media.repository.UserRepository;
import com.example.media.service.OrdersService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "/demo")
public class HelloWord {
	
	@Resource
	private OrdersService ordersService;
	@Autowired
	UserRepository userRepository;
	@Autowired
	OrdersRepository ordersRepository;
	
	@RequestMapping("/hello")
	public String Hello() {
		return "This is Hello Word...";
	}
	
	@RequestMapping(value = {"/json"}, method = RequestMethod.GET)
	public JSONObject getdaokuan(){
		JSONObject a = new JSONObject();
		Map<String, Object> map = new HashMap<String ,Object>();
		map.put("name", "张三");
		map.put("duixiang", "李四");
		a.putAll(map);
		return a;
	}
	@RequestMapping("/getall")
	public List<User> getData() {
		List<User> findAll = userRepository.findAll();
		return findAll;
	}
	
	@RequestMapping("/getall2")
	public List<Orders> getData2() {
		List<Orders> findAll = ordersService.findAll();
		return findAll;
	}
	@RequestMapping("/getall1")
	public List<Orders> getData1() {
		List<Orders> findAll = ordersRepository.findAll();
		return findAll;
	}
	
	/*
	@RequestMapping("/getone")
	public User getOne1() {
		Optional<User> findById = userRepository.findById(Long.parseLong("3"));
		User user = findById.get();
		return user;
	}
	@RequestMapping("/findByUsername")
	public User findByUsername() {
		User one = userRepository.findByUsername("张三");
		return one;
	}
	@RequestMapping("/manyhql1")
	public List<User> manyhql1() {
		 List<User> findUserAndOrdersByHQL = userRepository.findUserAndOrdersByHQL(Long.parseLong("2"));
		 System.out.println(11);
		 return findUserAndOrdersByHQL ;
	}
	*/
	
	/*@RequestMapping("/many")
	public List<Orders> duoduiyi() {
		List<Orders> findAll = orderRepository.findByNameLike("李四");
		return findAll;
	}
	@RequestMapping("/many1")
	public List<Orders> duoduiyi1() {
		List<Orders> result = orderRepository.findAllasd();
		List<User> views = new ArrayList<>();
        for (Object o : result) {
            Object[] rowArray = (Object[]) o;
            User a = new User();
            //views.add(o);
        }
		return result;
	}
	@RequestMapping("/manyhql")
	public List<Orders> manyhql() {
		List<Orders> findCityAndHotelByHQL = orderRepository.findOrdersAndUserByHQL(Long.parseLong("2"));
		if(findCityAndHotelByHQL.size()>0) {
			for (int i = 0; i < findCityAndHotelByHQL.size(); i++) {
				User user = findCityAndHotelByHQL.get(i).getUser();
			}
		}
		return findCityAndHotelByHQL;
	}*/
	
	/*@RequestMapping("/getone")
	public Orders getOne1() {
		Orders order = ordersService.findById(Long.parseLong("3"));
		return order;
	}
	@RequestMapping("/manyhql2")
	public List<Orders> manyhql2() {
		List<Orders> findCityAndHotelByHQL = ordersService.findOrdersAndUserByHQL(Long.parseLong("2"));
		if(findCityAndHotelByHQL.size()>0) {
			for (int i = 0; i < findCityAndHotelByHQL.size(); i++) {
				User user = findCityAndHotelByHQL.get(i).getUser();
			}
		} 
		return findCityAndHotelByHQL;
	}
	@RequestMapping("/many")
	public List<Orders> duoduiyi() {
		List<Orders> findAll = ordersService.findByNameLike("%"+"李四"+"%");//"%"+name+"%"
		return findAll;
	}
	*/
}
