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
        return select.query("SELECT id, pet_id, visit_date, description FROM visits", new VisitRowMapper());
    }

    public int addVisit(int petId, String date, String description) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.update("INSERT INTO visits(pet_id, visit_date, description) VALUES (?, ?, ?)", petId, date, description);
    }

    public List<Visit> getVisitsByPetId(int petId)  {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, pet_id, visit_date, description FROM visits WHERE pet_id = "+petId, new VisitRowMapper());
    }



    

}