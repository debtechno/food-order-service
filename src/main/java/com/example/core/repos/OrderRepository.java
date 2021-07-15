package com.example.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.core.entities.OrderEntity;
import com.example.core.entities.OrderEntityId;

public interface OrderRepository extends JpaRepository<OrderEntity, OrderEntityId> {
	@Query(value="Select Max(order_id) as max_id from order_details", nativeQuery=true)
	public Integer getMaxId();
}
