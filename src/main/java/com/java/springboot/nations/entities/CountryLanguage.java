package com.java.springboot.nations.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="country_languages")
public class CountryLanguage implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "country_id", nullable = false)
	private Country countryId;

	@Id
	@ManyToOne
	@JoinColumn(name = "language_id", columnDefinition = "int", nullable = false)
	private Language language;

	@Column(name = "official",columnDefinition = "bit", nullable = false)
	private Integer official;

	
	public CountryLanguage() {
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}

	
	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Integer getOfficial() {
		return official;
	}

	public void setOfficial(Integer official) {
		this.official = official;
	}

}
