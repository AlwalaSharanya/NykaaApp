package com.evoke.nykaaapp.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.nykaaapp.dto.AddItemPriceDto;
import com.evoke.nykaaapp.dto.ItemDto;
import com.evoke.nykaaapp.dto.OrderCreationDto;
import com.evoke.nykaaapp.service.OrderCreationService;
@RestController
@RequestMapping("/api")
public class OrderCreationController {
	private static final Logger log = LogManager.getLogger(OrderCreationController.class);

	@Autowired
	private OrderCreationService orderCreationService;

	@PostMapping("/ordercreation")
	public ResponseEntity<String> saveItems(@RequestBody OrderCreationDto orderCreationDto) {
		log.info("creating order {}", orderCreationDto);

		orderCreationService.create(orderCreationDto);
		return new ResponseEntity<String>("created successfully", HttpStatus.CREATED);

	}

	@GetMapping("/ordercreation")
	public ResponseEntity<List<OrderCreationDto>> getItems(OrderCreationDto orderCreationDto) {
		List<OrderCreationDto> orderCreationDtos = orderCreationService.getAll();
		return new ResponseEntity<List<OrderCreationDto>>(orderCreationDtos, HttpStatus.OK);
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
