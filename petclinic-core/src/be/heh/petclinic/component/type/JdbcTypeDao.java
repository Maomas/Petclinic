package be.heh.petclinic.component.type;

import be.heh.petclinic.domain.Type;
import org.springframework.jdbc.core.JdbcTemplate;
import be.heh.petclinic.domain.Vet;
import java.util.List;

import javax.sql.DataSource;

public class JdbcTypeDao {

    private DataSource dataSource;

    public JdbcTypeDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Type> getEvents() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, name FROM types", new TypeRowMapper());
    }

}
