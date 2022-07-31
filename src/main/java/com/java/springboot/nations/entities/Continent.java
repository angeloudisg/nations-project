package com.java.springboot.nations.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="continents")
public class Continent {
	
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "continent_id", nullable = false)
	private Integer continentId;
	
	@Column(name = "name", nullable = false)
	private String name;

	
	public Continent() {
	}

	public Integer getContinentId() {
		return continentId;
	}

	public void setContinentId(Integer continentId) {
		this.continentId = continentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
