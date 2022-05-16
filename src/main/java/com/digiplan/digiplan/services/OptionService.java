package com.digiplan.digiplan.services;

import com.digiplan.digiplan.entities.Option;

import java.util.List;

public interface OptionService {
    Option addNewOption(Option option);
    Option updateOption(Option option);
    void deleteOption(Long id);
    Option getOptionParId(Long id);
    List<Option> getAllOption();
}
