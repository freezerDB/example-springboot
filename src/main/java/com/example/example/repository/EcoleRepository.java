package com.example.example.repository;

import com.example.example.model.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole, Long> {
    public Ecole findEcoleById(Long id);
    /*
    On peut définir une méthode en précisant la requête à effectuer
    via l'annotion @Query. A noter que Jpa va s'occuper d'instancier les objets et retournes la liste d'objets.
    Le language par defaut utilisé ici est le JpSQL qui vient avec Jpa et qui permet de selectionner plus facilement les objets.
    Mais on peut aussi ecrire du bon vieux sql natif, il faudra ajouter à l'annotation l'argument native_query dont la valeur sera true.
    Exemple: @Query(value = "select e from Ecole e where e.ville =: loc ")
             List<Ecole> ....{signature fonction}
     */

}
