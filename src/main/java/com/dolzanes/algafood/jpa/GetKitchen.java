package com.dolzanes.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.dolzanes.algafood.model.Kitchen;

@Component
public class GetKitchen {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Kitchen> getAll() {
		return manager.createQuery("from Kitchen", Kitchen.class).getResultList();
	}
}
