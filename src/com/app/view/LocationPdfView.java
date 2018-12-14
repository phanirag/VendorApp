package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.modal.Location;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public class LocationPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("content-Disposition", "attachment;filename=LOCS.pdf");
		List<Location> locs=(List<Location>) map.get("locs");
		
		Paragraph p=new Paragraph("Welcome to the Location Pdf");
		
		PdfPTable t=new PdfPTable(5);
		t.addCell("ID");
		t.addCell("Name");
		t.addCell("Code");
		t.addCell("Type");
		t.addCell("Note");
		
		for(Location loc:locs){
			t.addCell(loc.getLocid()+" ");
			t.addCell(loc.getLocName());
			t.addCell(loc.getLoccode());
			t.addCell(loc.getLoctype());
			t.addCell(loc.getLocdesc());
		}
		doc.add(p);
		doc.add(t);
		doc.add(new Paragraph(new Date().toString()));
	}
}
