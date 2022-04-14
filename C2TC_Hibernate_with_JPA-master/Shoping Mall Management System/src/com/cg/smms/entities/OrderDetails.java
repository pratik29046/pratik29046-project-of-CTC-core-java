package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="orderDetails")
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id")
	private int id;
	
	@Column(name="date_of_purchase")
	private LocalDate dateOfPurchase;
	
	@Column(name="total")
	private float total;
	
	@Column(name="payment_mode")
	private String paymentMode;
	
//	for getting shop_id from shop
	@ManyToOne
	@JoinColumn(name="shop_id")
	private Shop shop;
	
//	for getting customer_id from customer
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
////	for giving order id to customer 
//	@OneToOne(cascade=CascadeType.ALL, mappedBy="orderDetails_1")
//	private Customer customer_1;

//	Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

//	public Customer getCustomer_1() {
//		return customer_1;
//	}
//
//	public void setCustomer_1(Customer customer_1) {
//		this.customer_1 = customer_1;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	

	
}
