package be.heh.petclinic.component.visit;

import be.heh.petclinic.domain.Visit;
import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class VisitRowMapper implements RowMapper<Visit> {

    @Override
    public Visit mapRow(ResultSet rs,int i) throws SQLException {
        Visit visit = new Visit();
        visit.setId(rs.getInt("id"));
        visit.setAnimalId(rs.getInt("pet_id"));
        visit.setDate(rs.getString("visit_date"));
        visit.setDescription(rs.getString("description"));

        return visit;
    }


}