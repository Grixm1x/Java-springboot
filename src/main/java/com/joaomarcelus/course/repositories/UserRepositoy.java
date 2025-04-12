package com.joaomarcelus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomarcelus.course.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long>{
	
	

}
