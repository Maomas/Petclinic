

package be.heh.petclinic.component.owner;

import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class OwnerComponentImpl implements OwnerComponent {

    private JdbcOwnerDao ownerDao;

    public OwnerComponentImpl(DataSource dataSource){
        ownerDao = new JdbcOwnerDao(dataSource);
    }

    @Override
    public Collection<Owner> getOwners() {
        List<Owner> owners = ownerDao.getOwners();
        return owners;
    }

    @Override
    public Collection<Owner> getOwnerByLastName(String lastName) {
        List<Owner> owner = ownerDao.findOwnerByName(lastName);
        return owner;
    }

    public void addOwner(String firstName, String lastName, String address, String city, String telephone) {
        ownerDao.addOwner(firstName, lastName, address, city, telephone);
    }

    @Override
    public void addAnimal(String name, String birthDate, String type, int ownerId) {
        ownerDao.addAnimal(name, birthDate, type, ownerId);
    }


}