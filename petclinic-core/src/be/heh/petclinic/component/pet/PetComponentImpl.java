package be.heh.petclinic.component.pet;

import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class PetComponentImpl implements PetComponent {

    private JdbcPetDao petDao;

    public PetComponentImpl(DataSource dataSource){
        petDao = new JdbcPetDao(dataSource);
    }

    @Override
    public Collection<Pet> getPets() {
        List<Pet> pets = petDao.getPets();
        return pets;
    }
}
