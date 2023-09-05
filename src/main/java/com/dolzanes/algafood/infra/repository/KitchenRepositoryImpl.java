package com.dolzanes.algafood.infra.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dolzanes.algafood.domain.repository.KitchenRepository;
import com.dolzanes.algafood.model.Kitchen;

@Component
public class KitchenRepositoryImpl implements KitchenRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Kitchen> getAll() {
		return manager.createQuery("from Kitchen", Kitchen.class).getResultList();
	}

	@Override
	public Kitchen getOne(Integer id) {
		return manager.find(Kitchen.class, id);
	}

	@Override
	@Transactional
	public Kitchen create(Kitchen kitchen) {
		return manager.merge(kitchen);
	}

	@Override
	@Transactional
	public void delete(Kitchen kitchen) {
		kitchen = getOne(kitchen.getId());
		manager.remove(kitchen);
	}

}
