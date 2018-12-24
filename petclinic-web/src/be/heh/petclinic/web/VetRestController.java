package be.heh.petclinic.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

@RestController

public class VetRestController {

	@Autowired
	private VetComponent vetComponentImpl;
    
	@RequestMapping("api/v1/vets")
	public ResponseEntity<Collection<Vet>> getVets(){
	
		Collection<Vet> vets = vetComponentImpl.getVets();
		if(vets.isEmpty()){
			return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Vet>>(vets,HttpStatus.OK);
	}
}