package com.app.service;

import java.util.List;

import com.app.modal.Item;

public interface IItemService {

	public int saveItem(Item Item);
	public void updateItem(Item Item);
	public void deleteItem(int Itemid);
	public Item getItembyid(int Itemid);
	public List<Item> getallItem();
	public List<Integer> getCustId();

}
