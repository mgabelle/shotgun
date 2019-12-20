package com.emac.gipsi.shotgun.services.impl;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emac.gipsi.shotgun.dto.PartieCommuneDto;
import com.emac.gipsi.shotgun.dto.PartieCommuneShotgunDto;
import com.emac.gipsi.shotgun.dto.ShotgunDto;
import com.emac.gipsi.shotgun.repositories.PartieCommuneRepository;
import com.emac.gipsi.shotgun.services.IPartieCommuneService;

@Service("partieCommuneService")
@Transactional
public class PartieCommuneService implements IPartieCommuneService {
	@Autowired
	private final PartieCommuneRepository partieCommuneRepository;

	private final ModelMapper modelMapper = new ModelMapper();

	public PartieCommuneService(PartieCommuneRepository partieCommuneRepository) {
		this.partieCommuneRepository = partieCommuneRepository;
	}
	@Override
	public List<PartieCommuneShotgunDto> getPartiesCommunes() {
		Type listType = new TypeToken<List<PartieCommuneShotgunDto>>() {}.getType();
		List<PartieCommuneShotgunDto> result = modelMapper.map(partieCommuneRepository.findAll(), listType);
		return result;
	}

	@Override
	public List<PartieCommuneShotgunDto> getPartiesCommunesDisponibles(Date dateDispo) {
		List<PartieCommuneDto> pcShotguns = this.getPartiesCommunesWithShotguns();
		List<PartieCommuneShotgunDto> result = this.getPartiesCommunes();
		
		for(PartieCommuneDto pcShotgun : pcShotguns) {
			for(ShotgunDto shotgun : pcShotgun.getListeShotguns()) {
				if (shotgun.getShotgunDate().compareTo(dateDispo)==0){
					result.removeIf(pc -> pc.getId() == pcShotgun.getId());
				}
			}
			
		}
		return result;
		
	}
	@Override
	public List<PartieCommuneDto> getPartiesCommunesWithShotguns() {
		Type listType = new TypeToken<List<PartieCommuneDto>>() {}.getType();
		List<PartieCommuneDto> result = modelMapper.map(partieCommuneRepository.findAll(), listType);
		return result;
	}

}
