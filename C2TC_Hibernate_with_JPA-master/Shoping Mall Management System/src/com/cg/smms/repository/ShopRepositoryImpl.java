package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Shop;

public class ShopRepositoryImpl implements IShopRepository {

	//Step 1: Starts JPA LifeCycle
	private EntityManager entityManager;
	
	public ShopRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	//Create operation in repo
	@Override
	public Shop addShop(Shop shop) {
		// persist() method
		entityManager.persist(shop);
		return shop;
	}

	//Update operation in repo
	@Override
	public Shop updateShop(Shop shop) {
		// merge() method
		entityManager.merge(shop);
		return shop;
	}

	
	@Override
	public Shop searchShopById(int id) {
		// find() method
		Shop shop = entityManager.find(Shop.class, id);
 		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		// remove() method
		Shop shop = entityManager.find(Shop.class, id);
		entityManager.remove(shop);
		return false;
	}

	@Override
	public Shop addEmployee(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateEmployee(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop addItem(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}
	
	@Override
	public void beginTransactio() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
