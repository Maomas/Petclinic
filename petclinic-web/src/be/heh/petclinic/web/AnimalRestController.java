package be.heh.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.heh.petclinic.component.animal.AnimalComponent;
import be.heh.petclinic.domain.Animal;

@RestController
public class AnimalRestController {

	@Autowired
	private AnimalComponent animalComponentImpl;
    
	/*@RequestMapping("api/v1/pets")
	public ResponseEntity<Collection<Pet>> getPets(){
	
		Collection<Pet> pets = petComponentImpl.getPets();
		if(pets.isEmpty()){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Pet>>(pets,HttpStatus.OK);
	}*/

	
}