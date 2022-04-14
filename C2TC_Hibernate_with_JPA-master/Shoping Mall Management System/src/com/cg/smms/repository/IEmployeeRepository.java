package com.cg.smms.repository;

import com.cg.smms.entities.Employee;

public interface IEmployeeRepository {

	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(int id);
	public boolean  deleteEmployee(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
