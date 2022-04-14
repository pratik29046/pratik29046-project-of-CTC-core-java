package com.cg.smms.repository;

import javax.persistence.EntityManager;

//import com.cg.smms.entities.Customer;
import com.cg.smms.entities.User;

public class UserRepositoryImpl implements IUserRepository{
	
	//Step1: Start JPA LifeCycle
    private EntityManager entityManager;
    
	
	public UserRepositoryImpl()
	{
		
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		User user= entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
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

			public User searchUser(User user) {
				// TODO Auto-generated method stub
				return null;
			}

}
