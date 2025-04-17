package com.joaomarcelus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelus.course.entities.Product;

public interface ProductRepositoy extends JpaRepository<Product, Long>{
	
	

}
