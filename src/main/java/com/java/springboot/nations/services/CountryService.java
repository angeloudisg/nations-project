package com.java.springboot.nations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.nations.entities.Country;
import com.java.springboot.nations.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> listAllCountries(){
		return countryRepository.findAll();
	}
	
	public List<Country> listAllCountriesFilterNameOrderByAsc(){
		return countryRepository.findByOrderByNameAsc();
	}
	
	public List<Country> listAllCountriesFilterNameOrderByDesc(){
		return countryRepository.findByOrderByNameDesc();
	}
	
	public List<Country> listAllCountriesFilterAreaOrderByAsc(){
		return countryRepository.findByOrderByAreaAsc();
	}
	
	public List<Country> listAllCountriesFilterAreaOrderByDesc(){
		return countryRepository.findByOrderByAreaDesc();
	}
	
	public List<Country> listAllCountriesFilterRegionOrderByAsc(){
		return countryRepository.findByOrderByRegionAsc();
	}
	
	public List<Country> listAllCountriesFilterRegionOrderByDesc(){
		return countryRepository.findByOrderByRegionDesc();
	}
	
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}
	
	public Country getCountryById(Integer id) {
		return countryRepository.findById(id).get();
	}
	
	public void deleteCountry(Integer id) {
		countryRepository.deleteById(id);
	}

}
