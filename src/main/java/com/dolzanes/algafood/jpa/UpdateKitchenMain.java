package com.dolzanes.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.dolzanes.algafood.SpringAlgafoodApiApplication;
import com.dolzanes.algafood.model.Kitchen;

public class UpdateKitchenMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringAlgafoodApiApplication.class).web(WebApplicationType.NONE).run(args);
		
		GetKitchen getKitchen = applicationContext.getBean(GetKitchen.class);
		
		Kitchen kitchen = getKitchen.getOne(1);
		
		System.out.println("Kitchen: "+kitchen.getId()+" - "+kitchen.getName());
		
		kitchen.setName("Brasileira");
		
		System.out.println("Kitchen: "+kitchen.getId()+" - "+kitchen.getName());
		
		getKitchen.create(kitchen);
	}
}
