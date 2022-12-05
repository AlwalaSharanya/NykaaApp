package com.evoke.nykaaapp.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.nykaaapp.dto.OrderItemDto;
import com.evoke.nykaaapp.service.OrderItemService;
@RestController
@RequestMapping("/api")
public class OrderItemController {
	private static final Logger log = LogManager.getLogger(OrderItemController.class);

	@Autowired
	private OrderItemService orderItemService;

	@PostMapping("/orderitem")
	public ResponseEntity<String> save(@RequestBody OrderItemDto orderItemDto) {
		log.info("creating order {}", orderItemDto);

		orderItemService.create(orderItemDto);
		return new ResponseEntity<String>("created successfully", HttpStatus.CREATED);

	}

	@GetMapping("/orderitem")
	public ResponseEntity<List<OrderItemDto>> getItems(OrderItemDto orderItemDto) {
		List<OrderItemDto> orderItemDtos = orderItemService.getAll();
		return new ResponseEntity<List<OrderItemDto>>(orderItemDtos, HttpStatus.OK);
	}

//	@GetMapping("/items/{id}")
//	public ResponseEntity<OrderCreationDto> getById(@PathVariable("id") Long id) {
//		OrderCreationDto item = orderCreationService.getById(id);
//		return new ResponseEntity<OrderCreationDto>(item, HttpStatus.OK);
//	}
//
//	@DeleteMapping("/items/{id}")
//	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
//		orderCreationService.delete(id);
//		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
//	}
//
//	@PutMapping("/items/price")
//	public ResponseEntity<ItemDto> assignPrice(@RequestBody AddItemPriceDto addItemPriceDto) {
//		ItemDto itemDto = orderCreationService.assignPriceToItem(addItemPriceDto.getItemId(), addItemPriceDto.getPriceId());
//		return new ResponseEntity<ItemDto>(itemDto, HttpStatus.OK);
//	}
}
