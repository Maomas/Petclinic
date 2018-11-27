package be.heh.petclinic.component.pet;

import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.component.specialty.JdbcSpecialtyDao;
import be.heh.petclinic.component.specialty.SpecialtyComponent;
import be.heh.petclinic.domain.*;

class SpecialtyComponentImpl implements SpecialtyComponent {

    private JdbcSpecialtyDao speDao;

    public SpecialtyComponentImpl(DataSource dataSource){
        speDao = new JdbcSpecialtyDao(dataSource);
    }

    @Override
    public Collection<Specialty> getSpecialities() {
        List<Specialty> specialties = speDao.getEvents();
        /*
        specialities.add(new Speciality("radiology",1));
        */

        return specialties;
    }


}