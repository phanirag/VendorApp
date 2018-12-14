package com.app.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventab")
public class Vendor {

	@Id
	@Column(name="venid")
	private int vendorid;
	@Column(name="vencode")
	private String vendorcode;
	@Column(name="venname")
	private String vendorname;
	@Column(name="ventype")
	private String vendortype;
	@Column(name="addr")
	private String vendoraddr;
	@Column(name="idtype")
	private String idtype;
	@Column(name="idname")
	private String idname;
	@Column(name="dsc")
	private String dsc;
	
	public Vendor() {
		super();
	}

	public Vendor(int vendorid) {
		this.vendorid = vendorid;
	}

	public Vendor(int vendorid, String vendorcode, String vendorname,
			String vendortype, String vendoraddr, String idtype, String idname,
			String dsc) {
		this.vendorid = vendorid;
		this.vendorcode = vendorcode;
		this.vendorname = vendorname;
		this.vendortype = vendortype;
		this.vendoraddr = vendoraddr;
		this.idtype = idtype;
		this.idname = idname;
		this.dsc = dsc;
	}

	public int getVendorid() {
		return vendorid;
	}

	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}

	public String getVendorcode() {
		return vendorcode;
	}

	public void setVendorcode(String vendorcode) {
		this.vendorcode = vendorcode;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getVendortype() {
		return vendortype;
	}

	public void setVendortype(String vendortype) {
		this.vendortype = vendortype;
	}

	public String getVendoraddr() {
		return vendoraddr;
	}

	public void setVendoraddr(String vendoraddr) {
		this.vendoraddr = vendoraddr;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIdname() {
		return idname;
	}

	public void setIdname(String idname) {
		this.idname = idname;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	@Override
	public String toString() {
		return "Vendor [vendorid=" + vendorid + ", vendorcode=" + vendorcode
				+ ", vendorname=" + vendorname + ", vendortype=" + vendortype
				+ ", vendoraddr=" + vendoraddr + ", idtype=" + idtype
				+ ", idname=" + idname + ", dsc=" + dsc + "]";
	}
	
	
	
	

	




}
