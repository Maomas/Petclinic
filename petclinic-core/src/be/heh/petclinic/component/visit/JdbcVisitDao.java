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

    public List<Visit> getVisits() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("visit_date, description FROM visit", new VisitRowMapper());
    }

}