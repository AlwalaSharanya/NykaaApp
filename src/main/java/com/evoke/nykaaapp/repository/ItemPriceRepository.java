package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.ItemPriceEntity;


@Repository
public interface ItemPriceRepository extends JpaRepository<ItemPriceEntity, Long> {


}
