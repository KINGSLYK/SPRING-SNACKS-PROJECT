package com.spring.snacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.snacks.model.Snacks;

@Repository
public interface SnacksRepository extends JpaRepository<Snacks, Integer> {

}
