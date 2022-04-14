package com.cg.smms.service;

//import com.cg.smms.repository.CustomerRepositoryImpl;
//import com.cg.smms.repository.ICustomerRepository;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.UserRepositoryImpl;
import com.cg.smms.entities.User;

public class UserServiceImpl implements IUserService {
	
	//Step 1:Establishing connection between Service and Repository
			private IUserRepository dao;
			
			public UserServiceImpl() 
			{
				dao=new UserRepositoryImpl();
					}

			//Step 2: Service calls to perform CRUD Operation
			


	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

}
