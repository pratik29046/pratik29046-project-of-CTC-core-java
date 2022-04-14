package com.cg.smms.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="order_id")
	private int order_id;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
//	With user
	@OneToOne(mappedBy="customer")
	private User user;

//	For giving customer id to order details
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private List<OrderDetails> orderDetails = new ArrayList<>();
	
////	For taking order id from order details
//	@OneToOne
//	@JoinColumn(name="order_id")
//	private OrderDetails orderDetails_1;

//	Getters and setters
	
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

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

//	public OrderDetails getOrderDetails_1() {
//		return orderDetails_1;
//	}
//
//	public void setOrderDetails_1(OrderDetails orderDetails_1) {
//		this.orderDetails_1 = orderDetails_1;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
