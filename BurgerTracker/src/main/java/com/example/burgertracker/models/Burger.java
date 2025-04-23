package com.example.burgertracker.models;


import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
@Entity
@Table(name="burgers")
public class Burger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@Size(min=1, max=255, message="Burger name must not be null")
	private String name;
	
	
	@Size(min=1, max=255, message="Restaurant name must not be null")
	private String restaurant;
	
	
	@Min(1)
	@Max(5)
	private int rating;
	
	
	@Size(min=1, max=255, message="Notes must not be empty")
	private String notes;
	
	public Burger() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
