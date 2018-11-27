package be.heh.petclinic.component.owner;

import  be.heh.petclinic.domain.Owner;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class OwnerRowMapper implements RowMapper<Owner> {

    @Override
    public Owner mapRow(ResultSet rs,int i) throws SQLException {
        Owner owner = new Owner();
        owner.setOwnerId(rs.getInt("id"));
        owner.setFirstName(rs.getString("first_name"));
        owner.setLastName(rs.getString("last_name"));
        owner.setAddress(rs.getString("address"));
        owner.setCity(rs.getString("city"));
        owner.setTelephone(rs.getString("telephone"));


        return owner;
    }


}
