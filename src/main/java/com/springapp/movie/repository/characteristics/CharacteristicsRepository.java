package com.springapp.movie.repository.characteristics;

import com.springapp.movie.models.characteristics.Characteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CharacteristicsRepository extends JpaRepository<Characteristics,Long> {
}


