package com.example.example.service;

import com.example.example.model.Ecole;
import com.example.example.repository.EcoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcoleServiceImpl implements EcoleService{

    @Autowired
    private EcoleRepository ecoleRepository;

    @Override
    public Ecole getEcoleById(Long id) {
        return ecoleRepository.findEcoleById(id);
    }

    @Override
    public Ecole createEcole(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public Ecole updateEcole(Ecole ecole) {
        return ecoleRepository.save(ecole);
    }

    @Override
    public Boolean deleteEcole(Long id) {
        if (ecoleRepository.existsById(id)){
            ecoleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
