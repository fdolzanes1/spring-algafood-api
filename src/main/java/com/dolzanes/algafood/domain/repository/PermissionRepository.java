package com.dolzanes.algafood.domain.repository;

import java.util.List;

import com.dolzanes.algafood.model.Permission;

public interface PermissionRepository {
	
	List<Permission> getAll();
	Permission getOne(Integer id);
	Permission create(Permission permission);
	void delete(Permission permission);
}
