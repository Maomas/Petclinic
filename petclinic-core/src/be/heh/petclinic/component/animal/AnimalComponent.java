package be.heh.petclinic.component.animal;

import be.heh.petclinic.domain.Animal;

import java.util.Collection;


public interface AnimalComponent {

    Collection<Animal> getAnimals();
    void addAnimal(String name, String birthdate, String type, int ownerId);
}
