package com.dolzanes.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.dolzanes.algafood.SpringAlgafoodApiApplication;
import com.dolzanes.algafood.domain.repository.CityRepository;
import com.dolzanes.algafood.model.City;

public class GetCityMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringAlgafoodApiApplication.class).web(WebApplicationType.NONE).run(args);
		
		CityRepository repository = applicationContext.getBean(CityRepository.class);
		
		List<City> cities = repository.getAll();
		
		for (City city: cities) {
			System.out.println("City: "+city.getId()+" - "+city.getName());
		}
	}

}
