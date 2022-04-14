package com.cg.smms.repository;

import com.cg.smms.entities.Shop;

public interface IShopRepository {

	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(int id);
	public boolean deleteShop(int id);
	
	public Shop addEmployee(Shop shop);
	public Shop updateEmployee(Shop shop);
	public Shop addItem(Shop shop);

	public abstract void beginTransactio();
	public abstract void commitTransaction();
}
