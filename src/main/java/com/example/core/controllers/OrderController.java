package com.example.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.containers.Item;
import com.example.core.containers.OrderDetails;
import com.example.core.entities.OrderEntity;
import com.example.core.entities.OrderEntityId;
import com.example.core.repos.OrderRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@PostMapping("/confirmOrder")
	public void save(@RequestBody OrderDetails orderDetails) {
		Item[] items=orderDetails.getItems();
		OrderEntity oe= new OrderEntity();
		Integer max_id=orderRepo.getMaxId();
		oe.setoId(new OrderEntityId());
		if(max_id!=null && oe.getoId().getOrder_id()==null) {
		oe.getoId().setOrder_id(max_id+1);
		}else if (max_id== null && oe.getoId().getOrder_id()==null){
			oe.getoId().setOrder_id(1000);
		}
		for(Item item:items) {
			oe.setUser_name(orderDetails.getUser().getUser_name());
			oe.setCity(orderDetails.getUser().getCity());
			oe.setStreet(orderDetails.getUser().getStreet());
			oe.setPostalCode(orderDetails.getUser().getPostalCode());
			oe.setTotalAmount(orderDetails.getTotalAmount());
			oe.getoId().setId(item.getId());
			oe.setName(item.getName());
			oe.setAmount(item.getAmount());
			oe.setPrice(item.getPrice());
			orderRepo.save(oe);
		}
		
	}

}
