package org.horizonefele.webMVC.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team implements Serializable{

	@Id @GeneratedValue
	private Long idTeam;

	@Column(length=100)
	private String name;

	private Float budget;

	public Long getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(Long idTeam) {
		this.idTeam = idTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getBudget() {
		return budget;
	}

	public void setBudget(Float budget) {
		this.budget = budget;
	}

	public Team(Long idTeam, String name, Float budget) {
		super();
		this.idTeam = idTeam;
		this.name = name;
		this.budget = budget;
	}

	public Team(String name, Float budget) {
		super();
		this.name = name;
		this.budget = budget;
	}

	public Team() {
		super();
	} 

	
}
