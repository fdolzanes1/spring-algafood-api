package com.dolzanes.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.dolzanes.algafood.SpringAlgafoodApiApplication;
import com.dolzanes.algafood.domain.repository.PaymentMethodRepository;
import com.dolzanes.algafood.model.PaymentMethod;

public class GetPaymentMethodMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringAlgafoodApiApplication.class).web(WebApplicationType.NONE).run(args);
		
		PaymentMethodRepository repository = applicationContext.getBean(PaymentMethodRepository.class);
		
		List<PaymentMethod> payments = repository.getAll();
		
		for (PaymentMethod payment: payments) {
			System.out.println("Payment Method: "+payment.getId()+" - "+payment.getDescription());
		}
	}

}
