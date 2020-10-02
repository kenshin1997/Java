package com.springapp.movie.service.photo;

import com.springapp.movie.models.photo.Photo;
import com.springapp.movie.repository.photo.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;

    public void savePhoto(Photo photo){
        photoRepository.save(photo);
    }
}
