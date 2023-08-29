package com.dolzanes.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.dolzanes.algafood.SpringAlgafoodApiApplication;
import com.dolzanes.algafood.model.Kitchen;

public class GetKitchenMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringAlgafoodApiApplication.class).web(WebApplicationType.NONE).run(args);
		
		GetKitchen getKitchen = applicationContext.getBean(GetKitchen.class);
		
		List<Kitchen> kitchens = getKitchen.getAll();
		
		for (Kitchen kitchen: kitchens) {
			System.out.println("Kitchen: "+kitchen.getId()+" - "+kitchen.getName());
		}
	}

}
