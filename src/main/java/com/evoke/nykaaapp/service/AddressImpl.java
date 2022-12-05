package com.evoke.nykaaapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.evoke.nykaaapp.dto.AddressDto;
import com.evoke.nykaaapp.dto.ItemDto;
import com.evoke.nykaaapp.dto.ItemPriceDto;
import com.evoke.nykaaapp.entity.AddressEntity;
import com.evoke.nykaaapp.entity.ItemEntity;
import com.evoke.nykaaapp.entity.ItemPriceEntity;
import com.evoke.nykaaapp.exception.ApiRuntimeException;
import com.evoke.nykaaapp.repository.AddressRepository;
import com.evoke.nykaaapp.repository.ItemPriceRepository;
@Service
public class AddressImpl implements AddressService{
private static final Logger log = LoggerFactory.getLogger(ItemPriceService.class);
	
	@Autowired
	private AddressRepository addressRepository;
	
	
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public AddressDto create(AddressDto addressDto) {
		log.info("saving items to database");

		try {

			ModelMapper mapper = new ModelMapper();
			AddressEntity addressEntity = mapper.map(addressDto, AddressEntity.class);

			AddressEntity createdItem = addressRepository.save(addressEntity);
			log.info("saved Item to database");
			addressDto = mapper.map(createdItem, AddressDto.class);
			return addressDto;

		} catch (Exception e) {
			log.error("error-saving item to database: {}", e);
		}
		return null;
	}

	@Override
	public List<AddressDto> getAll() {
		List<AddressEntity> items = addressRepository.findAll();

		List<AddressDto> itemDtosList = new ArrayList<>();

		for (AddressEntity itemEntity : items) {

			AddressDto itemDto = mapper.map(itemEntity, AddressDto.class);

			itemDtosList.add(itemDto);

		}
		return itemDtosList;
	}

	@Override
	public AddressDto update(AddressDto addressDto) {
		if (StringUtils.isEmpty(addressDto.getId())) {
			throw new ApiRuntimeException(" ID cannot be NULL or Empty to Update", "NOT_FOUND",
					HttpStatus.NOT_FOUND);
		}

		log.info("updating  {}", addressDto.toString());
		AddressEntity addressEntity = mapper.map(addressDto, AddressEntity.class);
		
		addressRepository.save(addressEntity);
		log.info(" updated successfully");

		AddressDto updatedAddressDto = mapper.map(addressEntity, AddressDto.class);
		return updatedAddressDto;
	
	}

//	@Override
//	public Boolean delete(Long id) {
//		try {
//			log.info("Deleting Details  for Id {}, ", id);
//			AddressDto addressDto = getById(id);
//			AddressEntity addressEntity = mapper.map(addressDto, AddressEntity.class);
//			addressRepository.delete(addressEntity);
//			return true;
//		}catch(Exception e) {
//			log.error("Error while deleting item for Id : {}", id);
//			throw new  ApiRuntimeException("Error while deleting  for Id "+id, "INTERNAL_ERROR",HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		
//	}
//
//	@Override
//	public AddressDto getById(Long id) {
//		log.info("Getting Details  for Id {}, ", id);
//		Optional<AddressEntity> addressEntityOptional = addressRepository.findById(id);
//		if (addressEntityOptional.isPresent()) {
//
//			AddressEntity addressEntity = addressEntityOptional.get();
//			AddressDto addressDto = mapper.map(addressEntity, AddressDto.class);
//
//			ItemPriceEntity itemPriceEntity = addressEntity.getItemPrice();
//			if (itemPriceEntity != null) {
//				ItemPriceDto itemPriceDto = mapper.map(itemPriceEntity, ItemPriceDto.class);
//				itemDto.setItemPriceDto(itemPriceDto);
//			}
//
//			return itemDto;
//		}
//		log.error("Item not found for Id : {}", id);
//		throw new ApiRuntimeException("Item Not Found for ID: " + id, "NOT_FOUND", HttpStatus.NOT_FOUND);
//	}

}
