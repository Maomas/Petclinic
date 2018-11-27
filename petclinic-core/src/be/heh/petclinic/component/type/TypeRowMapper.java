package be.heh.petclinic.component.type;

import  be.heh.petclinic.domain.Type;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class TypeRowMapper implements RowMapper<Type> {

    @Override
    public Type mapRow(ResultSet rs,int i) throws SQLException {
        Type type = new Type();
        type.setId(rs.getInt("id"));
        type.setName(rs.getString("name"));

        return type;
    }


}