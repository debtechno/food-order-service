package com.example.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.entities.FoodItem;
import com.example.core.repos.FoodItemRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class FoodItemController {
	@Autowired
	private FoodItemRepository fr;
	
	@GetMapping("/menus")
	public List<FoodItem> findAll(){
		return fr.findAll();
	}

}
