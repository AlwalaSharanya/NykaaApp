package com.evoke.nykaaapp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.nykaaapp.dto.OrderCreationDto;
import com.evoke.nykaaapp.entity.OrderCreationEntity;
import com.evoke.nykaaapp.repository.OrderCreationRepository;

@Service
public class OrderCreationServiceImpl implements OrderCreationService{
	private static final Logger log = LogManager.getLogger(OrderCreationServiceImpl.class);
	@Autowired
	private OrderCreationRepository orderCreationRepository;

	private ModelMapper mapper = new ModelMapper();

	@Override
	public OrderCreationDto create(OrderCreationDto orderCreationDto) {
		log.info("saving items to database");

		try {


			ModelMapper mapper = new ModelMapper();
			OrderCreationEntity orderCreationEntity = mapper.map(orderCreationDto, OrderCreationEntity.class);

			OrderCreationEntity createdOrder = orderCreationRepository.save(orderCreationEntity);
			log.info("saved Item to database");
			orderCreationDto = mapper.map(createdOrder, OrderCreationDto.class);
			return orderCreationDto;
		} catch (Exception e) {
			log.error("error-saving order to database: {}", e);
		}
		return null;
	}

	@Override
	public List<OrderCreationDto> getAll() {
		List<OrderCreationEntity> order = orderCreationRepository.findAll();

		List<OrderCreationDto> orderCreationDtosList = new ArrayList<>();

		for (OrderCreationEntity orderCreationEntity : order) {

			OrderCreationDto orderCreationDto = mapper.map(orderCreationEntity, OrderCreationDto.class);

			orderCreationDtosList.add(orderCreationDto);

		}
		return orderCreationDtosList;
	}

//	@Override
//	public OrderCreationDto update(OrderCreationDto orderCreationDto) {
//		if (StringUtils.isEmpty(orderCreationDto.getId())) {
//			throw new ApiRuntimeException("Item ID cannot be NULL or Empty to UpdateItem", "NOT_FOUND",
//					HttpStatus.NOT_FOUND);
//		}
//
//		log.info("updating item {}", orderCreationDto.toString());
//		OrderCreationEntity orderCreationEntity = mapper.map(orderCreationDto, OrderCreationEntity.class);
//
//		orderCreationRepository.save(orderCreationEntity);
//		log.info("Item updated successfully");
//
//		OrderCreationDto updatedOrderCreationDto = mapper.map(orderCreationEntity, OrderCreationDto.class);
//		return updatedOrderCreationDto;
//	}

//	@Override
//	public Boolean delete(Long id) {
//		try {
//			log.info("Deleting ItemDetails  for Id {}, ", id);
//			OrderCreationDto orderCreationDto = getById(id);
//			OrderCreationEntity orderCreationEntity = mapper.map(orderCreationDto, OrderCreationEntity.class);
//			orderCreationRepository.delete(orderCreationEntity);
//			return true;
//		} catch (Exception e) {
//			log.error("Error while deleting item for Id : {}", id);
//			throw new ApiRuntimeException("Error while deleting item for Id " + id, "INTERNAL_ERROR",
//					HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@Override
//	public OrderCreationDto getById(Long id) {
//		log.info("Getting ItemDetails  for Id {}, ", id);
//		Optional<OrderCreationEntity> orderCreationEntity = orderCreationRepository.findById(id);
//		if (orderCreationEntity.isPresent()) {
//
//			OrderCreationEntity orderEntity = orderCreationEntity.get();
//			OrderCreationDto orderDto = mapper.map(orderEntity, OrderCreationDto.class);
//
//			OrderTrackingEntity orderTrackingEntity = orderEntity.getOrdertracking();
//			if (orderTrackingEntity != null) {
//				OrderCreationDto ordercreationDto = mapper.map(orderTrackingEntity, OrderCreationDto.class);
//				orderDto.
//			}
//
//			return itemDto;
//		}
//		log.error("Item not found for Id : {}", id);
//		throw new ApiRuntimeException("Item Not Found for ID: " + id, "NOT_FOUND", HttpStatus.NOT_FOUND);
//	}
//	}

}
