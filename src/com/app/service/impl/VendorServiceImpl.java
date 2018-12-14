package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IvendorDao;
import com.app.modal.Vendor;
import com.app.service.IVendorService;

@Service
public class VendorServiceImpl implements IVendorService {

	@Autowired
	private IvendorDao dao;
	
	@Override
	public int saveVendor(Vendor ven) {
		return dao.saveVendor(ven);
	}

	@Override
	public void updateVendor(Vendor ven) {
		dao.updateVendor(ven);
	}

	@Override
	public void deleteVendor(int venid) {
		dao.deleteVendor(venid);
	}

	@Override
	public Vendor getVendorbyid(int venid) {
		return dao.getVendorbyid(venid);
	}

	@Override
	public List<Vendor> getallVendor() {
		return dao.getallVendor();
	}

	@Override
	public List<Object[]> getVendorTypeCount() {
		return dao.getVendorTypeCount();
	}

}
