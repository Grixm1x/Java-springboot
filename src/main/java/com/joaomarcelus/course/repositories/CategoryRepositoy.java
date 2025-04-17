package com.joaomarcelus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelus.course.entities.Category;

public interface CategoryRepositoy extends JpaRepository<Category, Long>{
	
	

}
