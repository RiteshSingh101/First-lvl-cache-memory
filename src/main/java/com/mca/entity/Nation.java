package com.mca.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Nation {
	@Id
	private int nid;
	private String name;
	

	@OneToMany(mappedBy = "nation")
	List<Parties> parties;

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Parties> getParties() {
		return parties;
	}

	public void setParties(List<Parties> parties) {
		this.parties = parties;
	}
	
	
	
}
