package com.example.example.model;

import javax.persistence.*;
import java.util.Set;

/*
Cette annotation @Entity indique via JPa qu'il faut creer une table Ecole dont les
colonnes sont les attributs de la classe.
 */
@Entity
public class Ecole {
    /*
    La premiere annotation Id va indiquer la clé primaire de cette table.
    La seconde dit si elle est générée automatiquement. Ensuite il y a plusieurs stratégies pour les générer,
    on fait ça en précisant la valeur strategy dans l'annotation. Dans notre exemple, on précise que c'est géré automatiquement par auto-incrémentation
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nom;
    private String adresse;
    private String ville;

    /*
    Cette annotation précise que dans notre schéma de base de données qui sera créée, la table Ecole est relié par une relation d'association
    à la table Etudiant. Ici c'est une relation OneToMany car une ecole peut avoir plusieurs etudiants et un etudiant est dans une seule ecole.
     */
    @OneToMany
    Set<Etudiant> etudiants;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}

