package com.java.springboot.nations.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="languages")
public class Language {
	
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "language_id", nullable = false)
	private Integer lanquageId;
	
    @Column(name = "language", nullable = false)
	private String language;

	
	public Language() {
	}

	public Integer getLanquageId() {
		return lanquageId;
	}

	public void setLanquageId(Integer lanquageId) {
		this.lanquageId = lanquageId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
