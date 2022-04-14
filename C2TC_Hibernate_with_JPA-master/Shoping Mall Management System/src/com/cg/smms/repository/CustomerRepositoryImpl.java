package com.cg.smms.repository;

//import java.util.List;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Customer;
//import com.cg.smms.entities.Item;
//import com.cg.smms.entities.OrderDetails;

public class CustomerRepositoryImpl implements ICustomerRepository {

	
	//Step1: Start JPA LifeCycle
    private EntityManager entityManager;
    
	
	public CustomerRepositoryImpl()
	{
		
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer= entityManager.find(Customer.class, id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		Customer customer= entityManager.find(Customer.class, id);
		entityManager.remove(customer);
		return customer;
		
	}

	//................ .$ Commit Transaction $.......................................................

		@Override
		public void commitTransaction()
		{
			entityManager.getTransaction().commit();
		}
		
	//................ .$ Begin Transaction $.......................................................

		@Override
		public void beginTransaction()
		{
			entityManager.getTransaction().begin();
		}
/*
		@Override
		public void orderItem(Item item) {
			// TODO Auto-generated method stub
			
		}

		

		@Override
		public String searchItem(List<Item> itemName) {
			entityManager.find(Item.class,itemName);
			return null;
		}

		@Override
		public String orderItem(Item item) {
			entityManager.find(Item.class,item);
		    entityManager.persist(item);
			return null;
		}

		
*/
}
