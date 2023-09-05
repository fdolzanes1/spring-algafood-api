package com.dolzanes.algafood.infra.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dolzanes.algafood.domain.repository.CityRepository;
import com.dolzanes.algafood.model.City;

@Component
public class CityRepositoryImpl implements CityRepository {
	
	@PersistenceContext
    private EntityManager manager;
	
	@Override
	public List<City> getAll() {
		return manager.createQuery("from City", City.class).getResultList();
	}

	@Override
	public City getOne(Integer id) {
		return manager.find(City.class, id);
	}

	@Override
	@Transactional
	public City create(City city) {
		return manager.merge(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		city = getOne(city.getId());
		manager.remove(city);
	}
	

}
