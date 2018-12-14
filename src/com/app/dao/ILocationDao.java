package com.app.dao;

import java.util.List;

import com.app.modal.Location;

public interface ILocationDao {

	public int saveLocation(Location loc);
	public void updateLocation(Location loc);
	public void deleteLocation(int Locid);
	public Location getLocationbyid(int Locid);
	public List<Location> getallLocation();
	public List<Object[]> getLocationTypeCount();
}
