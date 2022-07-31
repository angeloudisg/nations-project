package com.java.springboot.nations.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guests")
public class Guest {

	@Id
	@Column(name = "guest_id", nullable = false)
	private Integer guestId;

	@Column(name = "name", nullable = false)
	private String name;

	public Guest() {
	}

	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
