package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.Pet;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

import javax.sql.DataSource;

public class JdbcPetDao {

    private DataSource dataSource;

    public JdbcPetDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Pet> getEvents() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT name, birth_date, owner_id, type_id FROM pets", new PetRowMapper());
    }

}