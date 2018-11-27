package be.heh.petclinic.component.type;

import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class TypeComponentImpl implements TypeComponent {

    private JdbcTypeDao typeDao;

    public TypeComponentImpl(DataSource dataSource){
        typeDao = new JdbcTypeDao(dataSource);
    }

    @Override
    public Collection<Type> getTypes() {
        List<Type> types = typeDao.getEvents();
        /*
        types.add(new Vet("dog","1"));
        */

        return types;
    }


}