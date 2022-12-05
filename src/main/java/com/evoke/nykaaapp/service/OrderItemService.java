package com.evoke.nykaaapp.service;

import java.util.List;

import com.evoke.nykaaapp.dto.OrderItemDto;

public interface OrderItemService {

	public OrderItemDto create(OrderItemDto orderItemDto);

	public List<OrderItemDto> getAll();

//	public OrderCreationDto update(OrderCreationDto orderCreationDto);
//
//	public Boolean delete(Long id);
//
//	public OrderCreationDto getById(Long id);

//	public OrderCreationDto assign(Long itemId, Long priceId);
}
