package com.digiplan.digiplan.services;

import com.digiplan.digiplan.entities.Plateforme;

import java.util.List;

public interface PlateformeService {
    Plateforme addNewPlateforme(Plateforme platefomre);
    Plateforme updatePlateforme(Plateforme platefomre);
    void deletePlateforme(Long id);
    Plateforme getPlateformeParId(Long id);
    List<Plateforme> getAllPlateforme();

    List<Plateforme> getPlateformeParNom(String nom);
}
