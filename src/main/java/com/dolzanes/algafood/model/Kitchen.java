package com.dolzanes.algafood.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="kitchen")
public class Kitchen {
	
	@Id
	private Integer id;
	private String name;
	
}
