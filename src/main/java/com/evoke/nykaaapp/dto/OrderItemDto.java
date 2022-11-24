package com.evoke.nykaaapp.dto;

public class OrderItemDto {
	private Long id;
	private ItemDto itemdto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ItemDto getItemdto() {
		return itemdto;
	}
	public void setItemdto(ItemDto itemdto) {
		this.itemdto = itemdto;
	}
	@Override
	public String toString() {
		return "OrderItemDto [id=" + id + ", itemdto=" + itemdto + "]";
	}
	
}
