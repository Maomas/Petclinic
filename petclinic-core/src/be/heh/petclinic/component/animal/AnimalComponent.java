package be.heh.petclinic.component.animal;

import be.heh.petclinic.domain.Animal;

import java.util.Collection;


public interface AnimalComponent {

    Collection<Animal> getAnimals();
    Collection<Animal> getAnimalsByOwnerId(int ownerId);
}
