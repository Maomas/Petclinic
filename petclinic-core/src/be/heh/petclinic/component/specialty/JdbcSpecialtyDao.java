package be.heh.petclinic.component.specialty;

import be.heh.petclinic.component.specialty.SpecialtyRowMapper;
import be.heh.petclinic.domain.Specialty;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

import javax.sql.DataSource;

public class JdbcSpecialtyDao {

    private DataSource dataSource;

    public JdbcSpecialtyDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Specialty> getEvents() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, name FROM specialty", new SpecialtyRowMapper());
    }

}
