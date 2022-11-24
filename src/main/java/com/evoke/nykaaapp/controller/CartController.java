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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.nykaaapp.dto.CartDto;
import com.evoke.nykaaapp.dto.ItemPriceDto;
import com.evoke.nykaaapp.service.CartService;

@RestController
@RequestMapping("/api")
public class CartController {
	private static final Logger log = LogManager.getLogger(CartController.class);
	@Autowired
	private CartService cartService;

	@PostMapping("/cart")
	public ResponseEntity<CartDto> saveItems(@RequestBody CartDto cartDto) {
		log.info(" created successfully{}", cartDto);
		CartDto newCartDto = cartService.create(cartDto);

		return new ResponseEntity<CartDto>(newCartDto, HttpStatus.CREATED);
	}

	@GetMapping("/cart")
	public ResponseEntity<List<CartDto>> getItems(CartDto cart) {
		List<CartDto> cartDto = cartService.getAll();
		return new ResponseEntity<List<CartDto>>(cartDto, HttpStatus.OK);
	}

	@GetMapping("/cart/{id}")
	public ResponseEntity<CartDto> getById(@PathVariable("id") Long id) {
		CartDto item = cartService.getById(id);
		return new ResponseEntity<CartDto>(item, HttpStatus.OK);
	}

	@DeleteMapping("cart/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		cartService.delete(id);
		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
	}
}
//@RestController
//@RequestMapping("/api")
//public class PersonController {
//	private static final Logger log = LogManager.getLogger(PersonController.class);
//
//	@Autowired
//	private PersonService personService;
//
//	@PostMapping("/person")
//	public ResponseEntity<String> saveItems(@RequestBody PersonDto personDto) {
//		log.info("creating person {}", personDto);
//
//		personService.create(personDto);
//		return new ResponseEntity<String>("created successfully", HttpStatus.CREATED);
//
//	}
//
//	@GetMapping("/person")
//	public ResponseEntity<List<PersonDto>> getItems(PersonDto person) {
//		List<PersonDto> items = personService.getAll();
//		return new ResponseEntity<List<PersonDto>>(items, HttpStatus.OK);
//	}
//	
//}
