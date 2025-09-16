package com.elderlima.api.repositories;

import com.elderlima.api.entities.Category;
import com.elderlima.api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
