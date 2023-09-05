package com.dolzanes.algafood.infra.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.dolzanes.algafood.domain.repository.PermissionRepository;
import com.dolzanes.algafood.model.Permission;

@Component
public class PermissionRepositoryImpl implements PermissionRepository {
	
	@PersistenceContext
    private EntityManager manager;

	@Override
	public List<Permission> getAll() {
		return manager.createQuery("from Permission", Permission.class).getResultList();
	}

	@Override
	public Permission getOne(Integer id) {
		return manager.find(Permission.class, id);
	}

	@Override
	@Transactional
	public Permission create(Permission permission) {
		return manager.merge(permission);
	}

	@Override
	@Transactional
	public void delete(Permission permission) {
		permission = getOne(permission.getId());
		manager.remove(permission);		
	}

}
