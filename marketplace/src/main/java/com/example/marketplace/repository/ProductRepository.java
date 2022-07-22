package com.example.marketplace.repository;

import com.example.marketplace.entities.ProductEntity;
import com.example.marketplace.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
