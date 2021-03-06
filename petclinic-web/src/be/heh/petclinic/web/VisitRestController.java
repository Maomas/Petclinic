package be.heh.petclinic.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import be.heh.petclinic.component.visit.VisitComponent;
import be.heh.petclinic.domain.Visit;

@RestController

public class VisitRestController {

	@Autowired
	private VisitComponent visitComponentImpl;
    
	@RequestMapping("api/v1/visits")
	public ResponseEntity<Collection<Visit>> getVisits(){
		
		Collection<Visit> visits = visitComponentImpl.getVisits();
		if(visits.isEmpty()){
			return new ResponseEntity<Collection<Visit>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Visit>>(visits,HttpStatus.OK);
	}

	@RequestMapping(value = "api/v1/visits/{id}", method = RequestMethod.GET)
	public ResponseEntity<Visit> addVisit(@PathVariable("id") int id,
	@RequestParam("date") String date,
	@RequestParam("description") String description){
		visitComponentImpl.addVisit(id, date, description);
		return new ResponseEntity<Visit>(HttpStatus.CREATED);
	}

	@RequestMapping("api/v1/visits/bypet/{petId}")
	public ResponseEntity<Collection<Visit>> getVisitsByPetId(@PathVariable("petId") int petId){
		Collection<Visit> visits = visitComponentImpl.getVisitsByPetId(petId);
		if(visits.isEmpty()){
			return new ResponseEntity<Collection<Visit>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Visit>>(visits, HttpStatus.OK);
	}

	
}