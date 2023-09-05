package com.dolzanes.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.dolzanes.algafood.SpringAlgafoodApiApplication;
import com.dolzanes.algafood.domain.repository.RestaurantRepository;
import com.dolzanes.algafood.model.Restaurant;

public class GetRestaurantMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringAlgafoodApiApplication.class).web(WebApplicationType.NONE).run(args);
		
		RestaurantRepository repository = applicationContext.getBean(RestaurantRepository.class);
		
		List<Restaurant> restaurants = repository.getAll();
		
		for (Restaurant restaurant: restaurants) {
			System.out.println("Restaurant: "+restaurant.getId()+" - "+restaurant.getName()+" - Kitchen: "+restaurant.getKitchen().getName());
		}
	}

}
