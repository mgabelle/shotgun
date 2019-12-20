package com.emac.gipsi.shotgun.services;

import java.util.Date;
import java.util.List;

import com.emac.gipsi.shotgun.dto.FamilleDto;
import com.emac.gipsi.shotgun.dto.FamilleShotgunDto;
import com.emac.gipsi.shotgun.dto.PartieCommuneShotgunDto;

public interface IFamilleService {
	public List<FamilleShotgunDto> getFamilles();

	public FamilleShotgunDto getFamille(int id);
	
	public List<FamilleShotgunDto> getFamillesDisponibles(Date dateDispo);

	
	public List<FamilleDto> getFamillesWithShotguns();
}
