package com.cg.smms.service;

import com.cg.smms.entities.Shop;

public interface IShopService {

	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(int id);
	public boolean deleteShop(int id);
	public Shop addEmployee(Shop employee);
	public Shop updateEmployee(Shop employee);
	public Shop addItem(Shop item);
}
