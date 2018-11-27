package be.heh.petclinic.component.visit;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class VisitComponentImpl implements VisitComponent {

    private JdbcVisitDao visitDao;

    public VisitComponentImpl(DataSource dataSource){
        visitDao = new JdbcVisitDao(dataSource);
    }

    @Override
    public Collection<Visit> getVisits() {
        List<Visit> visits = visitDao.getEvents();

        return visits;
    }


}
