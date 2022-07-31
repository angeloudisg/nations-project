package com.java.springboot.nations.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vips")
public class Vip {
	
	@Id
    @Column(name = "vip_id", nullable = false)
	private int vipId;
	
    @Column(name = "name", nullable = false)
	private String name;

	
	public Vip() {
	}

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
