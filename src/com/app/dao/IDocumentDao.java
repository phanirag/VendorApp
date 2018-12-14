package com.app.dao;

import java.util.List;

import com.app.modal.Document;

public interface IDocumentDao {

	public void saveDocument(Document doc);
	public List<Object[]> getFileIdAndNames();
	public Document getDocById(int docId);
}
