//package com.evoke.nykaaapp.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.evoke.nykaaapp.dto.OrderCreationDto;
//import com.evoke.nykaaapp.dto.OrderTrackingDto;
//import com.evoke.nykaaapp.entity.OrderCreationEntity;
//import com.evoke.nykaaapp.entity.OrderTrackingEntity;
//import com.evoke.nykaaapp.repository.OrderTrackingRepository;
//@Service
//public class OrderTrackingServiceImpl implements OrderrackingService{
//	private static final Logger log = LogManager.getLogger(OrderCreationServiceImpl.class);
//	@Autowired
//	private OrderTrackingRepository orderTrackingRepository;
//
//	private ModelMapper mapper = new ModelMapper();
//
//	@Override
//	public OrderTrackingDto create(OrderTrackingDto orderTracking) {
//		log.info("saving to database");
//
//		try {
//
//
//			ModelMapper mapper = new ModelMapper();
//			OrderTrackingEntity orderTrackingEntity = mapper.map(orderTracking, OrderTrackingEntity.class);
//
//			OrderTrackingEntity createdorderTracking = orderTrackingRepository.save(orderTrackingEntity);
//			log.info("saved to database");
//			orderTracking = mapper.map(createdorderTracking, OrderTrackingDto.class);
//			return orderTracking;
//		} catch (Exception e) {
//			log.error("error-saving order to database: {}", e);
//		}
//		return null;	}
//
//	@Override
//	public List<OrderTrackingDto> getAll() {
//		List<OrderTrackingEntity> order = orderTrackingRepository.findAll();
//
//		List<OrderTrackingDto> orderTrackingDtosList = new ArrayList<>();
//
//		for (OrderTrackingEntity orderTrackingEntity : order) {
//
//			OrderTrackingDto orderTrackingDto = mapper.map(orderTrackingEntity, OrderTrackingDto.class);
//
//			orderTrackingDtosList.add(orderTrackingDto);
//
//		}
//		return orderTrackingDtosList;
//	}
//
//	@Override
//	public OrderTrackingDto update(OrderTrackingDto orderTracking) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Boolean delete(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public OrderTrackingDto getById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//		
//
//
//}
