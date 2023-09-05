package com.dolzanes.algafood.infra.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dolzanes.algafood.domain.repository.RestaurantRepository;
import com.dolzanes.algafood.model.Restaurant;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Restaurant> getAll() {
		return manager.createQuery("from Restaurant", Restaurant.class).getResultList();
	}

	@Override
	public Restaurant getOne(Integer id) {
		return manager.find(Restaurant.class, id);
	}

	@Override
	@Transactional
	public Restaurant create(Restaurant restaurant) {
		return manager.merge(restaurant);
	}

	@Override
	@Transactional
	public void delete(Restaurant restaurant) {
		restaurant = getOne(restaurant.getId());
		manager.remove(restaurant);
	}

}
