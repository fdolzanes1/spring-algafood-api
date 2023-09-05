package com.dolzanes.algafood.infra.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dolzanes.algafood.domain.repository.PaymentMethodRepository;
import com.dolzanes.algafood.model.PaymentMethod;

@Component
public class PaymentMethodRepositoryImpl implements PaymentMethodRepository {
	
	@PersistenceContext
    private EntityManager manager;

	@Override
	public List<PaymentMethod> getAll() {
		return manager.createQuery("from PaymentMethod", PaymentMethod.class).getResultList();
	}

	@Override
	public PaymentMethod getOne(Integer id) {
		return manager.find(PaymentMethod.class, id);
	}

	@Override
	@Transactional
	public PaymentMethod create(PaymentMethod paymentMethod) {
		return manager.merge(paymentMethod);
	}

	@Override
	@Transactional
	public void delete(PaymentMethod paymentMethod) {
		paymentMethod = getOne(paymentMethod.getId());
		manager.remove(paymentMethod);		
	}

}
