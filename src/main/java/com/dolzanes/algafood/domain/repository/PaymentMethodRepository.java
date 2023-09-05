package com.dolzanes.algafood.domain.repository;

import java.util.List;

import com.dolzanes.algafood.model.PaymentMethod;

public interface PaymentMethodRepository {
	
	List<PaymentMethod> getAll();
	PaymentMethod getOne(Integer id);
	PaymentMethod create(PaymentMethod paymentMethod);
	void delete(PaymentMethod paymentMethod);
}
