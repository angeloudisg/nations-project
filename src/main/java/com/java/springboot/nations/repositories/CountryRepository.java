package com.java.springboot.nations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.nations.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	public List<Country> findByOrderByNameAsc();
	public List<Country> findByOrderByNameDesc();
	public List<Country> findByOrderByAreaAsc();
	public List<Country> findByOrderByAreaDesc();
	public List<Country> findByOrderByRegionAsc();
	public List<Country> findByOrderByRegionDesc();





}
