package com.elderlima.api.repositories;

import com.elderlima.api.entities.Category;
import com.elderlima.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
