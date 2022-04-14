package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="malladmin")
public class MallAdmin implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mall_admin_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mall_admin_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mall_name")
	private String mall_name;
	
	@Column(name="phone")
	private String phone;

	@OneToOne(mappedBy="malladmin")
	private User user;
	
	@OneToOne(mappedBy="mallAdmin")                  
    private Mall mall;
	

	//	Getters and Setters
	public int getMall_admin_id() {
		return mall_admin_id;
	}

	public void setMall_admin_id(int mall_admin_id) {
		this.mall_admin_id = mall_admin_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMall_name() {
		return mall_name;
	}

	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}
	
	
}
