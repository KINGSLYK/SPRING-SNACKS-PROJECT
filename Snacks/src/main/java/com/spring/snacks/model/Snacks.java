package com.spring.snacks.model;

import jakarta.persistence.Entity;


@Entity
@Table(name = "snacks")


public class Snacks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSnacksname() {
		return snacksname;
	}
	public void setSnacksname(String snacksname) {
		this.snacksname = snacksname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private String snacksname;
	private int quantity;
	private float price;
	@Override
	public String toString() {
		return "Snacks [id=" + id + ", snacksname=" + snacksname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
