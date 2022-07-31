package com.java.springboot.nations.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "countries")
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id", nullable = false)
	private Integer id;

	@Column(name = "name", nullable = true)
	private String name;

	@Column(name = "area", nullable = false)
	private BigDecimal area;

	@Column(name = "national_day", nullable = true)
	private Date nationalDay;

	@Column(name = "country_code2", columnDefinition = "char", nullable = false, unique = true)
	@Size(min = 2, max = 2)
	@Pattern(regexp = "^\\d{2}$")
	private String countryCode2;

	@Column(name = "country_code3", nullable = false, columnDefinition = "char", unique = true)
	@Size(min = 3, max = 3)
	@Pattern(regexp = "^\\d{3}$")
	private String countryCode3;

	@ManyToOne
	@JoinColumn(name = "region_id", nullable = false)
	private Region region;

	public Country(Integer id, String name, BigDecimal area, Date nationalDay,
			String countryCode2, String countryCode3, Region region) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.nationalDay = nationalDay;
		this.countryCode2 = countryCode2;
		this.countryCode3 = countryCode3;
		this.region = region;
	}

	public Country() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Date getNationalDay() {
		return nationalDay;
	}

	public void setNationalDay(Date nationalDay) {
		this.nationalDay = nationalDay;
	}

	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}