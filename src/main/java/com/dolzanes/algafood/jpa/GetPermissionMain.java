package com.dolzanes.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.dolzanes.algafood.SpringAlgafoodApiApplication;
import com.dolzanes.algafood.domain.repository.PermissionRepository;
import com.dolzanes.algafood.model.Permission;

public class GetPermissionMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringAlgafoodApiApplication.class).web(WebApplicationType.NONE).run(args);
		
		PermissionRepository repository = applicationContext.getBean(PermissionRepository.class);
		
		List<Permission> permissions = repository.getAll();
		
		for (Permission permission: permissions) {
			System.out.println("Permission: "+permission.getId()+" - "+permission.getName()+" - "+permission.getDescription());
		}
	}

}
