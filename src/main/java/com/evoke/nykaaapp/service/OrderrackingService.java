package com.evoke.nykaaapp.service;

import java.util.List;

import com.evoke.nykaaapp.dto.OrderTrackingDto;

public interface OrderrackingService {
	public OrderTrackingDto create(OrderTrackingDto orderTracking);

	public List<OrderTrackingDto> getAll();

	public OrderTrackingDto update(OrderTrackingDto orderTracking);

	public Boolean delete(Long id);

	public OrderTrackingDto getById(Long id);
}
