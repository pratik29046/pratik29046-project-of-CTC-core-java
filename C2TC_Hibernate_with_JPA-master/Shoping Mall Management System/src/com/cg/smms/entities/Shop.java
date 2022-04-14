package com.cg.smms.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="shop")
public class Shop implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shopId")
	private int shopId;
	
	@Column(name="shopCategory")
	private String shopCategory; 
	
	@Column(name="shopName")
	private String shopName;
	
	@Column(name="Customers")
	private String customers;
	
	@Column(name="shopStatus") 
	private String shopStatus;
	
	@Column(name="leaseStatus")
	private String leaseStatus;
	
//	for giving shop_id to employee
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();

//	For taking employee id from employee
	@OneToOne
	@JoinColumn(name="employee_id")
	private Employee employee1;
	
//	for giving shop_id to item
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<Item> items = new ArrayList<>();
	
//	for giving shop_id to order details
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<OrderDetails> orderDetails = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private ShopOwner shopowner;

	@ManyToOne
	@JoinColumn(name="mall_id")
	private Mall mall;
	
//	Getters and Setters
	
	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}


	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public ShopOwner getShopowner() {
		return shopowner;
	}

	public void setShopowner(ShopOwner shopowner) {
		this.shopowner = shopowner;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}
	
	
}
