package com.dolzanes.algafood.domain.repository;

import java.util.List;

import com.dolzanes.algafood.model.Restaurant;

public interface RestaurantRepository {
	
	List<Restaurant> getAll();
	Restaurant getOne(Integer id);
	Restaurant create(Restaurant restaurant);
	void delete(Restaurant restaurant);
}
