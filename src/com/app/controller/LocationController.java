package com.app.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.modal.Location;
import com.app.service.ILocationService;
import com.app.util.LocationUtil;

@Controller
public class LocationController {
	
	@Autowired
	private ILocationService service;

	@Autowired
	private LocationUtil util;
	
	@Autowired
	private ServletContext context;
	
	@Autowired
	private AnnotationSessionFactoryBean sf;
		
	@RequestMapping(value="/DBCheck")
	public String ConnectionStatus(ModelMap map){
		try {
			sf.getDataSource().getConnection();
			map.addAttribute("DB","Connection Opened");
		} catch (SQLException e) {
			map.addAttribute("DB","Error in Connecting to Database");
			e.printStackTrace();
		}
		return "DBCheck";
	}
	
	@RequestMapping("/regLoc")
	public String showPage(){
		return "LocationReg";
	}
	
	@RequestMapping(value="/insertloc",method=RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location")Location loc,ModelMap map){
		int Locid=service.saveLocation(loc);
		String message="Record id"+Locid;
		map.addAttribute("msg",message);
		return "LocationReg";
	}
	
	@RequestMapping(value="/viewAll")
	public String showallLocation(ModelMap map){
		List<Location> loclist=service.getallLocation();
		map.addAttribute("list",loclist);
		return "LocationData";
	}
	@RequestMapping(value="/update")
	public String showupdateid(@RequestParam("id")int id,ModelMap map){
		Location loc=service.getLocationbyid(id);
		map.addAttribute("Locobj",loc);
		return "LocationUpdate";
	}
	
	@RequestMapping(value="/updateLocation",method=RequestMethod.POST)
	public String updateLocation(@ModelAttribute("location")Location loc){
		service.updateLocation(loc);
		return "redirect:viewAll";
	}
	
	@RequestMapping(value="/delete")
	public String deleteLocation(@RequestParam("id")int id){
		service.deleteLocation(id);
		return "redirect:viewAll";
	}
	
	@RequestMapping(value="/locexeclexport")
	public String showExcelData(ModelMap map){
		List<Location> locs=service.getallLocation();
		map.addAttribute("locs",locs);
		return "LocExcelView";
	}
	
	@RequestMapping(value="/locpdfexport")
	public String showPdfData(ModelMap map){
		List<Location> locs=service.getallLocation();
		map.addAttribute("locs",locs);
		return "LocPdfView";
	}
	
	@RequestMapping(value="/showLocReports")
	public String generateReports(){
		List<Object[]> list=service.getLocationTypeCount();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBar(path, list);
		return "LocationReports";
	}
}
