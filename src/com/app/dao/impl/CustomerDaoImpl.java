package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.modal.Customer;

@Transactional
@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveCustomer(Customer cust) {
		return (int) ht.save(cust);
	}

	@Override
	public void updateCustomer(Customer cust) {
		ht.update(cust);
	}

	@Override
	public void deleteCustomer(int custid) {
		ht.delete(new Customer(custid));
	}

	@Override
	public Customer getCustomerbyid(int custid) {
		return ht.get(Customer.class, custid);
	}

	@Override
	public List<Customer> getallCustomer() {
		return ht.loadAll(Customer.class);
	}

	@Override
	public List<Object[]> getCustomerTypeCount() {
		String Hql="Select custType,count(custType) from com.app.modal.Customer group by custType";
		List<Object[]> list=ht.find(Hql);
		return list;
	}

}
