//package com.evoke.nykaaapp.controller;
//
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.evoke.nykaaapp.dto.OrderCreationDto;
//import com.evoke.nykaaapp.dto.OrderTrackingDto;
//import com.evoke.nykaaapp.service.OrderrackingService;
//@RestController
//@RequestMapping("/api")
//
//public class OrderTrackingController {
//	private static final Logger log = LogManager.getLogger(OrderTrackingController.class);
//
//	@Autowired
//	private OrderrackingService orderTrackingService;
//
//	@PostMapping("/ordertracking")
//	public ResponseEntity<String> save(@RequestBody OrderTrackingDto orderTrackingDto) {
//		log.info("creating order {}", orderTrackingDto);
//
//		orderTrackingService.create(orderTrackingDto);
//		return new ResponseEntity<String>("created successfully", HttpStatus.CREATED);
//
//	}
//
//	@GetMapping("/ordertracking")
//	public ResponseEntity<List<OrderTrackingDto>> getItems(OrderCreationDto orderCreationDto) {
//		List<OrderTrackingDto> orderTrackingDtos = orderTrackingService.getAll();
//		return new ResponseEntity<List<OrderTrackingDto>>(orderTrackingDtos, HttpStatus.OK);
//	}
//}
