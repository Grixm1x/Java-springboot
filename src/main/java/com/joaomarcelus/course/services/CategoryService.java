package com.joaomarcelus.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcelus.course.entities.Category;
import com.joaomarcelus.course.repositories.CategoryRepositoy;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepositoy repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
