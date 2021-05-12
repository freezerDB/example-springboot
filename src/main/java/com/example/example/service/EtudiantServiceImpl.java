package com.example.example.service;

import com.example.example.model.Etudiant;
import com.example.example.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Cette annotation spécifie qu'on a une classe service.
 */
@Service
public class EtudiantServiceImpl implements EtudiantService{
    /*
    Cette annotion effectue tout simplement une injection de dépendances. Ce n'est rien d'autre que le fait de trouver la classe générée
    ayant implémentée etudiantRepository et l'instancier en tant que singleton.
     */
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findEtudiantById(id);
    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Boolean deleteEtudiant(Long id) {
        if (etudiantRepository.existsById(id)){
            etudiantRepository.deleteById(id);
            return true;
        }
        return false ;
    }
}
