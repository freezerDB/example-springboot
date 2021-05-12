package com.example.example.repository;

import com.example.example.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Cette annotation repository précise que cet objet est utilsé dans Jpa dans le but d'implementer une repository.
Pour chaque interface repository, il faut l'etendre avec l'interface JpaRepository<T, ID>, T c'est l'entité concerné dans tes tables, ID c'est le type
de la clé primaire.
 */
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // cette méthode va être implementée directement grâce au nom de la méthode et arguments donnés en entrée.
    public Etudiant findEtudiantById(Long id);

    /*
    Il faut noter aussi que les methode delete, deleteById, save (pour creer et modifier) seront générées de base et donc inutile de le redefinir;
     */


}
