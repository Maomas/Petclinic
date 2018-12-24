package be.heh.petclinic.web;

import java.util.Collection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import be.heh.petclinic.component.owner.OwnerComponent;
import be.heh.petclinic.domain.Owner;

import java.util.List;
import java.util.Collection;

@RestController
public class OwnerRestController {

	@Autowired
	private OwnerComponent ownerComponentImpl;
    
	@RequestMapping("api/v1/owners")
	public ResponseEntity<Collection<Owner>> getOwners(){
	
		Collection<Owner> owners = ownerComponentImpl.getOwners();
		if(owners.isEmpty()){
			return new ResponseEntity<Collection<Owner>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Owner>>(owners,HttpStatus.OK);
	}

	@RequestMapping(value = "api/v1/owners/{lastName}", method = RequestMethod.GET)
	public ResponseEntity<Collection<Owner>> getOwnerByLastName(@PathVariable("lastName") String lastName){
		Collection<Owner> owner = ownerComponentImpl.getOwnerByLastName(lastName);
		if(owner.isEmpty()) return new ResponseEntity<Collection<Owner>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Collection<Owner>>(owner,HttpStatus.OK);
	}

	@RequestMapping(value = "api/v1/owners/add", method = RequestMethod.GET)
	@ResponseBody
	public String addOwner(@RequestParam("id") int id, 
	@RequestParam("firstName") String firstName, 
	@RequestParam("lastName") String lastName, 
	@RequestParam("address") String address, 
	@RequestParam("city") String city, 
	@RequestParam("telephone") String telephone){
		ownerComponentImpl.addOwner(id,firstName,lastName,address,city,telephone);
		return "L'utilisateur "+firstName+" "+lastName+" a bien été ajouté.";
	}  

	
}