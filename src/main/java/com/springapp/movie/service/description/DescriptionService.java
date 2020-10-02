package com.springapp.movie.service.description;

import com.springapp.movie.models.description.Description;
import com.springapp.movie.repository.description.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {
    @Autowired
    DescriptionRepository descriptionRepository;

    public void saveDescription(Description description){
        descriptionRepository.save(description);
    }
}
