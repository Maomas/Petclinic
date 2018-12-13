package be.heh.petclinic.component.pet;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import be.heh.petclinic.domain.Pet;

public class JdbcPetDao {

    private DataSource dataSource;

    public JdbcPetDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Pet> getPets() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT name, birth_date, owner_id, type_id FROM pets", new PetRowMapper());
    }

}