package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.ItemPriceEntity;
import com.evoke.nykaaapp.entity.OrderCreationEntity;
import com.evoke.nykaaapp.entity.OrderItemEntity;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long>  {

}
