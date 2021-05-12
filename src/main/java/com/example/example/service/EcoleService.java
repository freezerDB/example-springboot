package com.example.example.service;

import com.example.example.model.Ecole;

import java.util.List;

public interface EcoleService {
    public Ecole getEcoleById(Long id);
    public Ecole createEcole(Ecole ecole);
    public Ecole updateEcole(Ecole ecole);
    public Boolean deleteEcole(Long id);
}
