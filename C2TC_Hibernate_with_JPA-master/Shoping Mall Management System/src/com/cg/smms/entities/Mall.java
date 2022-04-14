package com.cg.smms.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

public class Mall implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mall_id")
	private int id;
	
	@Column(name="mallName")
	private String mallName;
	
	@Column(name="categories")
	private String categpries;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mallAdmin_id")
	private MallAdmin mallAdmin;
	
	@OneToMany(mappedBy="mall",cascade=CascadeType.ALL)
	private List<Shop> shop = new ArrayList<>();

	
//	Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getCategpries() {
		return categpries;
	}

	public void setCategpries(String categpries) {
		this.categpries = categpries;
	}

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public List<Shop> getShop() {
		return shop;
	}

	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
