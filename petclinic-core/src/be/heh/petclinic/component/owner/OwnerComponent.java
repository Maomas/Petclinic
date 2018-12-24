package be.heh.petclinic.component.owner;

import be.heh.petclinic.domain.Owner;

import java.util.Collection;

public interface OwnerComponent {

    Collection<Owner> getOwners();
    Collection<Owner> getOwnerByLastName(String lastName);
    void addOwner(String firstName, String lastName, String address, String city, String telephone);
}
