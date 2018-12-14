package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IvendorDao;
import com.app.modal.Vendor;
@Transactional
@Repository
public class VendorDaoImpl implements IvendorDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveVendor(Vendor ven) {
		return (Integer) ht.save(ven);
	}

	@Override
	public void updateVendor(Vendor ven) {
		ht.update(ven);
	}

	@Override
	public void deleteVendor(int venid) {
		ht.delete(new Vendor(venid));
	}

	@Override
	public Vendor getVendorbyid(int venid) {
		return ht.get(Vendor.class, venid);
	}

	@Override
	public List<Vendor> getallVendor() {
		return ht.loadAll(Vendor.class);
	}

	@Override
	public List<Object[]> getVendorTypeCount() {
		String Hql="Select vendortype,count(vendortype) from com.app.modal.Vendor group by vendortype";
		List<Object[]> list=ht.find(Hql);
		return list;
	}

}
