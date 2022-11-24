package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.CartEntity;
@Repository

public interface CartRepository extends JpaRepository<CartEntity, Long> {
		

}
