package com.java.springboot.nations.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.nations.entities.Country;
import com.java.springboot.nations.services.CountryService;

@RestController
@RequestMapping("/api")
public class CountryController {
	
	@Autowired
	private CountryService service;
	
	
	@GetMapping("/countries")
	public List<Country> listAll(@RequestParam(value = "filterBy", required = false) String filterBy,
			@RequestParam(value = "orderBy", required = false) String orderBy) {

		if (filterBy != null && orderBy != null) {
			
			//Filter By Name
			if (filterBy.equalsIgnoreCase("name")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCountriesFilterNameOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCountriesFilterNameOrderByDesc();
			}
			
			//Filter By Area
			if (filterBy.equalsIgnoreCase("area")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCountriesFilterAreaOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCountriesFilterAreaOrderByDesc();
			}
			
			//Filter By Region
			if (filterBy.equalsIgnoreCase("region")) {
				if (orderBy.equalsIgnoreCase("asc"))
					return service.listAllCountriesFilterRegionOrderByAsc();
				else if (orderBy.equalsIgnoreCase("desc"))
					return service.listAllCountriesFilterRegionOrderByDesc();
			}
			
			

		} else {

			return service.listAllCountries();

		}

		return null;

	}

	@GetMapping("/country/{id}")
	public ResponseEntity<Country> get(@PathVariable Integer id) {

		try {

			Country country = service.getCountryById(id);

			return new ResponseEntity<Country>(country, HttpStatus.OK);
		} catch (NoSuchElementException e) {

			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/country")
	public Country saveCountry(@RequestBody Country country) {

		return service.saveCountry(country);
	}

	@PutMapping("/country/{id}")
	public ResponseEntity<Country> update(@RequestBody Country country, @PathVariable Integer id) {

		try {

			Country country2 = service.getCountryById(id);

			updateElements(country2, country);

			service.saveCountry(country2);

			return new ResponseEntity<Country>(country2, HttpStatus.OK);

		} catch (NoSuchElementException e) {

			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/country/{id}")
	public ResponseEntity<Country> deleteCountry(@PathVariable Integer id) {

		try {

			service.deleteCountry(id);

			return new ResponseEntity<Country>(HttpStatus.OK);

		} catch (NoSuchElementException e) {

			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);

		}

	}
	
	private void updateElements(Country country2, Country country) {

		country2.setName(country.getName());
		country2.setRegion(country.getRegion());
		country2.setArea(country.getArea());
	}

	
	

}
