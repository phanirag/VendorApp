package com.app.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loctab")
public class Location {

	@Id
	@Column(name="lid")
	private int locid;
	@Column(name="lName")
	private String locName;
	@Column(name="lcode")
	private String loccode;
	@Column(name="ltype")
	private String loctype;
	@Column(name="ldesc")
	private String locdesc;

	public Location() {
		super();
	}

	public Location(int locid) {
		this.locid = locid;
	}

	public Location(int locid, String locName, String loccode, String loctype,
			String locdesc) {
		this.locid = locid;
		this.locName = locName;
		this.loccode = loccode;
		this.loctype = loctype;
		this.locdesc = locdesc;
	}

	public int getLocid() {
		return locid;
	}

	public void setLocid(int locid) {
		this.locid = locid;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public String getLoccode() {
		return loccode;
	}

	public void setLoccode(String loccode) {
		this.loccode = loccode;
	}

	public String getLoctype() {
		return loctype;
	}

	public void setLoctype(String loctype) {
		this.loctype = loctype;
	}

	public String getLocdesc() {
		return locdesc;
	}

	public void setLocdesc(String locdesc) {
		this.locdesc = locdesc;
	}

	@Override
	public String toString() {
		return "Location [locid=" + locid + ", locName=" + locName
				+ ", loccode=" + loccode + ", loctype=" + loctype
				+ ", locdesc=" + locdesc + "]";
	}





}
