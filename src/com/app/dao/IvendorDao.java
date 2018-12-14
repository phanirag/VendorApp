package com.app.dao;

import java.util.List;

import com.app.modal.Vendor;

public interface IvendorDao {
	

	public int saveVendor(Vendor ven);
	public void updateVendor(Vendor ven);
	public void deleteVendor(int venid);
	public Vendor getVendorbyid(int venid);
	public List<Vendor> getallVendor();
	public List<Object[]> getVendorTypeCount();
}
