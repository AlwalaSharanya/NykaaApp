package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.ItemPriceEntity;
import com.evoke.nykaaapp.entity.OrderCreationEntity;

@Repository
public interface OrderCreationRepository extends JpaRepository<OrderCreationEntity, Long>  {

}
