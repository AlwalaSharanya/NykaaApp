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

import com.evoke.nykaaapp.dto.UserCartDto;
import com.evoke.nykaaapp.dto.UserDto;
import com.evoke.nykaaapp.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	private static final Logger log = LogManager.getLogger(UserController.class);
	@Autowired
	private UserService UserService;

	@PostMapping("/user")
	public ResponseEntity<String> save(@RequestBody UserDto person) {
		log.info("creating item {}", person);
		UserService.create(person);
		return new ResponseEntity<String>("items created successfully", HttpStatus.CREATED);

	}

	@GetMapping("/user")
	public ResponseEntity<List<UserDto>> getItems(UserDto UserDto) {
		List<UserDto> persons = UserService.getAll();
		return new ResponseEntity<List<UserDto>>(persons, HttpStatus.OK);
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
		UserDto item = UserService.getById(id);
		return new ResponseEntity<UserDto>(item, HttpStatus.OK);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		UserService.delete(id);
		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
	}
//	@GetMapping("/items/{id}")
//	public ResponseEntity<UserDto> getById(@PathVariable("id") Long id) {
//		UserDto item = UserService.getById(id);
//		return new ResponseEntity<UserDto>(item, HttpStatus.OK);
//	}

//	@DeleteMapping("/items/{id}")
//	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
//		UserService.delete(id);
//		return new ResponseEntity<String>("Item Deleted Successfully", HttpStatus.OK);
//	}

	@PutMapping("/persons/cart")
	public ResponseEntity<UserDto> assignCartToPerson(@RequestBody UserCartDto personCartDto) {
		UserDto UserDto = UserService.assignCartToPerson(personCartDto.getCartid(), personCartDto.getPersonid());

		return new ResponseEntity<UserDto>(UserDto, HttpStatus.CREATED);

	}

}
