package com.dolzanes.algafood.domain.repository;

import java.util.List;

import com.dolzanes.algafood.model.State;

public interface StateRepository {
	
	List<State> getAll();
	State getOne(Integer id);
	State create(State state);
	void delete(State state);
}
