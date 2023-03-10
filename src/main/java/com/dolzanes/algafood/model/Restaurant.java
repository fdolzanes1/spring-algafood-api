package com.dolzanes.algafood.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="restaurant")
public class Restaurant {
	
	@Id
	private Integer id;
	private String name;
	private BigDecimal shipping_fee;
}
