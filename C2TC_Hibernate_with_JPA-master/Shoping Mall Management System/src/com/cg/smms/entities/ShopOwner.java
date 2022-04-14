package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShopOwner implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="address")
	private String address;
	
	@Column(name="shop_id")
	private int shop_id;
	
	@OneToOne(mappedBy="shopowner")
	private User user;
	
//	@OneToOne(mappedBy="shopowner")
//	private Shop shop;

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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public Shop getShop() {
//		return shop;
//	}
//
//	public void setShop(Shop shop) {
//		this.shop = shop;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
