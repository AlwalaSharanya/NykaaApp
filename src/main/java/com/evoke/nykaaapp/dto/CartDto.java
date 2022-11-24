package com.evoke.nykaaapp.dto;

import javax.persistence.Column;

public class CartDto {
	private Long id;
	private String itemName;
	private int itemCost;
	private int quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartDto [id=" + id + ", itemName=" + itemName + ", itemCost=" + itemCost + ", quantity=" + quantity
				+ "]";
	}
	
}
