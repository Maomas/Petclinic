package be.heh.petclinic.component.owner;

import be.heh.petclinic.domain.Owner;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

import javax.sql.DataSource;

public class JdbcOwnerDao {

    private DataSource dataSource;

    public JdbcOwnerDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Owner> getEvents() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT owners.id,first_name,last_name,address,city,telephone,GROUP_CONCAT(name) FROM petclinic.owners, petclinic.pets where owners.id = owner_id GROUP BY owners.id;", new OwnerRowMapper());
    }

    public List<Owner> findOwnerByName(String lastName) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT owners.id,first_name,last_name,address,city,telephone,GROUP_CONCAT(name) FROM petclinic.owners, petclinic.pets WHERE owners.last_name = "+lastName, new OwnerRowMapper());
    }

    /*public void addOwner(int id, String firstName, String lastName, String address, String city, String telephone) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        select.query("INSERT INTO owners VALUES ();");
    }*/

    

}