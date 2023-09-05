package com.dolzanes.algafood.domain.repository;

import java.util.List;

import com.dolzanes.algafood.model.Kitchen;

public interface KitchenRepository {
	
	List<Kitchen> getAll();
	Kitchen getOne(Integer id);
	Kitchen create(Kitchen kitchen);
	void delete(Kitchen kitchen);
}
