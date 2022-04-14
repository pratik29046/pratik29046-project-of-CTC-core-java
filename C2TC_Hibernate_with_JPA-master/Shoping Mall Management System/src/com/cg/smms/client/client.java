package com.cg.smms.client;

import com.cg.smms.entities.*;
import com.cg.smms.service.*;
import com.cg.smms.repository.*;
import com.cg.smms.exception.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class client {

	public static void main(String[] args) {

//------------------------------ CRUD Operation calling activity ---------------------------------------
		
////		For Shop Entity => Working
////		Shop shop = new Shop();
////		IShopService service = new ShopServiceImpl();
//		
////		CRUD FOR SHOP =>
//		//Create
////		shop.setShopId(104);
////		shop.setShopCategory("Electronics");
////		shop.setShopEmployeeID(05);
////		shop.setShopName("Vijay Sales");
////		shop.setCustomers("Sumit Mahajan");
////		shop.setShopStatus("Product Shipped");
////		shop.setShopOwner("Vijay Singh");
////		shop.setLeaseStatus("Done");
////		
////		service.addShop(shop);
////		System.out.println("Data added successfully");
//		
//		
//		/*Retrieve
//		shop = service.searchShopById(100);
//		System.out.println("ID : "+shop.getShopID());
//		System.out.println("Customer :"+shop.getCustomers());
//		System.out.println("Shop owner :"+shop.getShopOwner());
//		*/
//		
//		/*Update
//		shop = service.searchShopById(100);
//		shop.setShopStatus("Done");
//		service.updateShop(shop);
//		System.out.println("Update is successful");
//		*/
//		
//		/*Delete
//		shop = service.searchShopById(102);
//		service.deleteShop(102);
//		System.out.println("Delete successful");
//		*/
////		********************************************************************************************************
//////		For Employee Entity => Working
////		Employee employee = new Employee();
////		IEmployeeService service1 = new EmployeeServiceImpl();
//		
////		CRUD FOR EMPLOYEE =>
//		/*Create
//		employee.setId(1);
//		employee.setName("Sameer");
//		employee.setDob("14/11/2000");
//		employee.setSalary(2000f);
//		employee.setAddress("Panvel");
//		employee.setDesignation("Employee");
//		employee.setShop("DMart");
//		 
//		service1.addEmployee(employee);
//		System.out.println("Data added successfully");
//		*/
//		
//		/*retrieve
//		employee = service1.searchEmployee(1);
//		System.out.println("ID is:"+employee.getId());
//		System.out.println("Name is:"+employee.getName());
//		System.out.println("Designation is:"+employee.getDesignation());
//		*/
//		
//		/*update
//		employee = service1.searchEmployee(1); 
//		employee.setDob("14/11/2000");
//		service1.updateEmployee(employee);
//		System.out.println("Successfully updated");
//		*/
//		
//		/*Delete
//	  	employee = service1.searchEmployee(1); 
//	  	service1.deleteEmployee(1);
//	  	System.out.println("Successfully deleted");
//		*/
////		******************************************************************************************************
////		For ShopOwner Entity => Working
////		ShopOwner shopOwner = new ShopOwner();
////		ShopOwnerRepositoryImpl sos = new ShopOwnerRepositoryImpl();
//	
////		CRUD FOR SHOPOWNER =>
//		/*Create
//		LocalDate dob = LocalDate.of(2022, 1, 1);
//		shopOwner.setName("Sahil");
//		shopOwner.setDob(dob);
//		shopOwner.setAddress("New Panvel");
//		sos.addShopOwner(shopOwner);
//		sos.beginTransactio();
//		sos.commitTransaction();
//		System.out.println("Data added successfully");
//		*/
//		/*Retrieve
//		shopOwner = sos.searchShopOwnerById(1);
//		System.out.println("ID : "+shopOwner.getId());
//		System.out.println("Shop Owner name : "+shopOwner.getName());
//		*/
//		//Update
////		shopOwner = sos.searchShopOwnerById(101);
////		shopOwner.setAddress("Kolhapur");
////		sos.updateShopOwner(shopOwner);
////		System.out.println("Successfully updated ");
//		
//		/*Delete
//		shopOwner = sos.searchShopOwnerById(1);
//		sos.deleteShopOwner(1);
//		System.out.println("Successfully deleted");
//		*/
////	********************************************************************************************************	
////		For Item Entity => 
////		Item item = new Item();
////		ItemRepositoryImpl item_service_impl = new ItemRepositoryImpl();
//		
////		CRUD For ITEM =>
//		//Create
////		LocalDate date_manu = LocalDate.of(2021, 10, 12);
////		LocalDate date_expiry = LocalDate.of(2021, 1, 20);
////		item.setId(01);
////		item.setName("Watch");
////		item.setManufacturing(date_manu);
////		item.setExpiry(date_expiry);
////		item.setPrice(2150);
////		item.setCategory("Accessories");
////		item_service_impl.beginTransaction();
////		item_service_impl.deleteItem(2);
////		item_service_impl.commitTransaction();
//		 
////		service3.addItem(item);
////		System.out.println("Data added successfully");
//		
//		/*Retrieve
//		item = service3.searchItemById(01);
//		System.out.println("ID : "+item.getId());
//		System.out.println("Item name : "+item.getName());
//		*/
//		/*Update
//		item = service3.searchItemById(01);
//		item.setName("iphone 13 max pro");
//		item.setPrice(160000);
//		item.setCategory("Mobile");
//		System.out.println("Data Successfully updated");
//		*/
//		/*Delete
//		item = service3.searchItemById(01);
//		service3.deleteItem(01);
//		System.out.println("Data successfully deleted");
//		*/		
////	********************************************************************************************************
////		For User Entity => Working
////		User user = new User();
////		IUserService service4 = new UserServiceImpl();
////		CRUD For USER =>
////		Create
//		
////		user.setName("Ritesh");
////		user.setPassword("ritesh123");
////		user.setType("Customer");
////		service4.addUser(user);
////		System.out.println("Data added successfully");
////		Retrieve
////		user = service4.searchUser(1001);
////		System.out.println("ID : "+user.getId());
////		System.out.println("Name : "+user.getName());
////		Update
////		user = service4.searchUser(1001);
////		user.setName("Ram");
////		service4.updateUser(user);
////		System.out.println("Data Successfully updated");
////		Delete
////		user = service4.searchUser(1001);
////		service4.deleteUser(1001);
////		System.out.println("Data successfully deleted");
////	********************************************************************************************************	
////		For Customer Entity =>.
////		CustomerRepositoryImpl cust_repo_impl = new CustomerRepositoryImpl();
////		CustomerServiceImpl cust_service_impl = new CustomerServiceImpl();
////		Customer customer = new Customer();
//		
////		CRUD for CUSTOMER =>
////		customer.setId(1);
////		customer.setName("Sudipt");
////		customer.setPhone("9876658869");
////		customer.setEmail("abc@gmail.com");
////		cust_service_impl.beginTransaction();
////		customer = cust_service_impl.searchCustomer(4);
////		System.out.println(customer.getId() + customer.getName());
////		cust_service_impl.deleteCustomer(1);
////		cust_service_impl.commitTransaction();
////	********************************************************************************************************			
//		Mall CRUD operations
		
//		MallRepositoryImpl mri = new MallRepositoryImpl();
//		Mall mall =new Mall();
//		
//		mall.setMallName("Orion");
//		mall.setLocation("Panvel");
//		mall.setCategories("All");
//		mri.beginTransaction();
//		mri.addMall(mall);
//		mri.commitTransaction();
////	********************************************************************************************************		
//		MallAdmin CRUD operation
		
//		MallAdminRepositoryImpl mar = new MallAdminRepositoryImpl();
//		MallAdmin mall_admin = new MallAdmin();
//		mall_admin.setId(1);
//		mall_admin.setName("Vijay");
//		mall_admin.setPassword("pass@321");
//		mall_admin.setPhone("9136504468");
//		mar.beginTransaction();
//		mar.updateMallAdmin(mall_admin);
//		mar.commitTransaction();
////	********************************************************************************************************		
//		OrderDetails CRUD operation
//		
//		OrderRepositoryImpl ori = new OrderRepositoryImpl();
//		OrderDetails order_details = new OrderDetails();
//		LocalDate date = LocalDate.now();
//		order_details.setDateOfPurchase(date);
//		order_details.setTotal(1500);
//		order_details.setPaymentMode("PhonePe");
//		ori.beginTransaction();
//		ori.addOrderDetails(order_details);
//		ori.commitTransaction();
//		
//		*********************************** ASSOSIATION ND MAPPING *******************************************
//		
//		------------------- Between Shop and Employee module ------------------------ Working
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
//		EntityManager em = factory.createEntityManager();
//	
//		em.getTransaction().begin();
//	
////		Creating Shop
//		Shop shop1 = new Shop();
//		shop1.setShopCategory("Clothing");
//		shop1.setShopName("Myntra");
//		shop1.setCustomers("All");
//		shop1.setShopStatus("24/7 Hrs Open");
////		shop1.setShopowner("Sahil JL");
//		shop1.setLeaseStatus("Nill");
//	
//		
////	Creating multiple Employees
//		Employee emp1 = new Employee();
//		emp1.setName("Vijay");
//		LocalDate emp_dob = LocalDate.of(2000, 11, 14);
//		emp1.setDob(emp_dob);
//		emp1.setSalary(10000);
//		emp1.setAddress("Belapur");
//		emp1.setDesignation("Office Boy");
//		
//		
//		Employee emp2 = new Employee();
//		emp2.setName("Vijay");
//		LocalDate emp_dob1 = LocalDate.of(2001, 1, 14);
//		emp2.setDob(emp_dob1);
//		emp2.setSalary(100000);
//		emp2.setAddress("Vashi");
//		emp2.setDesignation("SDE");
//		
//		
//		List<Employee> emp_list = new ArrayList<Employee>();
//		emp_list.add(emp1);
//		emp_list.add(emp2);
//		
////		Injecting multiple employees in shop table 
//		shop1.setEmployees(emp_list);
//		
//		shop1.setEmployee1(emp1);
//		shop1.setEmployee1(emp2);
//		
////		Injecting shop id to employees 
//		emp1.setShop(shop1);
//		emp2.setShop(shop1);
//		
////		Persist data
//		em.persist(shop1);
//		em.persist(emp1);
//		em.persist(emp2);
//		em.getTransaction().commit();
//
//		System.out.println("DONE");
//		------------------- Between Shop and Item module ------------------------ Working

////		Creating Item1
//		Item item1 = new Item();
//		item1.setItem_name("Chinos");
//		LocalDate manu_date = LocalDate.of(2021, 10, 20);
//		LocalDate expiry_date = LocalDate.of(2026, 12, 31);
//		item1.setManufacturing_dayte(manu_date);
//		item1.setExpiry_date(expiry_date);
//		item1.setPrice(779);
//		item1.setCategory("Mens Bottomwear");
//		
////		Creating Item2
//		Item item2 = new Item();
//		item2.setItem_name("Turtle Neck T-shirt");
//		LocalDate manu_date_1 = LocalDate.of(2022, 1, 5);
//		LocalDate expiry_date_1 = LocalDate.of(2025, 10, 1);
//		item2.setManufacturing_dayte(manu_date_1);
//		item2.setExpiry_date(expiry_date_1);
//		item2.setPrice(549);
//		item2.setCategory("Mens Topmwear");
//		
//		List<Item> item_list = new ArrayList<Item>();
//		item_list.add(item1);
//		item_list.add(item2);
//		
////		Injecting multiple items in shop table 
//		shop1.setItems(item_list);
//		
////		Injecting shop id to items
//		item1.setShop(shop1);
//		item2.setShop(shop1);
//		
////		Persist data
//		em.persist(shop1);
//		em.persist(item1);
//		em.persist(item2);
//		em.getTransaction().commit();
//		
//		System.out.println("DONE");
//		em.close();
//		factory.close();
		
//		------------------- Between Shop and Order details || Customer and Order details module ------------------------ Working

//		Creating customer
//		Customer c1 = new Customer();
//		c1.setName("Sumit");
//		c1.setOrder_id(1001);
//		c1.setPhone("9004188966");
//		c1.setEmail("sumit546@gmail.com");
//		
////		c1.setOrderDetails_1(od1);
////		c1.setOrderDetails_1(od2);
////		Creating Oder details1
//		OrderDetails od1 = new OrderDetails();
//		LocalDate purchase_date = LocalDate.of(2022, 3, 25);
//		od1.setDateOfPurchase(purchase_date);
//		od1.setTotal(1328);
//		od1.setPaymentMode("Paytm");
//		od1.setShop(shop1);
////		od1.setCustomer_1(c1);.
//		od1.setCustomer(c1);
//		
////		Creating Oder details1
//		OrderDetails od2 = new OrderDetails();
//		LocalDate purchase_date_1 = LocalDate.of(2022, 2, 25);
//		od2.setDateOfPurchase(purchase_date_1);
//		od2.setTotal(1328);
//		od2.setPaymentMode("G-Pay");
//		od2.setShop(shop1);
////		od2.setCustomer_1(c1);
//		od2.setCustomer(c1);
//		
//		List<OrderDetails> orderDetails_list = new ArrayList<OrderDetails>();
//		orderDetails_list.add(od1);
//		orderDetails_list.add(od2);
//		
//		c1.setOrderDetails(orderDetails_list);
//		
////		Persist data
//		em.persist(shop1);
//		em.persist(od1);
//		em.persist(od2);
//		em.persist(c1);
//		em.getTransaction().commit();
//		
		System.out.println("DONE");
//		em.close();
//		factory.close();
//		------------------- Between User and Shop Owner, Mall admin and Customer respectively module ------------------------ Working
		
////		Creation user
//		User user1 = new User();
//		user1.setName("Sahil Lamture");
//		user1.setType("Mall Admin");
//		user1.setPassword("sahil123");
//		
////		Creating shop owner
//		ShopOwner so1 = new ShopOwner();
//		so1.setName("Sahil Lamture");
//		LocalDate dob = LocalDate.of(2022, 1, 1);
//		so1.setDob(dob);
//		so1.setAddress("Panvel");
//		so1.setShop_id(101);
//		
////		Creating mall admin
//		MallAdmin ma1 = new MallAdmin();
//		ma1.setName("Sushil");
//		ma1.setPassword("sushil123");
//		ma1.setMall_name("Orion Mall");
//		ma1.setPhone("9594385661");
//		
////		Creating customer
//		Customer c1 = new Customer();
//		c1.setName("Sumit");
//		c1.setOrder_id(1001);
//		c1.setPhone("9004188966");
//		c1.setEmail("sumit546@gmail.com");
//		
//		c1.setOrderDetails(orderDetails_list);
//		em.persist(c1);
////		c1.setOrderDetails_1(od1);
////		c1.setOrderDetails_1(od2);
//		
////		Injecting data to FK column
//		user1.setShopowner(so1);
//		user1.setMalladmin(ma1);
//		user1.setCustomer(c1);
//		
////		Persist data
//		em.persist(user1);
//		em.getTransaction().commit();
//	
//		System.out.println("DONE");
		
//		em.close();
//		factory.close();
	}
	

}
