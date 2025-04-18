package com.joaomarcelus.course.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcelus.course.entities.Order;
import com.joaomarcelus.course.repositories.OrderRepositoy;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepositoy repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
