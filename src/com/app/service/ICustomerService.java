package com.app.service;

import java.util.List;

import com.app.modal.Customer;
import com.app.modal.Location;

public interface ICustomerService {

	public int saveCustomer(Customer cust);
	public void updateCustomer(Customer cust);
	public void deleteCustomer(int custid);
	public Customer getCustomerbyid(int custid);
	public List<Customer> getallCustomer();
	public List<Object[]> getCustomerTypeCount();
}