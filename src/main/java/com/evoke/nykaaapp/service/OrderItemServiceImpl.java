package com.evoke.nykaaapp.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.nykaaapp.dto.OrderItemDto;
import com.evoke.nykaaapp.entity.OrderItemEntity;
import com.evoke.nykaaapp.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	private static final Logger log = LogManager.getLogger(OrderItemServiceImpl.class);
	@Autowired
	private OrderItemRepository orderItemRepository;

	private ModelMapper mapper = new ModelMapper();

	@Override
	public OrderItemDto create(OrderItemDto orderItemDto) {
		log.info("saving to database");

		try {


			ModelMapper mapper = new ModelMapper();
			OrderItemEntity orderItemEntity = mapper.map(orderItemDto, OrderItemEntity.class);

			OrderItemEntity createdOrder = orderItemRepository.save(orderItemEntity);
			log.info("saved  to database");
			orderItemDto = mapper.map(createdOrder, OrderItemDto.class);
			return orderItemDto;
		} catch (Exception e) {
			log.error("error-saving order to database: {}", e);
		}
		return null;
	}

	@Override
	public List<OrderItemDto> getAll() {
		List<OrderItemEntity> order = orderItemRepository.findAll();

		List<OrderItemDto> orderItemDtosList = new ArrayList<>();

		for (OrderItemEntity orderItemEntity : order) {

			OrderItemDto orderItemDto = mapper.map(orderItemEntity, OrderItemDto.class);

			orderItemDtosList.add(orderItemDto);

		}
		return orderItemDtosList;
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
