package com.digiplan.digiplan.services;

import com.digiplan.digiplan.entities.Plateforme;
import com.digiplan.digiplan.repository.PlateformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlateformeServiceImpl  implements  PlateformeService{

    @Autowired
    private PlateformeRepository plateformeRepository;
    @Override
    public Plateforme addNewPlateforme(Plateforme platefomre) {
        return plateformeRepository.save(platefomre);
    }

    @Override
    public Plateforme updatePlateforme(Plateforme platefomre) {
        return plateformeRepository.save(platefomre);
    }

    @Override
    public void deletePlateforme(Long id) {
        plateformeRepository.deleteById(id);

    }

    @Override
    public Plateforme getPlateformeParId(Long id) {
        return plateformeRepository.findById(id).get();
    }

    @Override
    public List<Plateforme> getAllPlateforme() {
        return plateformeRepository.findAll();
    }

    @Override
    public List<Plateforme> getPlateformeParNom(String nom) {
        return plateformeRepository.findByNom(nom);
    }

}
