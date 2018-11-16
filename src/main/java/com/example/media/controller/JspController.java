package com.example.media.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.media.domain.Orders;
import com.example.media.domain.User;
import com.example.media.repository.OrderBaseRepositoryCustom;
import com.example.media.repository.UserRepository;
import com.example.media.service.OrdersService;

@Controller
@SuppressWarnings({"unused","unchecked","rawtypes"})
public class JspController {
	
	@Resource
	private OrdersService ordersService;
	@Autowired
	OrderBaseRepositoryCustom orderBaseRepositoryCustom;
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(ModelMap map)
    {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    } 
	
	@RequestMapping("/ceshi")
	public String ceshi(ModelMap map) {
		List<Orders> findCityAndHotelByHQL = ordersService.findOrdersAndUserByHQL(Long.parseLong("2"));
		map.addAttribute("list", findCityAndHotelByHQL);
		return "index";
	}
	
	/*@RequestMapping("/ceshi1")
	public String ceshi1(ModelMap map) {
		List<Object[]> groupByStudentAsHql = orderBaseRepositoryCustom.groupByStudentAsSql();
		
		List<Orders> findCityAndHotelByHQL = ordersService.findOrdersAndUserByHQL(Long.parseLong("2"));
		map.addAttribute("list", findCityAndHotelByHQL);
		return "index";
	}
*/
	@RequestMapping("/ceshi2")
	public String ceshi2(ModelMap map) {
		Orders aa = new Orders();
		List<Orders> groupByStudentAsHql = orderBaseRepositoryCustom.groupByStudentAsSpecification();
		map.addAttribute("list", groupByStudentAsHql);
		return "index";
	}
	
	@RequestMapping("/ceshi3")
	public String ceshi3(ModelMap map,String username) {
		StringBuffer jpql = new StringBuffer("select w from Weibo w join fetch w.user u left join fetch w.comments c where 1=1 ");
		Map<String,Object> paramMap = new HashMap<>();
		
		if(!StringUtils.isEmpty(username)){
            jpql.append(" and u.username = :username");
            paramMap.put("username",username);
        }

		Orders aa = new Orders();
		List<Orders> groupByStudentAsHql = orderBaseRepositoryCustom.groupByStudentAsSpecification();
		map.addAttribute("list", groupByStudentAsHql);
		return "index";
	}
	
	
}
