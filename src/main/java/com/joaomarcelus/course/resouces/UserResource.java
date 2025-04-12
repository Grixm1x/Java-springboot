package com.joaomarcelus.course.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaomarcelus.course.entities.User;
import com.joaomarcelus.course.services.UserService;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User>> returnUser(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> returnId(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);		
	}
}
