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

import com.app.modal.Customer;
import com.app.service.ICustomerService;
import com.app.util.CustomerUtil;

@Controller
public class CustomerController {
	
	@Autowired
	private ICustomerService service;

	@Autowired
	private CustomerUtil util;
	
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/regCust")
	public String showPage(){
		return "CustomerReg";
	}
	
	@RequestMapping(value="/insertcust",method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer")Customer cust,ModelMap map){
		int custid=service.saveCustomer(cust);
		String message="Record id"+custid;
		map.addAttribute("msg",message);
		return "CustomerReg";
	}
	
	@RequestMapping(value="/viewAllcust")
	public String showallCustomer(ModelMap map){
		List<Customer> custlist=service.getallCustomer();
		map.addAttribute("list",custlist);
		return "CustomerData";
	}
	@RequestMapping(value="/updatecust")
	public String showupdateid(@RequestParam("id")int id,ModelMap map){
		Customer cust=service.getCustomerbyid(id);
		map.addAttribute("custObj",cust);
		return "CustomerUpdate";
	}
	
	@RequestMapping(value="/updateCustomer",method=RequestMethod.POST)
	public String updateCustomer(@ModelAttribute("customer")Customer cust){
		service.updateCustomer(cust);
		return "redirect:viewAllcust";
	}
	
	@RequestMapping(value="/deletecust")
	public String deleteCustomer(@RequestParam("id")int id){
		service.deleteCustomer(id);
		return "redirect:viewAllcust";
	}
	
	@RequestMapping(value="/custexeclexport")
	public String showExcelData(ModelMap map){
		List<Customer> cust=service.getallCustomer();
		map.addAttribute("cust",cust);
		return "custExcelView";
	}
	
	@RequestMapping(value="/custpdfexport")
	public String showPdfData(ModelMap map){
		List<Customer> cust=service.getallCustomer();
		map.addAttribute("cust",cust);
		return "custPdfView";
	}
	
	@RequestMapping(value="/showcustReports")
	public String generateReports(){
		List<Object[]> list=service.getCustomerTypeCount();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBar(path, list);
		return "CustomerReports";
	}
}
