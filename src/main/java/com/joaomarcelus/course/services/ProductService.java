package com.joaomarcelus.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcelus.course.entities.Product;
import com.joaomarcelus.course.repositories.ProductRepositoy;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositoy repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
