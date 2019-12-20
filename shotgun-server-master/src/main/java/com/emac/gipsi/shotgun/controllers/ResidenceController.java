package com.emac.gipsi.shotgun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emac.gipsi.shotgun.dto.PartieCommuneShotgunDto;
import com.emac.gipsi.shotgun.services.IResidenceService;



@CrossOrigin
@RequestMapping("/residences")
@RestController
public class ResidenceController {
//	@Autowired
//	private IResidenceService residenceService;
//	
//	@RequestMapping(path = "", method = RequestMethod.GET)
//	public List<PartieCommuneShotgunDto> getFamilies() {
//		return residenceService.;
//	}
//
//	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
//	public ResidenceShotgunDto getFamilleById(@PathVariable("id") int id) {
//		return residenceService.getFamille(id);
//	}
//	
//	@RequestMapping(path ="/shotguns", method = RequestMethod.GET)
//	public List<ResidenceDto> getFamiliesWithShotguns() {
//		return residenceService.getFamillesWithShotguns();
//	}

}
