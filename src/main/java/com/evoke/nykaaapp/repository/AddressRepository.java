package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.AddressEntity;
@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

}
