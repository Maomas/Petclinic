package be.heh.petclinic.component.animal;

import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class AnimalComponentImpl implements AnimalComponent {

    private JdbcAnimalDao animalDao;

    public AnimalComponentImpl(DataSource dataSource){
        animalDao = new JdbcAnimalDao(dataSource);
    }

    @Override
    public Collection<Animal> getAnimals() {
        List<Animal> animals = animalDao.getAnimals();
        return animals;
    }

    @Override
    public Collection<Animal> getAnimalsByOwnerId(int ownerId) {
        List<Animal> animals = animalDao.getAnimalsByOwnerId(ownerId);
        return animals;   
    }
}
