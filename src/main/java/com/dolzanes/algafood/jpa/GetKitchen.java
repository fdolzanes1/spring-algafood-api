package com.dolzanes.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dolzanes.algafood.model.Kitchen;

@Component
public class GetKitchen {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Kitchen> getAll() {
		return manager.createQuery("from Kitchen", Kitchen.class).getResultList();
	}
	
	@Transactional
	public Kitchen create(Kitchen kitchen) {
		return manager.merge(kitchen);
	}
	
	public Kitchen getOne(Integer id) {
		return manager.find(Kitchen.class, id);
	}
	
	@Transactional
	public void delete(Kitchen kitchen) {
		kitchen = getOne(kitchen.getId());
		manager.remove(kitchen);
	}
}
