package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ILocationDao;
import com.app.modal.Location;
@Transactional
@Repository
public class LocationDaoimpl implements ILocationDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveLocation(Location loc) {
		return (int) ht.save(loc);
	}

	@Override
	public void updateLocation(Location loc) {
		ht.update(loc);
	}

	@Override
	public void deleteLocation(int Locid) {
		ht.delete(new Location(Locid));
	}

	@Override
	public Location getLocationbyid(int Locid) {
		return ht.get(Location.class, Locid);
	}

	@Override
	public List<Location> getallLocation() {
		return ht.loadAll(Location.class);
	}

	@Override
	public List<Object[]> getLocationTypeCount() {
		String Hql="Select loctype,count(loctype) from com.app.modal.Location group by loctype";
		List<Object[]> list=ht.find(Hql);
		return list;
	}
	
	

}
