package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.modal.Location;
import com.app.service.ILocationService;

@Service
public class LocationServiceimpl implements ILocationService {

	@Autowired
	private ILocationDao dao;

	@Override
	public int saveLocation(Location loc) {
		return dao.saveLocation(loc);
	}

	@Override
	public void updateLocation(Location loc) {
		dao.updateLocation(loc);
	}

	@Override
	public void deleteLocation(int Locid) {
		dao.deleteLocation(Locid);
	}

	@Override
	public Location getLocationbyid(int Locid) {
		return dao.getLocationbyid(Locid);
	}

	@Override
	public List<Location> getallLocation() {
		return dao.getallLocation();
	}
	
	@Override
	public List<Object[]> getLocationTypeCount() {
		return dao.getLocationTypeCount();	
	}
}
