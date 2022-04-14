package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Employee;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

	// Step 1:Start JPA LifeCycle
	private EntityManager entityManager;
	
	public EmployeeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	//Create Operation
	@Override
	public Employee addEmployee(Employee employee) {
		//persist() method
		entityManager.persist(employee);
		return employee;
	}
    // Update Operation
	@Override
	public Employee updateEmployee(Employee employee) {
		// merge() method
		entityManager.merge(employee); 
		return employee;
	}
     //Read OPeration
	@Override
	public Employee searchEmployee(int id) {
		// find() method
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	//Delete Operation
	@Override
	public boolean deleteEmployee(int id) {
		// remove() method
		Employee employee = entityManager.find(Employee.class, id);
		entityManager.remove(employee);
		return false;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
