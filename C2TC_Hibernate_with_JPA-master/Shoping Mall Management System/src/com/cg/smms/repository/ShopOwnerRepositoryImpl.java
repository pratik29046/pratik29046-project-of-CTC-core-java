package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.ShopOwner;

public class ShopOwnerRepositoryImpl implements IShopOwnerRepository {

	//Step 1: Starts JPA LifeCycle
			private EntityManager entityManager;
			
			public ShopOwnerRepositoryImpl() {
			entityManager = JPAUtil.getEntityManager();
			}

		//Create operation
		@Override
		public ShopOwner addShopOwner(ShopOwner shopOwner) {
			//persist() method
			entityManager.persist(shopOwner);
			return shopOwner;
		}

		//Update operation
		@Override
		public ShopOwner updateShopOwner(ShopOwner shopOwner) {
			// merge() method
			entityManager.merge(shopOwner);
			return shopOwner;
		}

		//Read operation
		@Override
		public ShopOwner searchShopOwnerById(int id) {
			// find() method
			ShopOwner shopOwner = entityManager.find(ShopOwner.class, id);
			return shopOwner;
		}

		//Delete operation
		@Override
		public boolean deleteShopOwner(int id) {
			// remove() method
			ShopOwner shopOwner = entityManager.find(ShopOwner.class, id);
			entityManager.remove(shopOwner);
			return false;
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
