package be.heh.petclinic.component.animal;
import  be.heh.petclinic.domain.Animal;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class AnimalRowMapper implements RowMapper<Animal> {

    @Override
    public Animal mapRow(ResultSet rs,int i) throws SQLException {
        Animal animal = new Animal();
        animal.setName(rs.getString("name"));
        animal.setBirthDate(rs.getString("birth_date"));
        animal.setType(rs.getString("type"));
        animal.setOwnerId(rs.getInt("owner_id"));
        animal.setVisitDate(rs.getString("MAX(visit_date)"));
        animal.setVisitDescription(rs.getString("description"));

        return animal;
    }


}
