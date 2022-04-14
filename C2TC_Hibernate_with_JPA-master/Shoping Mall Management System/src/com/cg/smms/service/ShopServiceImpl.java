package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.ShopRepositoryImpl;

public class ShopServiceImpl implements IShopService{

	//Step 1: Establishing connection between Service and Repository 
	private IShopRepository dao;
	
	public ShopServiceImpl() {
		dao = new ShopRepositoryImpl();
	}

	//Step 2: Service call to perform CRUD operations
	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransactio();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransactio();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {

		Shop shop = dao.searchShopById(id);
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		dao.beginTransactio();
		dao.deleteShop(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public Shop addEmployee(Shop shop) {
		dao.beginTransactio();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;

	}

	@Override
	public Shop updateEmployee(Shop shop) {
		dao.beginTransactio();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop addItem(Shop shop) {
		dao.beginTransactio();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;

	}

}
