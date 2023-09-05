package com.dolzanes.algafood.domain.repository;

import java.util.List;

import com.dolzanes.algafood.model.City;

public interface CityRepository {
	
	List<City> getAll();
	City getOne(Integer id);
	City create(City city);
	void delete(City city);
}
