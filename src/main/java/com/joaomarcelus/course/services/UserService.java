package com.joaomarcelus.course.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomarcelus.course.entities.User;
import com.joaomarcelus.course.repositories.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
