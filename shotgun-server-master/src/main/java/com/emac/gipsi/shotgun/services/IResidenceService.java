package com.emac.gipsi.shotgun.services;

import java.util.Date;
import java.util.List;

import com.emac.gipsi.shotgun.dto.FamilleDto;
import com.emac.gipsi.shotgun.dto.FamilleShotgunDto;
import com.emac.gipsi.shotgun.dto.PartieCommuneDto;
import com.emac.gipsi.shotgun.dto.PartieCommuneShotgunDto;
import com.emac.gipsi.shotgun.dto.ResidenceDto;
import com.emac.gipsi.shotgun.model.Residence;

public interface IResidenceService {
	public List<ResidenceDto> getResidences();

	public List<ResidenceDto> getResidencesDisponibles(int id);
	
	public List<ResidenceDto> getResidencesWithShotguns();
}
