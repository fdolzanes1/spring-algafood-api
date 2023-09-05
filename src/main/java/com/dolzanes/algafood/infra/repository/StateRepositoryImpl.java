package com.dolzanes.algafood.infra.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dolzanes.algafood.domain.repository.StateRepository;
import com.dolzanes.algafood.model.State;

@Component
public class StateRepositoryImpl implements StateRepository {
	
	@PersistenceContext
    private EntityManager manager;

	@Override
	public List<State> getAll() {
		return manager.createQuery("from State", State.class).getResultList();
	}

	@Override
	public State getOne(Integer id) {
		return manager.find(State.class, id);
	}

	@Override
	@Transactional
	public State create(State state) {
		return manager.merge(state);
	}

	@Override
	@Transactional
	public void delete(State state) {
		state = getOne(state.getId());
		manager.remove(state);		
	}

}
