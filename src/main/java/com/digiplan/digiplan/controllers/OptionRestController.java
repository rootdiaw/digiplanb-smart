package com.digiplan.digiplan.controllers;

import com.digiplan.digiplan.entities.Option;
import com.digiplan.digiplan.services.OptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apioption")
public class OptionRestController {

    private OptionService optionService;

    public OptionRestController(OptionService optionService) {
        super();
        this.optionService = optionService;
    }

    @GetMapping
    public List<Option> getAllOption(){
        return optionService.getAllOption();
    }

    @GetMapping("/{id}")
    public  Option getOptionById(@PathVariable("id") Long id){
        return optionService.getOptionParId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOptionById(@PathVariable("id") Long id){
        optionService.deleteOption(id);
    }
    @PostMapping
    public Option addOption(@RequestBody Option option){
        return  optionService.addNewOption(option);
    }
    @PutMapping("/{id}")
    public Option updateOption(@PathVariable("id") Long id,@RequestBody Option option){
        Option opt= optionService.getOptionParId(id);

        opt.setObjectifmacrom(option.getObjectifmacrom());
        opt.setPlateformes(option.getPlateformes());

        return optionService.updateOption(option);
    }
}
