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

import com.evoke.nykaaapp.dto.AddressDto;
import com.evoke.nykaaapp.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {
	private static final Logger log = LogManager.getLogger(ItemController.class);

	@Autowired
	private AddressService addressService;

	@PostMapping("/address")
	public ResponseEntity<String> saveAddress(@RequestBody AddressDto addressDto) {
		log.info("creating address {}", addressDto);

		addressService.create(addressDto);
		return new ResponseEntity<String>("created successfully", HttpStatus.CREATED);

	}

	@GetMapping("/address")
	public ResponseEntity<List<AddressDto>> getAddress(AddressDto address) {
		List<AddressDto> addresss = addressService.getAll();
		return new ResponseEntity<List<AddressDto>>(addresss, HttpStatus.OK);
	}

}
