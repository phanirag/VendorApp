package com.app.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Itemtab")
public class Item {

	@Id
	@Column(name="ItemId")
	private int itemId;
	@Column(name="Name")
	private String itemName;
	@Column(name="Cost")
	private Double itemCost;
	@Column(name="Discount")
	private Double itemDiscount;
	@ManyToOne(targetEntity=Customer.class)
	@JoinColumn(name="cid")
	private Integer custId;
	
	public Item() {
		super();
	}

	public Item(int itemId) {
		this.itemId = itemId;
	}

	public Item(int itemId, String itemName, Double itemCost, Double itemDiscount,
			Integer custId) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemDiscount = itemDiscount;
		this.custId = custId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemCost() {
		return itemCost;
	}

	public void setItemCost(Double itemCost) {
		this.itemCost = itemCost;
	}

	public Double getItemDiscount() {
		return itemDiscount;
	}

	public void setItemDiscount(Double itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemCost=" + itemCost + ", itemDiscount=" + itemDiscount
				+ ", custId=" + custId + "]";
	}
	
	
	
	
	
}
