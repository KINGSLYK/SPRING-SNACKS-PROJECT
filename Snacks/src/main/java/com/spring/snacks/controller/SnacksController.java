package com.spring.snacks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.snacks.model.Snacks;
import com.spring.snacks.service.SnacksService;

@RestController
@RequestMapping("/api")

public class SnacksController {
	@Autowired
	private SnacksService service;
	@GetMapping()
	public List<Snacks> read(){
		return service.getSnacks();
	}

	@GetMapping("/{id}")
	public Optional<Snacks> readbyid(@PathVariable int id) {
		return service.getSnackbyId(id);
	}
	@PostMapping
	public Snacks create(@RequestBody Snacks snacks) {
		return service.addSnacks(snacks);
	}
	@PutMapping 
	public Snacks update(@RequestBody Snacks snacks, @PathVariable int id) {
		return service.editSnacks(snacks, id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteSnacks(id);
		
	}
}