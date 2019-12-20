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
import com.emac.gipsi.shotgun.dto.ResidenceDto;
import com.emac.gipsi.shotgun.model.Residence;
import com.emac.gipsi.shotgun.repositories.ResidenceRepository;
import com.emac.gipsi.shotgun.services.IResidenceService;

@Service("residenceService")
@Transactional
public class ResidenceService implements IResidenceService {

	@Autowired
	private ResidenceRepository residenceRepository;
	
	private final ModelMapper modelMapper = new ModelMapper();
	
	public ResidenceService(ResidenceRepository residenceRepository) {
		this.residenceRepository = residenceRepository;
	}
	
	@Override
	public List<ResidenceDto> getResidences() {
		// TODO Auto-generated method stub
		Type listType = new TypeToken<List<ResidenceDto>>() {}.getType();
		List<ResidenceDto> result = modelMapper.map(residenceRepository.findAll(), listType);
		return result;
	}
	
	

}
