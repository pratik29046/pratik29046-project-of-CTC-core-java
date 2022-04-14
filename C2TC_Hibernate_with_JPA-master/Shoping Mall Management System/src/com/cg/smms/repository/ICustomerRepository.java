package com.cg.smms.repository;

import java.util.List;

import com.cg.smms.entities.Customer;
//import com.cg.smms.entities.Item;

public interface ICustomerRepository {
public Customer addCustomer(Customer customer);
public Customer updateCustomer(Customer customer);
public Customer searchCustomer(int id);
public Customer deleteCustomer(int id);

public abstract void beginTransaction();
public abstract void commitTransaction();
//public String orderItem(Item item);
//public String searchItem(List<Item> itemName);





}
