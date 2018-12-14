package com.app.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.modal.Vendor;
import com.app.service.IVendorService;
import com.app.util.VendorUtil;

@Controller
public class VendorController {

	@Autowired
	private IVendorService service;
	
	@Autowired
	private VendorUtil util;
	
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/regVen")
	public String showPage(){
		return "VendorReg";
	}
	
	@RequestMapping(value="/insertven",method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("vendor")Vendor ven,ModelMap map){
		int venid=service.saveVendor(ven);
		String message="Record id"+venid;
		map.addAttribute("msg",message);
		return "VendorReg";
	}
	
	@RequestMapping(value="/viewAllVendor")
	public String getallVendor(ModelMap map){
		List<Vendor> list=service.getallVendor();
		map.addAttribute("list",list);
		return "VendorData";
	}
	
	@RequestMapping(value="/updateven")
	public String getupdateid(@RequestParam("id")int id,ModelMap map){
		Vendor ven=service.getVendorbyid(id);
		map.addAttribute("venObj",ven);
		return "VendorUpdate";
	}
	
	@RequestMapping(value="/updatedVendor",method=RequestMethod.POST)
	public String updateVendor(@ModelAttribute("vendor")Vendor ven){
		service.updateVendor(ven);
		return "redirect:viewAllVendor";
	}
	
	@RequestMapping(value="/deleteven")
	public String deletevendor(@RequestParam("id")int id){
		service.deleteVendor(id);
		return "redirect:viewAllVendor";
	}
	
	@RequestMapping(value="/Venexeclexport")
	public String showExcelData(ModelMap map){
		List<Vendor> ven=service.getallVendor();
		map.addAttribute("ven",ven);
		return "VenExcelView";
	}
	
	@RequestMapping(value="/Venpdfexport")
	public String showPdfData(ModelMap map){
		List<Vendor> Ven=service.getallVendor();
		map.addAttribute("Ven",Ven);
		return "VenPdfView";
	}
	
	@RequestMapping(value="/showVenReports")
	public String generateReports(){
		List<Object[]> list=service.getVendorTypeCount();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBar(path, list);
		return "VendorReports";
	}
	
}
