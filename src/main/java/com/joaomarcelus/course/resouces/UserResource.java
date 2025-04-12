package com.joaomarcelus.course.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaomarcelus.course.entities.User;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> returnUser(){
		User u = new User(1L, "joao Marcelus", "joaomarcelus6@gmail.com","61984848","12345" );
		return ResponseEntity.ok().body(u);
	}
}
