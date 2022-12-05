package com.evoke.nykaaapp.dto;

import java.util.List;

public class OrderDto {
	private Long orderId;
	private Long itemId;
	private int quantityOrdered;
	private String OrderedDate;
	private String DeliveryDate;
	private Long addressId;
	private Long customerId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public String getOrderedDate() {
		return OrderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		OrderedDate = orderedDate;
	}

	public String getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", itemId=" + itemId + ", quantityOrdered=" + quantityOrdered
				+ ", OrderedDate=" + OrderedDate + ", DeliveryDate=" + DeliveryDate + ", addressId=" + addressId
				+ ", customerId=" + customerId + "]";
	}

//	private List<OrderItemDto> orderItems;
//
//	public List<OrderItemDto> getOrderItems() {
//		return orderItems;
//	}
//
//	public void setOrderItems(List<OrderItemDto> orderItems) {
//		this.orderItems = orderItems;
//	}

}
