package com.example.media.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "user")
public class User implements Serializable {

	
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "id",unique = true)  //unique 这个字段的值不能重复
    private Long id;
    @Column(name = "username",nullable = false, unique = true)  //unique 这个字段的值不能重复
    private String username;
    
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "email",nullable = false, unique = true)
    private String email;
    @Column(name = "nickname",nullable = true, unique = true)
    private String nickname;
    @Column(name = "regtime",nullable = false)
    private String regtime;
    
    /*@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private Set<Orders> orders = new HashSet<Orders>();*/
    
    // 多对多的时候
/*    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "u_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "r_id", referencedColumnName = "id") )
    private Set<Role> roles;
*/
    
    /*@JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;*/
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	/*public Set<Orders> getOrders() {
		return orders;
	}
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}*/

    
}
