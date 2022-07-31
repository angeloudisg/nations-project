package com.java.springboot.nations.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="region_areas")
public class RegionArea {
	
	@Id
    @Column(name = "region_name", nullable = false)
	private String regionName;
	
    @Column(name = "region_area", nullable = false, precision = 15, scale = 4)
    private BigDecimal regionArea;

	public RegionArea() {
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public BigDecimal getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(BigDecimal regionArea) {
		this.regionArea = regionArea;
	}
	
	

}
