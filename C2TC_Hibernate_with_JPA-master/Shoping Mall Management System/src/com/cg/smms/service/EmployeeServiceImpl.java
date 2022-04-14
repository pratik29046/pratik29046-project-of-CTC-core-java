package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.EmployeeRepositoryImpl;
import com.cg.smms.repository.IEmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService {

	//Step 1:Establishing  Connection Between Service and repo
	private IEmployeeRepository dao;
	
	public EmployeeServiceImpl() {
		
		dao =new EmployeeRepositoryImpl();
	}
	
	//Step 2: Service call to perform CRUD operation
	@Override
	public Employee addEmployee(Employee employee) {
		
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
		
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		return false;
	}

}
