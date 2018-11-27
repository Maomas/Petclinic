package be.heh.petclinic.component.specialty;
import  be.heh.petclinic.domain.Specialty;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SpecialtyRowMapper implements RowMapper<Specialty> {

    @Override
    public Specialty mapRow(ResultSet rs,int i) throws SQLException {
        Specialty spe = new Specialty();
        spe.setName(rs.getString("name"));
        spe.setId(rs.getInt("id"));

        return spe;
    }


}

