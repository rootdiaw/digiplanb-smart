package com.digiplan.digiplan.services;

import com.digiplan.digiplan.entities.Option;
import com.digiplan.digiplan.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public Option addNewOption(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public Option updateOption(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public void deleteOption(Long id) {
        optionRepository.deleteById(id);

    }

    @Override
    public Option getOptionParId(Long id) {
        return optionRepository.findById(id).get();
    }

    @Override
    public List<Option> getAllOption() {
        return optionRepository.findAll();
    }
}
