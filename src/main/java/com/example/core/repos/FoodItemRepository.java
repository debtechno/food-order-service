package com.example.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.core.entities.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

}
