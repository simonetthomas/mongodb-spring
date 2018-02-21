package dta.formation.mongodbspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dta.formation.mongodbspring.entites.Formation;
import dta.formation.mongodbspring.repository.FormationRepository;

@RestController
@RequestMapping("/formations")
public class FormationApiController {

	@Autowired private FormationRepository formationRepo;
	
	/**
	 * @return a list containing all the formations
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation>listerFormations(){
		return this.formationRepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void SaveFormation(@RequestBody Formation f) {
		this.formationRepo.save(f);
	}
}
