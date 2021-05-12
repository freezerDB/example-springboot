package com.example.example.service;

import com.example.example.model.Etudiant;

public interface EtudiantService {
    public Etudiant getEtudiantById(Long id);
    public Etudiant createEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public Boolean deleteEtudiant(Long id);
}
