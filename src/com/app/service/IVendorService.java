package com.app.service;

import java.util.List;

import com.app.modal.Vendor;

public interface IVendorService {

	public int saveVendor(Vendor ven);
	public void updateVendor(Vendor ven);
	public void deleteVendor(int venid);
	public Vendor getVendorbyid(int venid);
	public List<Vendor> getallVendor();
	public List<Object[]> getVendorTypeCount();
}
