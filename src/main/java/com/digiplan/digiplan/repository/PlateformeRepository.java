package com.digiplan.digiplan.repository;
import com.digiplan.digiplan.entities.Plateforme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlateformeRepository extends JpaRepository<Plateforme, Long> {

    List<Plateforme> findByNom(String nom);

}
