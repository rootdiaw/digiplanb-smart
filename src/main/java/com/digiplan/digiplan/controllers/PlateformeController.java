package com.digiplan.digiplan.controllers;
import com.digiplan.digiplan.entities.Plateforme;
import com.digiplan.digiplan.services.PlateformeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiplateforme")
public class PlateformeController {
    private PlateformeService plateformeService;

    public PlateformeController(PlateformeService plateformeService) {
        super();
        this.plateformeService = plateformeService;
    }

    @GetMapping
    public List<Plateforme> getAllPlateforme(){
        return plateformeService.getAllPlateforme();
    }

    @GetMapping("/id")
    public  Plateforme getPlateformeById(@PathVariable("id") Long id){
        return plateformeService.getPlateformeParId(id);
    }
    @GetMapping("/plateformenom/{nom}")
    public  List<Plateforme> getPlateformeByNom(@PathVariable("nom") String nom){
        return plateformeService.getPlateformeParNom(nom);
    }


    @GetMapping("/plateformearray")
    public  List<Plateforme> getPlateformeByArray(@RequestParam("tab") String tab[]){
        List<Plateforme> plat=new ArrayList<Plateforme>();
        for( String a : tab){
            List<Plateforme> plateformeParNom = plateformeService.getPlateformeParNom(a);
            plat.addAll(plateformeParNom);
        }

        return plat;
    }

    @DeleteMapping("/{id}")
    public void deletePlateformeById(@PathVariable("id") Long id){
        plateformeService.deletePlateforme(id);
    }
    @PostMapping
    public Plateforme addPlateforme(@RequestBody Plateforme plateforme){
        return  plateformeService.addNewPlateforme(plateforme);
    }
    @PutMapping("/{id}")
    public Plateforme updatePlateforme(@PathVariable("id") Long id,@RequestBody Plateforme plateforme){
        Plateforme plat= plateformeService.getPlateformeParId(id);
        plat.setHeurepost(plateforme.getHeurepost());
        plat.setNombrepost(plateforme.getNombrepost());
        plat.setJourpost(plateforme.getJourpost());
        plat.setStyleeditorial(plateforme.getStyleeditorial());
        plat.setContenus(plateforme.getContenus());
        plat.setFormat(plateforme.getFormat());
        plat.setNom(plateforme.getNom());

        return plateformeService.updatePlateforme(plateforme);
    }



}

