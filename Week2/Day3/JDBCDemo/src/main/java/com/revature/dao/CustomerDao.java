package com.revature.dao;

import java.util.List;

import com.revature.models.Customer;

public interface CustomerDao {
	
	//Should have CRUD operations
	
	//INSERT
	public void insertCustomer(Customer c);

	
	//SELECT statements
	public Customer selectCustomerById(int id);
	public List<Customer> selectAllCustomers();
	
	//UPDATE
	public void updateCustomer(Customer c);
		
	//DELETE
	public void deleteCustomer(Customer c);
	

}
