package com.example.marketplace.repository;

import com.example.marketplace.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}

