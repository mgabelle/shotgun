package com.emac.gipsi.shotgun.dto;

import java.util.List;

public class ResidenceDto {
	private int id;
	private String name;
	private List<PartieCommuneDto> listePartieCommune;
	
	public List<PartieCommuneDto> getListePartieCommune() {
		return listePartieCommune;
	}
	public void setListePartieCommune(List<PartieCommuneDto> listePartieCommune) {
		this.listePartieCommune = listePartieCommune;
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
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
