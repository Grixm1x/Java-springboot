package com.joaomarcelus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelus.course.entities.OrderItem;

public interface OrderItemRepositoy extends JpaRepository<OrderItem, Long>{
	
	

}
