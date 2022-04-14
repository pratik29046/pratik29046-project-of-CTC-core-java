package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ShopOwner shopowner;
	
	@OneToOne(cascade=CascadeType.ALL)
	private MallAdmin malladmin;

	@OneToOne(cascade=CascadeType.ALL)
	private Customer customer;
	

	//	Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ShopOwner getShopowner() {
		return shopowner;
	}

	public void setShopowner(ShopOwner shopowner) {
		this.shopowner = shopowner;
	}
	
	public MallAdmin getMalladmin() {
		return malladmin;
	}

	public void setMalladmin(MallAdmin malladmin) {
		this.malladmin = malladmin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
