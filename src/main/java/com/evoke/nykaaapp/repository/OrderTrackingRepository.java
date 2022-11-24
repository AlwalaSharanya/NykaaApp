package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.OrderTrackingEntity;
@Repository
public interface OrderTrackingRepository extends JpaRepository<OrderTrackingEntity, Long>  {

}
