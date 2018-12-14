package com.app.service;

import java.util.List;

import com.app.modal.Document;

public interface IDocumentService {

	public void saveDocument(Document doc);
	public List<Object[]> getFileIdAndNames();
	public Document getDocById(int docId);
}
