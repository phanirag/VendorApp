package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.modal.Document;
import com.app.modal.Vendor;


public class VendorPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("content-Disposition", "attachment;filename=Vendor.pdf");
		List<Vendor> Ven=(List<Vendor>) map.get("Ven");
		
		Paragraph p=new Paragraph("Welcome to the Vendor Pdf");
		
		PdfPTable t=new PdfPTable(7);
		t.addCell("ID");
		t.addCell("Code");
		t.addCell("Name");
		t.addCell("Type");
		t.addCell("Address");
		t.addCell("ID Type");
		t.addCell("ID Name");
		
		for(Vendor v:Ven){
			t.addCell(v.getVendorid()+" ");
			t.addCell(v.getVendorcode());
			t.addCell(v.getVendorname());
			t.addCell(v.getVendortype());
			t.addCell(v.getVendoraddr());
			t.addCell(v.getIdtype());
			t.addCell(v.getIdname());
		}
		doc.add(p);
		doc.add(t);
		doc.add(new Paragraph(new Date().toString()));
	}
}
