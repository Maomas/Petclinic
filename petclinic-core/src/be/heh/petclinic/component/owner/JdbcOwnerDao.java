/*
    JdbcTemplate est un mécanisme propre à Spring qui permet de :
    - se connecter à une base de données 
    - exécuter des requêtes SQL
    
*/
package be.heh.petclinic.component.owner;

//On importe la classe Owner pour pouvoir récupérer les méthodes qu'elle contient (ajout, recherche, etc.)
import be.heh.petclinic.domain.Owner;

//Pour une raison inconnue, l'import n'est pas reconnu, mais JdbcTemplate fonctionne quand même
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

import javax.sql.DataSource;

public class JdbcOwnerDao {

    //Un objet qui implémente l'interface DataSource est un moyen d'obtenir une connexion à la base de données
    private DataSource dataSource;

    public JdbcOwnerDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    //Méthode qui permet de récupérer la liste complète des propriétaires ainsi que leurs animaux
    public List<Owner> getOwners() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT owners.id,first_name,last_name,address,city,telephone,GROUP_CONCAT(name) FROM petclinic.owners LEFT JOIN petclinic.pets ON owners.id = owner_id GROUP BY owners.id;", new OwnerRowMapper());
    }

    //Méthode qui permet de retrouver un propriétaire dans la liste avec comme critère de recherche son nom de famille
    public List<Owner> findOwnerByName(String lastName) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT owners.id,first_name,last_name,address,city,telephone,GROUP_CONCAT(name) FROM petclinic.owners INNER JOIN petclinic.pets ON owners.id = owner_id && owners.last_name =" + lastName + " GROUP BY owners.id ;", new OwnerRowMapper());
    }

    //Méthode qui permet de rajouter un propriétaire à la liste 
    public int addOwner(String firstName, String lastName, String address, String city, String telephone) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.update("INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES (?, ?, ?, ?, ?)", firstName, lastName, address, city, telephone);
    }
}