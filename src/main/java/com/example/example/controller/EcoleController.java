package com.example.example.controller;

import com.example.example.model.Ecole;
import com.example.example.service.EcoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecole")
public class EcoleController {
    @Autowired
    EcoleService ecoleService;

    @GetMapping("/{id}")
    public ResponseEntity<Ecole> getEcoleById(long id){
        return new ResponseEntity<Ecole>(ecoleService.getEcoleById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ecole> createEcole(@RequestBody Ecole ecole){
        return new ResponseEntity<Ecole>(ecoleService.createEcole(ecole), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Ecole> updateEcole(@RequestBody Ecole ecole){
        return new ResponseEntity<Ecole>(ecoleService.updateEcole(ecole), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteEcole(@Param("id") Long id){
        return new ResponseEntity<Boolean>(ecoleService.deleteEcole(id), HttpStatus.OK);
    }

}
