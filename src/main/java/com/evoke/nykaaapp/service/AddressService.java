package com.evoke.nykaaapp.service;

import java.util.List;

import com.evoke.nykaaapp.dto.AddressDto;
import com.evoke.nykaaapp.dto.ItemDto;

public interface AddressService {
	public AddressDto create(AddressDto addressDto);

	public List<AddressDto> getAll();

	public AddressDto update(AddressDto addressDto);

	//public Boolean delete(Long id);

	//public AddressDto getById(Long id);
	
}
