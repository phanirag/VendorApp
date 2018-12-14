package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.modal.Vendor;

public class VendorExeclView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("content-Disposition", "attachment;filename=VENDOR.docx");
		List<Vendor> list=(List<Vendor>) map.get("ven");
		HSSFSheet sheet=book.createSheet("Vendor");
		setHead(sheet);
		setBody(sheet, list);
	}

	private void setHead(HSSFSheet sheet){
		int rownum=0;
		HSSFRow row=sheet.createRow(rownum);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Code");
		row.createCell(2).setCellValue("Name");
		row.createCell(3).setCellValue("Type");
		row.createCell(4).setCellValue("Address");
		row.createCell(5).setCellValue("ID Type");
		row.createCell(6).setCellValue("ID Name");
		row.createCell(7).setCellValue("Desc");
	}
	
	private void setBody(HSSFSheet sheet,List<Vendor> ven){
		int rownum=1;
		for(Vendor v:ven){
		HSSFRow row=sheet.createRow(rownum++);
		row.createCell(0).setCellValue(v.getVendorid());
		row.createCell(1).setCellValue(v.getVendorcode());
		row.createCell(2).setCellValue(v.getVendorname());
		row.createCell(3).setCellValue(v.getVendortype());
		row.createCell(4).setCellValue(v.getVendoraddr());
		row.createCell(5).setCellValue(v.getIdtype());
		row.createCell(6).setCellValue(v.getIdname());
		row.createCell(7).setCellValue(v.getDsc());
		}
	}
}
