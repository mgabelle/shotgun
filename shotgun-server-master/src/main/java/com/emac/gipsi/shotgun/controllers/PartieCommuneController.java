package com.emac.gipsi.shotgun.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emac.gipsi.shotgun.dto.PartieCommuneDto;
import com.emac.gipsi.shotgun.dto.PartieCommuneShotgunDto;
import com.emac.gipsi.shotgun.services.IPartieCommuneService;

@CrossOrigin
@RequestMapping("/parties-communes")
@RestController
public class PartieCommuneController {
	@Autowired
	private IPartieCommuneService partieCommuneService;

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<PartieCommuneShotgunDto> getPartiesCommunnes() {
		return this.partieCommuneService.getPartiesCommunes();
	}
	
	@RequestMapping(path = "/shotguns", method = RequestMethod.GET)
	public List<PartieCommuneDto> getPartiesCommunesWithShotguns() {
		return this.partieCommuneService.getPartiesCommunesWithShotguns();
	}
	
	@RequestMapping(path = "/dispo/{date}", method = RequestMethod.GET)
	public List<PartieCommuneShotgunDto> getPartiesCommunesDisponibles(@PathVariable("date") Date date) {
		return this.partieCommuneService.getPartiesCommunesDisponibles(date);
	}
}
