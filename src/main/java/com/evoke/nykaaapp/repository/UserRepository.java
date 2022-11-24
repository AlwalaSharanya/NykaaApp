package com.evoke.nykaaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evoke.nykaaapp.entity.UserEntity;

@Repository

public interface UserRepository extends JpaRepository<UserEntity, Long> {


}
