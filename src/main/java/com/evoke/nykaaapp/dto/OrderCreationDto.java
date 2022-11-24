package com.evoke.nykaaapp.dto;

import java.util.Date;

public class OrderCreationDto {
	private Long id;
	private int quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderCreationDto [id=" + id + ", quantity=" + quantity + "]";
	}

}
