package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int employee_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="salary")
	private float salary; 
	
	@Column(name="address")
	private String address;
	
	@Column(name="designation")
	private String designation;
	
//	for giving employee id to shop 
	@OneToOne(cascade=CascadeType.ALL,mappedBy="employee1")
	private Shop shop_1; 
	
//	for getting shop_id from shop
	@ManyToOne
	@JoinColumn(name="shop_id")
	private Shop shop;

//Getters and Setters
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Shop getShop_1() {
		return shop_1;
	}

	public void setShop_1(Shop shop_1) {
		this.shop_1 = shop_1;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
