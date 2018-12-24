/*
    Une classe qui implémente l'interface RowMapper peut extraire les enregistrement de la base de données
*/
package be.heh.petclinic.component.owner;

import  be.heh.petclinic.domain.Owner;

//Comme pour l'import de JdbcTemplate, l'import n'est pas reconnu, mais RowMapper fonctionne correctement
import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class OwnerRowMapper implements RowMapper<Owner> {

    /*
        L'interface RowMapper définit une méthode appelée mapRow
        Cette méthode prend 2 paramètres :
        - Une instance de ResultSet, càd un tableau des données récupérées depuuis la base de données
        - Un integer correspondant au numéro de ligne

        L'exception SQLException fournit des informations dans le cas où il y a erreur d'accès à la base de données
    */
    @Override
    public Owner mapRow(ResultSet rs,int i) throws SQLException {
        //On déclare une instance d'Owner qui va récupérer comme propriétés les données que l'on a extrait de la base de données
        Owner owner = new Owner();

        //On utilise les setters pour affecter les données aux propriétés de l'instance d'Owner
        owner.setOwnerId(rs.getInt("id"));
        owner.setFirstName(rs.getString("first_name"));
        owner.setLastName(rs.getString("last_name"));
        owner.setAddress(rs.getString("address"));
        owner.setCity(rs.getString("city"));
        owner.setTelephone(rs.getString("telephone"));
        owner.setPets(rs.getString("GROUP_CONCAT(name)"));

        //La méthode retourne l'instance d'Owner pour que celle-ci puisse être utilisée dans les autres classes
        return owner;
    }
}
