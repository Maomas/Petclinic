package be.heh.petclinic.component.animal;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import be.heh.petclinic.domain.Animal;

public class JdbcAnimalDao {

    private DataSource dataSource;

    public JdbcAnimalDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Animal> getAnimals() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT name, birth_date, type, owner_id FROM pets", new AnimalRowMapper());
    }

    public List<Animal> getAnimalsByOwnerId(int ownerId)  {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT name, birth_date, type, owner_id FROM pets WHERE owner_id = "+ownerId, new AnimalRowMapper());
    }

}