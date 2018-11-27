package be.heh.petclinic.component.visit;

import org.springframework.jdbc.core.JdbcTemplate;
import be.heh.petclinic.domain.Visit;
import java.util.List;

import javax.sql.DataSource;

public class JdbcVisitDao {

    private DataSource dataSource;

    public JdbcVisitDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Visit> getEvents() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, pet_id, visit_date, description FROM visit", new VisitRowMapper());
    }

}