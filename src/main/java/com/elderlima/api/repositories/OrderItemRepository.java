package com.elderlima.api.repositories;

import com.elderlima.api.entities.OrderItem;
import com.elderlima.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
