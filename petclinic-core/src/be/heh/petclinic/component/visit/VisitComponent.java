package be.heh.petclinic.component.visit;

import be.heh.petclinic.domain.Visit;

import java.util.Collection;

public interface VisitComponent{

    Collection<Visit> getVisits();
    void addVisit(int petId, String date, String description);
    //Collection<Visit> getVisitsByPetId(int petId);

}