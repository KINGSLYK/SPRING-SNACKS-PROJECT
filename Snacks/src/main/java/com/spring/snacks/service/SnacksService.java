package com.spring.snacks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.snacks.model.Snacks;
import com.spring.snacks.repository.SnacksRepository;

@Service
public class SnacksService {
	@Autowired
	private SnacksRepository repository;
	
	//Get Method
	public List<Snacks>getSnacks() {
		return repository.findAll();
	}
	//Get by Id Method 
	public Optional<Snacks> getSnackbyId(int id) {
		return repository.findById(null);
	}
	//Post Method
	public Snacks addSnacks(Snacks snacks) {
		return repository.save(snacks);
	}
	//Update Method 
	public Snacks editSnacks (Snacks snack, int id) {
		Snacks snackx = repository.findById(id).orElse(null);
		if(snackx != null) {
			snackx.setSnacksname(snack.getSnacksname());
			snackx.setQuantity(snack.getQuantity());
			snackx.setPrice(snack.getPrice());
		return repository.saveAndFlush(snackx);
		}
		else {
			return null;
		}
	}
	public String deleteSnacks(int id) {
		repository.deleteById(id);
		return "deleted !";
				}
}