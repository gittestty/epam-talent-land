package com.epam.talentland.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.talentland.user.entity.User;
import com.epam.talentland.user.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserRepository repository;

	@Autowired
	UserController(UserRepository repository) {
		this.repository = repository;
	}

	@GetMapping()
	List<User> all() {
		return repository.findAll();
	}

	@PostMapping()
	User newUser(@Valid @RequestBody User newUser) {
		return repository.save(newUser);
	}


	 @GetMapping("/{id}")
	 User one(@PathVariable String id) {
	 return repository.findById(id).get();
	 }
	 
	 @PutMapping("/{id}")
	 User replaceUser(@RequestBody User newUser, @PathVariable String id) {

			return repository.findById(id)
				.map(user -> {
					user.setCompleteName(newUser.getCompleteName());
					user.setIdRol(newUser.getIdRol());
					return repository.save(user);
				})
				.orElseGet(() -> {
					newUser.setId(id);
					return repository.save(newUser);
				});
		}

		@DeleteMapping("/{id}")
		void deleteUser(@PathVariable String id) {
			repository.deleteById(id);
		}
	 
	 

}
