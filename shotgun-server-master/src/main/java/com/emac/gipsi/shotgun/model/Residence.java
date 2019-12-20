package com.emac.gipsi.shotgun.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Residence")
public class Residence {
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;

	@Column
	private String name;

	public Set<PartieCommune> getListePartieCommune() {
		return listePartieCommune;
	}

	public void setListePartieCommune(Set<PartieCommune> listePartieCommune) {
		this.listePartieCommune = listePartieCommune;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn(name = "localisation")
	private Set<PartieCommune> listePartieCommune = new HashSet<PartieCommune>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the nomResidence to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
