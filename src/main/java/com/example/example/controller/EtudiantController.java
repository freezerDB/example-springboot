package com.example.example.controller;

import com.example.example.model.Etudiant;
import com.example.example.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@Param("id") Long id){
        return new ResponseEntity<Etudiant>(etudiantService.getEtudiantById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiant){
        return new ResponseEntity<Etudiant>(etudiantService.createEtudiant(etudiant), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Etudiant> updateEtudiant(@RequestBody Etudiant etudiant){
        return new ResponseEntity<Etudiant>(etudiantService.updateEtudiant(etudiant), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> createEtudiant(@Param("id") Long id){
        return new ResponseEntity<Boolean>(etudiantService.deleteEtudiant(id), HttpStatus.OK);
    }

}
