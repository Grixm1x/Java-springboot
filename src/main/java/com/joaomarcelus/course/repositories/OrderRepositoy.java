package com.joaomarcelus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelus.course.entities.Order;

public interface OrderRepositoy extends JpaRepository<Order, Long>{
	
	

}
