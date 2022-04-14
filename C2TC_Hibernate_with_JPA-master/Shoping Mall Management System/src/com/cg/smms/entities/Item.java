package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int item_id;
	
	@Column(name="Item_name")
	private String item_name;
	
	@Column(name="manufacturung_date")
	private LocalDate manufacturing_dayte;
	
	@Column(name="expiry_date")
	private LocalDate expiry_date;
	
	@Column(name="price")
	private float price;
	
	@Column(name="category")
	private String category;
	
//	for getting shop_id from shop
	@ManyToOne
	@JoinColumn(name="shop_id")
	private Shop shop;
	
//	Getters and Setters
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public LocalDate getManufacturing_dayte() {
		return manufacturing_dayte;
	}

	public void setManufacturing_dayte(LocalDate manufacturing_dayte) {
		this.manufacturing_dayte = manufacturing_dayte;
	}

	public LocalDate getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
