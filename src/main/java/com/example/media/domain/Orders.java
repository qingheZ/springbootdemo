package com.example.media.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
	 private static final long serialVersionUID = 1L;
	 	
	 	@Id
	    @GeneratedValue
	    @Column(name = "id",nullable = true,unique = true)  //unique 这个字段的值不能重复
	    private Long id;
 	   
	 	
 	    @Column(name = "uid",nullable = true,unique = true)
	    private Long uid;
 	    @Column(name = "orderid",nullable = true,unique = true)
 	    private Long orderid;
	   
 	    @Column(name = "name",nullable = true,unique = true)  //unique 这个字段的值不能重复
	    private String name;
	    
 	    
 	   @JoinColumn(name = "uid",insertable = false, updatable = false)//外键
 	   @ManyToOne
 	   private User user;
 	   
 	   
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getOrderid() {
			return orderid;
		}
		public void setOrderid(Long orderid) {
			this.orderid = orderid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
}
