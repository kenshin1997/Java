package com.springapp.movie.service.characteristics;

import com.springapp.movie.models.characteristics.Characteristics;
import com.springapp.movie.repository.characteristics.CharacteristicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacteristicsService {
    @Autowired
    CharacteristicsRepository characteristicsRepository;

    public void saveCharacteristics (Characteristics characteristics){
        characteristicsRepository.save(characteristics);
    }
}
