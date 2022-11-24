package com.evoke.nykaaapp.service;

import java.util.List;

import com.evoke.nykaaapp.dto.ItemDto;
import com.evoke.nykaaapp.dto.OrderCreationDto;

public interface OrderCreationService {

	public OrderCreationDto create(OrderCreationDto orderCreationDto);

	public List<OrderCreationDto> getAll();

//	public OrderCreationDto update(OrderCreationDto orderCreationDto);
//
//	public Boolean delete(Long id);
//
//	public OrderCreationDto getById(Long id);

//	public OrderCreationDto assign(Long itemId, Long priceId);
}
